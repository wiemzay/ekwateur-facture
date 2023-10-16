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
            for (Energie energie : client.getEnergies()) {
                if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                    total += energie.getConsommation() * ELECTRICITE_PARTICULIER_RATE;

                }
                if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * GAZ_PARTICULIER_RATE;

                }
            }
        } else if (client instanceof ClientPro){
            if (((ClientPro) client).getCa()>= 1000000)
            {
                for (Energie energie : client.getEnergies()) {


                    if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                        total += energie.getConsommation() * ELECTRICITE_PRO_HIGH_CA_RATE;

                    }
                    if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * GAZ_PRO_HIGH_CA_RATE;

                    }
                }
            } else {
                for (Energie energie : client.getEnergies()) {


                    if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                        total += energie.getConsommation() * ELECTRICITE_PRO_LOW_CA_RATE;

                    }
                    if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * GAZ_PRO_LOW_CA_RATE;

                    }
                }
            }

        }



        return total;
    }


}
