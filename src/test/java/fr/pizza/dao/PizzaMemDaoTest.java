package fr.pizza.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaMemDaoTest {

	@Test
	public void testFindAllPizzas() {
		PizzaMemDao memdao = new PizzaMemDao();
		ArrayList<Pizza> liste = memdao.findAllPizzas();
		assertEquals(8, liste.size());
	}

	@Test
	public void testSaveNewPizza() {
		Pizza pizza = new Pizza("POP", "Jean", 15, CategoriePizza.POISSON);
		PizzaMemDao memdao = new PizzaMemDao();
		assertEquals(8, memdao.findAllPizzas().size());
		memdao.saveNewPizza(pizza);
		assertEquals(9, memdao.findAllPizzas().size());
		assertNotNull(memdao.findPizzaByCode(pizza.getCode()));
	}

	@Test
	public void testUpdatePizza() {
		PizzaMemDao memdao = new PizzaMemDao();
		assertEquals(8, memdao.findAllPizzas().size());
		Pizza pizza = new Pizza("POP", "Jean", 15, CategoriePizza.POISSON);

		memdao.updatePizza("PEP", pizza);
		assertEquals(8, memdao.findAllPizzas().size());
		assertNotNull(memdao.findPizzaByCode(pizza.getCode()));
	}

	@Test
	public void testDeletePizza() {
		PizzaMemDao memdao = new PizzaMemDao();
		assertEquals(8, memdao.findAllPizzas().size());
		memdao.deletePizza("PEP");
		assertEquals(7, memdao.findAllPizzas().size());
		assertNull(memdao.findPizzaByCode("PEP"));
		
	}

	@Test
	public void testFindPizzaByCode() {
		PizzaMemDao memdao = new PizzaMemDao();
		assertNotNull(memdao.findPizzaByCode("PEP"));
		assertNull(memdao.findPizzaByCode(null));
	}

	@Test
	public void testPizzaExists() {
		PizzaMemDao memdao = new PizzaMemDao();
		assertEquals(true, memdao.pizzaExists("PEP"));
		assertEquals(null, memdao.findPizzaByCode(null));
		assertEquals(null, memdao.findPizzaByCode("jean"));
		
		
	}

}
