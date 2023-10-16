package com.ekwateur.facture.entities;

import java.util.List;

public class Client {
    private String referenceClient;
    private List<Energie> energies;


    public String getReferenceClient() {
        return referenceClient;
    }

    public void setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
    }

    public List<Energie> getEnergies() {
        return energies;
    }

    public void setEnergies(List<Energie> energies) {
        this.energies = energies;
    }

    @Override
    public String toString() {
        return "Client{" +
                "referenceClient='" + referenceClient + '\'' +
                ", energies=" + energies +
                '}';
    }
}
