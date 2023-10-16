package com.ekwateur.facture.entities;

public class ClientPro extends Client {

   private String numSiret;
   private String raisonSociale;
   private Long ca;

    public String getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(String numSiret) {
        this.numSiret = numSiret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Long getCa() {
        return ca;
    }

    public void setCa(Long ca) {
        this.ca = ca;
    }
}
