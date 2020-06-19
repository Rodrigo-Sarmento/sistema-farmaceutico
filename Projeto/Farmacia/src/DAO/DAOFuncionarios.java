package DAO;

import model.ModelFuncionarios;
import conexao.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author Rodrigo Sarmento
*/
public class DAOFuncionarios extends ConexaoMysql {

    /**
    * grava Funcionarios
    * @param pModelFuncionarios
    * return int
    */
    public int salvarFuncionariosDAO(ModelFuncionarios pModelFuncionarios){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO funcionarios ("
                    + "id_fun,"
                    + "nome_fun,"
                    + "cpf_fun,"
                    + "salario_fun,"
                    + "cargo_fun,"
                    + "endereco_fun,"
                    + "bairro_fun,"
                    + "cidade_fun,"
                    + "estado_fun,"
                    + "cep_fun,"
                    + "telefone_fun"
                + ") VALUES ("
                    + "'" + pModelFuncionarios.getIdFun() + "',"
                    + "'" + pModelFuncionarios.getNomeFun() + "',"
                    + "'" + pModelFuncionarios.getCpfFun() + "',"
                    + "'" + pModelFuncionarios.getSalarioFun() + "',"
                    + "'" + pModelFuncionarios.getCargoFun() + "',"
                    + "'" + pModelFuncionarios.getEnderecoFun() + "',"
                    + "'" + pModelFuncionarios.getBairroFun() + "',"
                    + "'" + pModelFuncionarios.getCidadeFun() + "',"
                    + "'" + pModelFuncionarios.getEstadoFun() + "',"
                    + "'" + pModelFuncionarios.getCepFun() + "',"
                    + "'" + pModelFuncionarios.getTelefoneFun() + "'"
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
    * recupera Funcionarios
    * @param pIdFun
    * return ModelFuncionarios
    */
    public ModelFuncionarios getFuncionariosDAO(int pIdFun){
        ModelFuncionarios modelFuncionarios = new ModelFuncionarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fun,"
                    + "nome_fun,"
                    + "cpf_fun,"
                    + "salario_fun,"
                    + "cargo_fun,"
                    + "endereco_fun,"
                    + "bairro_fun,"
                    + "cidade_fun,"
                    + "estado_fun,"
                    + "cep_fun,"
                    + "telefone_fun"
                 + " FROM"
                     + " funcionarios"
                 + " WHERE"
                     + " id_fun = '" + pIdFun + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFuncionarios.setIdFun(this.getResultSet().getInt(1));
                modelFuncionarios.setNomeFun(this.getResultSet().getString(2));
                modelFuncionarios.setCpfFun(this.getResultSet().getString(3));
                modelFuncionarios.setSalarioFun(this.getResultSet().getDouble(4));
                modelFuncionarios.setCargoFun(this.getResultSet().getString(5));
                modelFuncionarios.setEnderecoFun(this.getResultSet().getString(6));
                modelFuncionarios.setBairroFun(this.getResultSet().getString(7));
                modelFuncionarios.setCidadeFun(this.getResultSet().getString(8));
                modelFuncionarios.setEstadoFun(this.getResultSet().getString(9));
                modelFuncionarios.setCepFun(this.getResultSet().getString(10));
                modelFuncionarios.setTelefoneFun(this.getResultSet().getString(11));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFuncionarios;
    }

    /**
    * recupera uma lista de Funcionarios
        * return ArrayList
    */
    public ArrayList<ModelFuncionarios> getListaFuncionariosDAO(){
        ArrayList<ModelFuncionarios> listamodelFuncionarios = new ArrayList();
        ModelFuncionarios modelFuncionarios = new ModelFuncionarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fun,"
                    + "nome_fun,"
                    + "cpf_fun,"
                    + "salario_fun,"
                    + "cargo_fun,"
                    + "endereco_fun,"
                    + "bairro_fun,"
                    + "cidade_fun,"
                    + "estado_fun,"
                    + "cep_fun,"
                    + "telefone_fun"
                 + " FROM"
                     + " funcionarios"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFuncionarios = new ModelFuncionarios();
                modelFuncionarios.setIdFun(this.getResultSet().getInt(1));
                modelFuncionarios.setNomeFun(this.getResultSet().getString(2));
                modelFuncionarios.setCpfFun(this.getResultSet().getString(3));
                modelFuncionarios.setSalarioFun(this.getResultSet().getDouble(4));
                modelFuncionarios.setCargoFun(this.getResultSet().getString(5));
                modelFuncionarios.setEnderecoFun(this.getResultSet().getString(6));
                modelFuncionarios.setBairroFun(this.getResultSet().getString(7));
                modelFuncionarios.setCidadeFun(this.getResultSet().getString(8));
                modelFuncionarios.setEstadoFun(this.getResultSet().getString(9));
                modelFuncionarios.setCepFun(this.getResultSet().getString(10));
                modelFuncionarios.setTelefoneFun(this.getResultSet().getString(11));
                listamodelFuncionarios.add(modelFuncionarios);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFuncionarios;
    }

    /**
    * atualiza Funcionarios
    * @param pModelFuncionarios
    * return boolean
    */
    public boolean atualizarFuncionariosDAO(ModelFuncionarios pModelFuncionarios){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE funcionarios SET "
                    + "id_fun = '" + pModelFuncionarios.getIdFun() + "',"
                    + "nome_fun = '" + pModelFuncionarios.getNomeFun() + "',"
                    + "cpf_fun = '" + pModelFuncionarios.getCpfFun() + "',"
                    + "salario_fun = '" + pModelFuncionarios.getSalarioFun() + "',"
                    + "cargo_fun = '" + pModelFuncionarios.getCargoFun() + "',"
                    + "endereco_fun = '" + pModelFuncionarios.getEnderecoFun() + "',"
                    + "bairro_fun = '" + pModelFuncionarios.getBairroFun() + "',"
                    + "cidade_fun = '" + pModelFuncionarios.getCidadeFun() + "',"
                    + "estado_fun = '" + pModelFuncionarios.getEstadoFun() + "',"
                    + "cep_fun = '" + pModelFuncionarios.getCepFun() + "',"
                    + "telefone_fun = '" + pModelFuncionarios.getTelefoneFun() + "'"
                + " WHERE "
                    + "id_fun = '" + pModelFuncionarios.getIdFun() + "'"
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
    * exclui Funcionarios
    * @param pIdFun
    * return boolean
    */
    public boolean excluirFuncionariosDAO(int pIdFun){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM funcionarios "
                + " WHERE "
                    + "id_fun = '" + pIdFun + "'"
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