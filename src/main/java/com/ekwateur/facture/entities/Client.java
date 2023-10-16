package com.ekwateur.facture.entities;

import java.util.List;

public class Client {
    private String referenceClient;
    private List<Energie> energies;
    private double consommationElectricite;
    private double consommationGaz;


    public double getConsommationElectricite() {
        return consommationElectricite;
    }

    public void setConsommationElectricite(double consommationElectricite) {
        this.consommationElectricite = consommationElectricite;
    }

    public double getConsommationGaz() {
        return consommationGaz;
    }

    public void setConsommationGaz(double consommationGaz) {
        this.consommationGaz = consommationGaz;
    }

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
