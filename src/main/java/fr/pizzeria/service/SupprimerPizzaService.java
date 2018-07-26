package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.dao.IPizzaDao;
import fr.pizza.dao.PizzaMemDao;
import fr.pizzeria.exception.DeletePizzaException;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao memDao) throws DeletePizzaException {
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String supprCode = scanner.next().toUpperCase();
		
		if (memDao.findPizzaByCode(supprCode) == null) {

			throw new DeletePizzaException("choisir un code existant ");
		}
		memDao.deletePizza(supprCode);	
	}



}
