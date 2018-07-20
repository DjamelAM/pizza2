package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao memDao) {
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String supprCode = scanner.next();
		memDao.deletePizza(supprCode);	
	}



}
