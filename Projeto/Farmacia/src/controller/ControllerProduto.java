
package controller;

import DAO.DAOProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Rodrigo Sarmento
 */
public class ControllerProduto {
    
    private DAOProduto daoProduto = new DAOProduto();
    
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
}   

    public ArrayList<ModelProduto> retornarProdutosController() {
        return this.daoProduto.retornarListaProdutosDAO();
    }

    public boolean excluirProdutoController(int codigo) {
        return this.daoProduto.excluirProdutoDAO(codigo);
    }

    public ModelProduto retornarProdutoController(int codigo) {
        return this.daoProduto.retornarProdutoDAO(codigo);
    }

    public boolean atualizarProdutoController(ModelProduto modelProduto) {
        return this.daoProduto.atualizarProdutoDAO(modelProduto);
    }

    public ModelProduto getProdutoControllerNome(String pNomeProduto) {
        return this.daoProduto.getProdutoNomeDAO(pNomeProduto);
    }
    
    public boolean atualizarProdutoController(ArrayList<ModelProduto> pListaModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pListaModelProduto);
    }
   
}
