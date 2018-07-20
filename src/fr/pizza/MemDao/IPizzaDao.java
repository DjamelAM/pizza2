package fr.pizza.MemDao;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;


	public interface IPizzaDao{
		
		
		ArrayList<Pizza> findAllPizzas();
		
		void saveNewPizza(Pizza pizza);
		
		void updatePizza(String codePizza, Pizza pizza);
		
		void deletePizza(String codePizza);
		
		Pizza findPizzaByCode(String codePizza);
		
		boolean pizzaExists(String codePizza);

}

