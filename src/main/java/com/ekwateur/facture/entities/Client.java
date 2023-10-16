package com.ekwateur.facture.entities;

import java.util.List;

public class Client {
    private String referenceClient;
    private List<TypeEnergie> typesEnergie;


    public String getReferenceClient() {
        return referenceClient;
    }

    public void setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
    }

    public List<TypeEnergie> getTypesEnergie() {
        return typesEnergie;
    }

    public void setTypesEnergie(List<TypeEnergie> typesEnergie) {
        this.typesEnergie = typesEnergie;
    }

    @Override
    public String toString() {
        return "Client{" +
                "referenceClient='" + referenceClient + '\'' +
                ", typesEnergie=" + typesEnergie +
                '}';
    }
}
