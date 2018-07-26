package fr.pizzeria.service;

import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.pizza.MemDao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

public abstract class MenuService {

	public abstract void executeUC(Scanner sc, IPizzaDao memDao) throws StockageException, FileNotFoundException;
	
}
