package com.ekwateur.facture;

import com.ekwateur.facture.entities.*;
import com.ekwateur.facture.services.FacturationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public class FactureApplication {

	public static void main(String[] args) {
		ClientParticulier particulierClient = new ClientParticulier();
		particulierClient.setReferenceClient("P123");
		particulierClient.setCivilite(Civilite.MONSIEUR);
		particulierClient.setNom("Dupont");
		particulierClient.setPrenom("Jean");
		Energie energie1 = new Energie();
		energie1.setConsommation(123);
		energie1.setTypeEnergie(TypeEnergie.GAZ);
		particulierClient.setEnergies(List.of(energie1));

		ClientPro proClient = new ClientPro();
		proClient.setReferenceClient("PRO456");
		proClient.setRaisonSociale("ABC Company");
		proClient.setNumSiret("123456789");
		proClient.setCa(1200000L);
		Energie energie2 = new Energie();
		energie2.setConsommation(123);
		energie2.setTypeEnergie(TypeEnergie.GAZ);
		Energie energie3 = new Energie();
		energie3.setConsommation(123);
		energie3.setTypeEnergie(TypeEnergie.ELECTRICITE);
		proClient.setEnergies(List.of(energie2,energie3));

		FacturationService facturationService = new FacturationService();
		double totalParticulier = facturationService.calculerMontantFacture(particulierClient, 10, 2023);
		double totalPro = facturationService.calculerMontantFacture(proClient, 10, 2023);

		System.out.println("Total for ClientParticulier: " + totalParticulier + " €");
		System.out.println("Total for ClientPro: " + totalPro + " €");
	}

}
