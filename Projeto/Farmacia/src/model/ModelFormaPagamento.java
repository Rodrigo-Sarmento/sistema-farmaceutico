package model;
/**
*
* @author Rodrigo Sarmento
*/
public class ModelFormaPagamento {

    private int idForPag;
    private String descricaoForPag;
    private float descontoForPag;
    private int parcelasForPag;
    private int situacaoForPag;

    /**
    * Construtor
    */
    public ModelFormaPagamento(){}

    /**
    * seta o valor de idForPag
    * @param pIdForPag
    */
    public void setIdForPag(int pIdForPag){
        this.idForPag = pIdForPag;
    }
    /**
    * return pk_idForPag
    */
    public int getIdForPag(){
        return this.idForPag;
    }

    /**
    * seta o valor de descricaoForPag
    * @param pDescricaoForPag
    */
    public void setDescricaoForPag(String pDescricaoForPag){
        this.descricaoForPag = pDescricaoForPag;
    }
    /**
    * return descricaoForPag
    */
    public String getDescricaoForPag(){
        return this.descricaoForPag;
    }

    /**
    * seta o valor de descontoForPag
    * @param pDescontoForPag
    */
    public void setDescontoForPag(float pDescontoForPag){
        this.descontoForPag = pDescontoForPag;
    }
    /**
    * return descontoForPag
    */
    public float getDescontoForPag(){
        return this.descontoForPag;
    }

    /**
    * seta o valor de parcelasForPag
    * @param pParcelasForPag
    */
    public void setParcelasForPag(int pParcelasForPag){
        this.parcelasForPag = pParcelasForPag;
    }
    /**
    * return parcelasForPag
    */
    public int getParcelasForPag(){
        return this.parcelasForPag;
    }

    /**
    * seta o valor de situacaoForPag
    * @param pSituacaoForPag
    */
    public void setSituacaoForPag(int pSituacaoForPag){
        this.situacaoForPag = pSituacaoForPag;
    }
    /**
    * return situacaoForPag
    */
    public int getSituacaoForPag(){
        return this.situacaoForPag;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::idForPag = " + this.idForPag + "::descricaoForPag = " + this.descricaoForPag + "::descontoForPag = " + this.descontoForPag + "::parcelasForPag = " + this.parcelasForPag + "::situacaoForPag = " + this.situacaoForPag +  "}";
    }
}