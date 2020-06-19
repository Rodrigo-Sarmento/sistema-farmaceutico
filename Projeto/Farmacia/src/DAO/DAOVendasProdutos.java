package DAO;

import model.ModelVendasProdutos;
import conexao.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author Rodrigo Sarmento
*/
public class DAOVendasProdutos extends ConexaoMysql {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas_produtos ("
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getVendas() + "',"
                    + "'" + pModelVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelVendasProdutos.getVenProQuantidade() + "'"
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
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProduto){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                 + " FROM"
                     + " vendas_produtos"
                 + " WHERE"
                     + " id_vendas_produtos = '" + pIdVendaProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(3));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                 + " FROM"
                     + " vendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(3));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(4));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas_produtos SET "
                    + "id_vendas_produtos = '" + pModelVendasProdutos.getIdVendaProduto() + "',"
                    + "fk_produtos = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelVendasProdutos.getVenProValor() + "',"
                    + "ven_pro_quantidade = '" + pModelVendasProdutos.getVenProQuantidade() + "'"
                + " WHERE "
                    + "id_vendas_produtos = '" + pModelVendasProdutos.getIdVendaProduto() + "'"
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
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutosDAO(int pIdVendaProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas_produtos "
                + " WHERE "
                    + "fk_vendas = '" + pIdVendaProduto + "'"
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
 * salva uma lista de produtos da venda
 * @param pListaModelVendasProdutos
 * @return 
 */
    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        try {
        this.conectar();
        int cont = pListaModelVendasProdutos.size();
        for(int i = 0; i<cont ; i++){
            this.insertSQL(
                "INSERT INTO vendas_produtos ("
                    + "fk_produtos,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                + ") VALUES ("
                    + "'" + pListaModelVendasProdutos.get(i).getProduto() + "',"
                    + "'" + pListaModelVendasProdutos.get(i).getVendas() + "',"
                    + "'" + pListaModelVendasProdutos.get(i).getVenProValor() + "',"
                    + "'" + pListaModelVendasProdutos.get(i).getVenProQuantidade() + "'"
                + ");"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}