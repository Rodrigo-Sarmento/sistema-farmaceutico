package DAO;

import model.ModelUsuario;
import conexao.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author Rodrigo Sarmento
*/
public class DAOUsuario extends ConexaoMysql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO usuario ("
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                + ") VALUES ("
                    + "'" + pModelUsuario.getIdUsuario() + "',"
                    + "'" + pModelUsuario.getUsuNome() + "',"
                    + "'" + pModelUsuario.getUsuLogin() + "',"
                    + "'" + pModelUsuario.getUsuSenha() + "'"
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
    * recupera Usuario
    * @param pIdUsuario
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " id_usuario = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString(2));
                modelUsuario.setUsuLogin(this.getResultSet().getString(3));
                modelUsuario.setUsuSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }
    
     /**
    * recupera Usuario
    * @param pLogin
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(String pLogin){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " usu_login = '" + pLogin + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString(2));
                modelUsuario.setUsuLogin(this.getResultSet().getString(3));
                modelUsuario.setUsuSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                 + " FROM"
                     + " usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString(2));
                modelUsuario.setUsuLogin(this.getResultSet().getString(3));
                modelUsuario.setUsuSenha(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE usuario SET "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "usu_nome = '" + pModelUsuario.getUsuNome() + "',"
                    + "usu_login = '" + pModelUsuario.getUsuLogin() + "',"
                    + "usu_senha = '" + pModelUsuario.getUsuSenha() + "'"
                + " WHERE "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
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
    * exclui Usuario
    * @param pIdUsuario
    * return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM usuario "
                + " WHERE "
                    + "id_usuario = '" + pIdUsuario + "'"
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
     * validar login e senha de usuário
     * @param pModelUsuario
     * @return 
     */
    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " usu_login = '" + pModelUsuario.getUsuLogin() + "' "
                     + "AND usu_senha = '"+pModelUsuario.getUsuSenha()+"'"
                + ";"
            );
            if(getResultSet().next()){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}