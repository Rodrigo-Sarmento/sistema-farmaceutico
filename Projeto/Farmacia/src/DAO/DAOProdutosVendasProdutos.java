
package DAO;

import conexao.ConexaoMysql;
import java.util.ArrayList;
import model.ModelProduto;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author Rodrigo Sarmento
 */
public class DAOProdutosVendasProdutos extends ConexaoMysql{
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda){
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProduto modelProdutos = new ModelProduto();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try{
            this.conectar();
            this.executarSQL("SELECT "
                    + "produtos.pro_id, "
                    + "produtos.pro_quantidade, "
                    + "produtos.pro_nome, "
                    + "produtos.pro_valor_venda, "
                    + "vendas_produtos.fk_produtos, "
                    + "vendas_produtos.fk_vendas, "
                    + "vendas_produtos.id_vendas_produtos, "
                    + "vendas_produtos.ven_pro_quantidade, "
                    + "vendas_produtos.ven_pro_valor "
                    + "FROM vendas_produtos "
                    + "INNER JOIN produtos ON produtos.pro_id = vendas_produtos.fk_produtos "
                    + "WHERE vendas_produtos.fk_vendas = '"+pCodigoVenda+"';"
                    );
                while(this.getResultSet().next()){
                    modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                    modelProdutos = new ModelProduto();
                    modelVendasProdutos = new ModelVendasProdutos();
                    
                    modelProdutos.setId(this.getResultSet().getInt(1));
                    modelProdutos.setQuantidade(this.getResultSet().getInt(2));
                    modelProdutos.setNome(this.getResultSet().getString(3));
                    modelProdutos.setValorVenda(this.getResultSet().getDouble(4));
                    
                    modelVendasProdutos.setProduto(this.getResultSet().getInt(5));
                    modelVendasProdutos.setVendas(this.getResultSet().getInt(6));
                    modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(7));
                    modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(8));
                    modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(9));
                    
                    modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
                    modelProdutosVendasProdutos.setModelProduto(modelProdutos);
                    
                    listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
                }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }
    
}
