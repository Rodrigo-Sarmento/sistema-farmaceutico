
package DAO;

import conexao.ConexaoMysql;
import java.util.ArrayList;
import model.ModelProduto;


/**
 *
 * @author Rodrigo Sarmento
 */
public class DAOProduto extends ConexaoMysql{
/**
 * cadastrar um produto no banco
 * @param pModelProduto
 * @return 
 */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try{
            this.conectar();
            return this.insertSQL("INSERT INTO produtos("
                    + "pro_nome,"
                    + "pro_valor_custo,"
                    + "pro_valor_venda,"
                    + "pro_quantidade)"
                    + "VALUES("
                    + "'"+pModelProduto.getNome()+"',"
                    + "'"+pModelProduto.getValorCusto()+"',"
                    + "'"+pModelProduto.getValorVenda()+"',"
                    + "'"+pModelProduto.getQuantidade()+"'"
                    + ");");
            
        }catch(Exception e){
            System.out.println("ERRO:1 "+e);
            return 0;
            
        }finally{
            this.fecharConexao();
    }
        
    }
    /**
     * retornar uma lista de produtos
     * @return 
     */
    public ArrayList<ModelProduto> retornarListaProdutosDAO(){
        ModelProduto modelProduto = new ModelProduto();
        ArrayList<ModelProduto> listaModelProduto = new ArrayList<ModelProduto>();
        try{
            this.conectar();
            this.executarSQL("SELECT * FROM produtos;");
            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setValorCusto(this.getResultSet().getDouble(3));
                modelProduto.setValorVenda(this.getResultSet().getDouble(4));
                modelProduto.setQuantidade(this.getResultSet().getInt(5));
                listaModelProduto.add(modelProduto);
            }
            
        }catch(Exception e){
            System.out.println("Erro:2"+e);
            
        }finally{
            this.fecharConexao();
        }
        return listaModelProduto;
    }
    
/**
 * excluir um produto no banco
 * @param codigo
 * @return 
 */
    public boolean excluirProdutoDAO(int codigo) {
        try{
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM produtos WHERE pro_id='"+codigo+"'");
            
        }catch(Exception e){
            System.out.println("ERRO:3 "+e);
            return false;
            
        }finally{
            this.fecharConexao();
        }
    }
/**
 * retorna um produto pelo código do banco
 * @param codigo
 * @return 
 */
    public ModelProduto retornarProdutoDAO(int codigo) {
        ModelProduto modelProduto = new ModelProduto();
        
        try{
            this.conectar();
            this.executarSQL("SELECT * FROM produtos WHERE pro_id='"+codigo+"'");
            
        while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setValorCusto(this.getResultSet().getDouble(3));
                modelProduto.setValorVenda(this.getResultSet().getDouble(4));
                modelProduto.setQuantidade(this.getResultSet().getInt(5));

            }
        }catch(Exception e){
            System.out.println("ERRO:4 "+e);
  
            }finally{
                this.fecharConexao();
            
        }
        return modelProduto;   
    }   

    /**
     * atualiza a tela de acordo com os dados do banco atual
     * @param modelProduto
     * @return 
     */
    public boolean atualizarProdutoDAO(ModelProduto modelProduto) {
        try{
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE produtos SET "
                    + "pro_nome='"+modelProduto.getNome()+"',"
                    + "pro_valor_custo='"+modelProduto.getValorCusto()+"',"
                    + "pro_valor_venda='"+modelProduto.getValorVenda()+"',"
                    + "pro_quantidade='"+modelProduto.getQuantidade()+"'"
                    + " WHERE pro_id='"+modelProduto.getId()+"';"
                    + "");
            
        }catch(Exception e){
            System.out.println("ERRO:5 "+e);
            return false;
        }finally{
            this.fecharConexao();
        }
        
    }

   
    /**
    * recupera Cliente
    * @param pNomeCliente
    * return ModelCliente
    */
    public ModelProduto getProdutoNomeDAO(String pNomeProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pro_id,"
                    + "pro_nome,"
                    + "pro_quantidade,"
                    + "pro_valor_custo,"
                    + "pro_valor_venda"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " pro_nome = '" + pNomeProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setQuantidade(this.getResultSet().getInt(3));
                modelProduto.setValorCusto(this.getResultSet().getDouble(4));
                modelProduto.setValorVenda(this.getResultSet().getDouble(5));
     
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * alterar quantidade de produtos no banco
     * @param pListaModelProduto
     * @return 
     */
    public boolean atualizarProdutoDAO(ArrayList<ModelProduto> pListaModelProduto) {
        try{
        this.conectar();
        for(int i = 0;i<pListaModelProduto.size();i++){
            return this.executarUpdateDeleteSQL("UPDATE produtos SET "
                    + "pro_quantidade='"+pListaModelProduto.get(i).getQuantidade()+"'"
                    + " WHERE pro_id='"+pListaModelProduto.get(i).getId()+"';"
                    + "");
            }
            return true;
        }catch(Exception e){
            System.out.println("ERRO:5 "+e);
            return false;
        }finally{
            this.fecharConexao();
        }
        
    }

 }

   


    
    

