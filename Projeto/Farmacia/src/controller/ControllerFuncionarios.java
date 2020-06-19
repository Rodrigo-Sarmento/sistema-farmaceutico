package controller;

import model.ModelFuncionarios;
import DAO.DAOFuncionarios;
import java.util.ArrayList;

/**
*
* @author Rodrigo Sarmento
*/
public class ControllerFuncionarios {

    private DAOFuncionarios daoFuncionarios = new DAOFuncionarios();

    /**
    * grava Funcionarios
    * @param pModelFuncionarios
    * return int
    */
    public int salvarFuncionariosController(ModelFuncionarios pModelFuncionarios){
        return this.daoFuncionarios.salvarFuncionariosDAO(pModelFuncionarios);
    }

    /**
    * recupera Funcionarios
    * @param pIdFun
    * return ModelFuncionarios
    */
    public ModelFuncionarios getFuncionariosController(int pIdFun){
        return this.daoFuncionarios.getFuncionariosDAO(pIdFun);
    }

    /**
    * recupera uma lista deFuncionarios
    * @param pIdFun
    * return ArrayList
    */
    public ArrayList<ModelFuncionarios> getListaFuncionariosController(){
        return this.daoFuncionarios.getListaFuncionariosDAO();
    }

    /**
    * atualiza Funcionarios
    * @param pModelFuncionarios
    * return boolean
    */
    public boolean atualizarFuncionariosController(ModelFuncionarios pModelFuncionarios){
        return this.daoFuncionarios.atualizarFuncionariosDAO(pModelFuncionarios);
    }

    /**
    * exclui Funcionarios
    * @param pIdFun
    * return boolean
    */
    public boolean excluirFuncionariosController(int pIdFun){
        return this.daoFuncionarios.excluirFuncionariosDAO(pIdFun);
    }
}