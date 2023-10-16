package com.ekwateur.facture.services;

import com.ekwateur.facture.entities.*;

public class FacturationService {
    private static final double ELECTRICITE_PARTICULIER_RATE = 0.121;
    private static final double GAZ_PARTICULIER_RATE = 0.115;
    private static final double ELECTRICITE_PRO_HIGH_CA_RATE = 0.114;
    private static final double GAZ_PRO_HIGH_CA_RATE = 0.111;
    private static final double ELECTRICITE_PRO_LOW_CA_RATE = 0.118;
    private static final double GAZ_PRO_LOW_CA_RATE = 0.113;
    public double calculerMontantFacture(Client client, int mois, int annee) {


        double total = 0;

        if (client instanceof ClientParticulier) {
            total = getTotal(client, total, ELECTRICITE_PARTICULIER_RATE, GAZ_PARTICULIER_RATE);
        } else if (client instanceof ClientPro){
            if (((ClientPro) client).getCa()>= 1000000)
            {
                total = getTotal(client, total, ELECTRICITE_PRO_HIGH_CA_RATE, GAZ_PRO_HIGH_CA_RATE);
            } else {
                total = getTotal(client, total, ELECTRICITE_PRO_LOW_CA_RATE, GAZ_PRO_LOW_CA_RATE);
            }

        }



        return total;
    }

    private double getTotal(Client client, double total, double electriciteParticulierRate, double gazParticulierRate) {
        for (Energie energie : client.getEnergies()) {
            if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                total += energie.getConsommation() * electriciteParticulierRate;

            }
            if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                    total += energie.getConsommation() * gazParticulierRate;

            }
        }
        return total;
    }


}
