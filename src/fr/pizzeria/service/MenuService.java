package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;

public abstract class MenuService {

	public abstract void executeUC(Scanner sc, PizzaMemDao memDao);
	
}
