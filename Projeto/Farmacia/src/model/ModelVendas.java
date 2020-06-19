package model;

import java.sql.Date;

/**
*
* @author Rodrigo Sarmento
*/
public class ModelVendas {

    private int idVendas;
    private int cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de idVendas
    * @param pIdVendas
    */
    public void setIdVendas(int pIdVendas){
        this.idVendas = pIdVendas;
    }
    /**
    * return pk_idVendas
    */
    public int getIdVendas(){
        return this.idVendas;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de venDataVenda
    * @param pVenDataVenda
    */
    public void setVenDataVenda(Date pVenDataVenda){
        this.venDataVenda = pVenDataVenda;
    }
    /**
    * return venDataVenda
    */
    public Date getVenDataVenda(){
        return this.venDataVenda;
    }

    /**
    * seta o valor de venValorLiquido
    * @param pVenValorLiquido
    */
    public void setVenValorLiquido(double pVenValorLiquido){
        this.venValorLiquido = pVenValorLiquido;
    }
    /**
    * return venValorLiquido
    */
    public double getVenValorLiquido(){
        return this.venValorLiquido;
    }

    /**
    * seta o valor de venValorBruto
    * @param pVenValorBruto
    */
    public void setVenValorBruto(double pVenValorBruto){
        this.venValorBruto = pVenValorBruto;
    }
    /**
    * return venValorBruto
    */
    public double getVenValorBruto(){
        return this.venValorBruto;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::idVendas = " + this.idVendas + "::cliente = " + this.cliente + "::venDataVenda = " + this.venDataVenda + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto +  "}";
    }
}