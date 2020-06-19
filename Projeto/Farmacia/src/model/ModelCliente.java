package model;
/**
*
* @author Rodrigo Sarmento
*/
public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliEstado;
    private String cliCep;
    private String cliTelefone;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliEndereco
    * @param pCliEndereco
    */
    public void setCliEndereco(String pCliEndereco){
        this.cliEndereco = pCliEndereco;
    }
    /**
    * return cliEndereco
    */
    public String getCliEndereco(){
        return this.cliEndereco;
    }

    /**
    * seta o valor de cliBairro
    * @param pCliBairro
    */
    public void setCliBairro(String pCliBairro){
        this.cliBairro = pCliBairro;
    }
    /**
    * return cliBairro
    */
    public String getCliBairro(){
        return this.cliBairro;
    }

    /**
    * seta o valor de cliCidade
    * @param pCliCidade
    */
    public void setCliCidade(String pCliCidade){
        this.cliCidade = pCliCidade;
    }
    /**
    * return cliCidade
    */
    public String getCliCidade(){
        return this.cliCidade;
    }

    /**
    * seta o valor de cliEstado
    * @param pCliEstado
    */
    public void setCliEstado(String pCliEstado){
        this.cliEstado = pCliEstado;
    }
    /**
    * return cliEstado
    */
    public String getCliEstado(){
        return this.cliEstado;
    }

    /**
    * seta o valor de cliCep
    * @param pCliCep
    */
    public void setCliCep(String pCliCep){
        this.cliCep = pCliCep;
    }
    /**
    * return cliCep
    */
    public String getCliCep(){
        return this.cliCep;
    }

    /**
    * seta o valor de cliTelefone
    * @param pCliTelefone
    */
    public void setCliTelefone(String pCliTelefone){
        this.cliTelefone = pCliTelefone;
    }
    /**
    * return cliTelefone
    */
    public String getCliTelefone(){
        return this.cliTelefone;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliEndereco = " + this.cliEndereco + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliEstado = " + this.cliEstado + "::cliCep = " + this.cliCep + "::cliTelefone = " + this.cliTelefone +  "}";
    }
}