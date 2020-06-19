package model;
/**
*
* @author Rodrigo Sarmento
*/
public class ModelFuncionarios {

    private int idFun;
    private String nomeFun;
    private String cpfFun;
    private double salarioFun;
    private String cargoFun;
    private String enderecoFun;
    private String bairroFun;
    private String cidadeFun;
    private String estadoFun;
    private String cepFun;
    private String telefoneFun;

    /**
    * Construtor
    */
    public ModelFuncionarios(){}

    /**
    * seta o valor de idFun
    * @param pIdFun
    */
    public void setIdFun(int pIdFun){
        this.idFun = pIdFun;
    }
    /**
    * return pk_idFun
    */
    public int getIdFun(){
        return this.idFun;
    }

    /**
    * seta o valor de nomeFun
    * @param pNomeFun
    */
    public void setNomeFun(String pNomeFun){
        this.nomeFun = pNomeFun;
    }
    /**
    * return nomeFun
    */
    public String getNomeFun(){
        return this.nomeFun;
    }

    /**
    * seta o valor de cpfFun
    * @param pCpfFun
    */
    public void setCpfFun(String pCpfFun){
        this.cpfFun = pCpfFun;
    }
    /**
    * return cpfFun
    */
    public String getCpfFun(){
        return this.cpfFun;
    }

    /**
    * seta o valor de salarioFun
    * @param pSalarioFun
    */
    public void setSalarioFun(double pSalarioFun){
        this.salarioFun = pSalarioFun;
    }
    /**
    * return salarioFun
    */
    public double getSalarioFun(){
        return this.salarioFun;
    }

    /**
    * seta o valor de cargoFun
    * @param pCargoFun
    */
    public void setCargoFun(String pCargoFun){
        this.cargoFun = pCargoFun;
    }
    /**
    * return cargoFun
    */
    public String getCargoFun(){
        return this.cargoFun;
    }

    /**
    * seta o valor de enderecoFun
    * @param pEnderecoFun
    */
    public void setEnderecoFun(String pEnderecoFun){
        this.enderecoFun = pEnderecoFun;
    }
    /**
    * return enderecoFun
    */
    public String getEnderecoFun(){
        return this.enderecoFun;
    }

    /**
    * seta o valor de bairroFun
    * @param pBairroFun
    */
    public void setBairroFun(String pBairroFun){
        this.bairroFun = pBairroFun;
    }
    /**
    * return bairroFun
    */
    public String getBairroFun(){
        return this.bairroFun;
    }

    /**
    * seta o valor de cidadeFun
    * @param pCidadeFun
    */
    public void setCidadeFun(String pCidadeFun){
        this.cidadeFun = pCidadeFun;
    }
    /**
    * return cidadeFun
    */
    public String getCidadeFun(){
        return this.cidadeFun;
    }

    /**
    * seta o valor de estadoFun
    * @param pEstadoFun
    */
    public void setEstadoFun(String pEstadoFun){
        this.estadoFun = pEstadoFun;
    }
    /**
    * return estadoFun
    */
    public String getEstadoFun(){
        return this.estadoFun;
    }

    /**
    * seta o valor de cepFun
    * @param pCepFun
    */
    public void setCepFun(String pCepFun){
        this.cepFun = pCepFun;
    }
    /**
    * return cepFun
    */
    public String getCepFun(){
        return this.cepFun;
    }

    /**
    * seta o valor de telefoneFun
    * @param pTelefoneFun
    */
    public void setTelefoneFun(String pTelefoneFun){
        this.telefoneFun = pTelefoneFun;
    }
    /**
    * return telefoneFun
    */
    public String getTelefoneFun(){
        return this.telefoneFun;
    }

    @Override
    public String toString(){
        return "ModelFuncionarios {" + "::idFun = " + this.idFun + "::nomeFun = " + this.nomeFun + "::cpfFun = " + this.cpfFun + "::salarioFun = " + this.salarioFun + "::cargoFun = " + this.cargoFun + "::enderecoFun = " + this.enderecoFun + "::bairroFun = " + this.bairroFun + "::cidadeFun = " + this.cidadeFun + "::estadoFun = " + this.estadoFun + "::cepFun = " + this.cepFun + "::telefoneFun = " + this.telefoneFun +  "}";
    }
}