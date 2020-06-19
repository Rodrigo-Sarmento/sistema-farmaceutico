package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;

/**
*
* @author Rodrigo Sarmento
*/
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pIdVendas
    * return ModelVendas
    */
    public ModelVendas getVendasController(int pIdVendas){
        return this.daoVendas.getVendasDAO(pIdVendas);
    }

    /**
    * recupera uma lista deVendas
    * @param pIdVendas
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pIdVendas
    * return boolean
    */
    public boolean excluirVendasController(int pIdVendas){
        return this.daoVendas.excluirVendasDAO(pIdVendas);
    }
}