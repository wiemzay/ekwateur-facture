package com.ekwateur.facture.services;

import com.ekwateur.facture.entities.*;

public class FacturationService {
    public double calculerMontantFacture(Client client, int mois, int annee) {

        double total = 0;

        if (client instanceof ClientParticulier) {
            for (Energie energie : client.getEnergies()) {
                if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                    total += energie.getConsommation() * 0.121;

                }
                if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * 0.115;

                }
            }
        } else if (client instanceof ClientPro){
            if (((ClientPro) client).getCa()>= 1000000)
            {
                for (Energie energie : client.getEnergies()) {


                    if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                        total += energie.getConsommation() * 0.114;

                    }
                    if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * 0.111;

                    }
                }
            } else {
                for (Energie energie : client.getEnergies()) {


                    if (energie.getTypeEnergie().equals(TypeEnergie.ELECTRICITE)) {
                        total += energie.getConsommation() * 0.118;

                    }
                    if (energie.getTypeEnergie().equals(TypeEnergie.GAZ)) {
                        total += energie.getConsommation() * 0.113;

                    }
                }
            }

        }



        return total;
    }


}
