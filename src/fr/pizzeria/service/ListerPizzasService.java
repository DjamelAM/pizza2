package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao memDao) {
		System.out.println(memDao.findAllPizzas());

	}
}