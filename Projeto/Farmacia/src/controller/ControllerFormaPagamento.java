package controller;

import model.ModelFormaPagamento;
import DAO.DAOFormaPagamento;
import java.util.ArrayList;

/**
*
* @author Rodrigo Sarmento
*/
public class ControllerFormaPagamento {

    private DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * return int
    */
    public int salvarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pIdForPag
    * return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(int pIdForPag){
        return this.daoFormaPagamento.getFormaPagamentoDAO(pIdForPag);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pIdForPag
    * return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoController(){
        return this.daoFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * return boolean
    */
    public boolean atualizarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pIdForPag
    * return boolean
    */
    public boolean excluirFormaPagamentoController(int pIdForPag){
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pIdForPag);
    }
}