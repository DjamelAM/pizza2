package fr.pizzeria.service;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizza.MemDao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao memDao) {
		ArrayList<Pizza> pizzas = memDao.findAllPizzas();
		
		for(int i=0;i<pizzas.size();i++){
			
			System.out.println(pizzas.get(i));
		}

	}
}