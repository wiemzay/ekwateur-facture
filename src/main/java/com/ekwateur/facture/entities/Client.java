package com.ekwateur.facture.entities;

public class Client {
    private String referenceClient;

    public String getReferenceClient() {
        return referenceClient;
    }

    public void setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "referenceClient='" + referenceClient + '\'' +
                '}';
    }
}
