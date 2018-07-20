package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner sc, PizzaMemDao memDao) {
		System.out.println("Liste des pizzas");
		System.out.println("Veuillez saisir le code de la pizza à modifier :");
		String modifCode = sc.next();

		System.out.println("Veuillez saisir le nouveau code :");
		String nCode1 = sc.next();
		System.out.println("Veuillez saisir le nouveau nom :");
		String nNom1 = sc.next();
		System.out.println("Veuillez saisir le nouveau prix :");
		double nPrix1 = sc.nextDouble();

		Pizza newpizza1 = new Pizza(nCode1,nNom1, nPrix1);

		memDao.updatePizza(modifCode, newpizza1);
		
	}


}
