package DAO;

import model.ModelCliente;
import conexao.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author Rodrigo Sarmento
*/
public class DAOCliente extends ConexaoMysql {

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cliente ("
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_telefone"
                + ") VALUES ("
                    + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliEstado() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * return ModelCliente
    */
    public ModelCliente getClienteDAO(int pIdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " cliente"
                 + " WHERE"
                     + " id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliEstado(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    /**
    * recupera Cliente
    * @param pNomeCliente
    * return ModelCliente
    */
    public ModelCliente getClientenomeDAO(String pNomeCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " cliente"
                 + " WHERE"
                     + " cli_nome = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliEstado(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }


    /**
    * recupera uma lista de Cliente
        * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliEstado(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE cliente SET "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_estado = '" + pModelCliente.getCliEstado() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_telefone = '" + pModelCliente.getCliTelefone() + "'"
                + " WHERE "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM cliente "
                + " WHERE "
                    + "id_cliente = '" + pIdCliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}