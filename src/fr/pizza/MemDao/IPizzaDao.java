package fr.pizza.MemDao;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import fr.pizzeria.model.Pizza;


	public interface IPizzaDao{
		
		

		ArrayList<Pizza> findAllPizzas();
		
		void saveNewPizza(Pizza pizza) throws FileNotFoundException;
		
		void updatePizza(String codePizza, Pizza pizza);
		
		void deletePizza(String codePizza);
		
		Pizza findPizzaByCode(String codePizza);
		
		boolean pizzaExists(String codePizza);
		

}

