
package DAO;

import conexao.ConexaoMysql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 *
 * @author Rodrigo Sarmento
 */
public class DAOVendasCliente extends ConexaoMysql{
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO(){
        ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente ();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + ""
                 + " FROM"
                     + " vendas INNER JOIN cliente "
                     + "ON cliente.id_cliente = vendas.fk_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliEstado(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listaModelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
}
