package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	

	public void executeUC(Scanner sc, PizzaMemDao memDao) {
		System.out.println("Ajout d'une nouvelle pizza");

		System.out.println("Veuillez saisir le code :");
		String nCode = sc.next();
		System.out.println("Veuillez saisir le nom :");
		String nNom = sc.next();
		System.out.println("Veuillez saisir le prix :");
		double nPrix = sc.nextDouble();
		Pizza newpizza = new Pizza(nCode,nNom, nPrix);
		memDao.saveNewPizza(newpizza);
	
	}


}
