package fr.pizza.MemDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;

import fr.pizzeria.model.Pizza;

public class PizzaTxtDao implements IPizzaDao {

	public ArrayList<Pizza> listPizza;
	private String path;


	public PizzaTxtDao(String path) throws FileNotFoundException {
		listPizza = new ArrayList<Pizza>();
		this.path = path;

	}

	public ArrayList<Pizza> findAllPizzas() {
		List<String> lines = null;
		try {
			lines = FileUtils.readLines(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String line : lines) {
			StringTokenizer decoupeur = new StringTokenizer(line, ",");
			String id = decoupeur.nextToken();
			String code = decoupeur.nextToken();
			String libelle = decoupeur.nextToken();
			String prix = decoupeur.nextToken();

			Pizza pizza = new Pizza(Integer.parseInt(id), code, libelle, Double.parseDouble(prix));
			listPizza.add(pizza);
			
		}
		//writer.close();
		return listPizza;
	}

	public void saveNewPizza(Pizza pizza) throws FileNotFoundException {
		listPizza.add(pizza);
List<String> contenu = new ArrayList<String>();
ArrayList<Pizza> pizzasadd = new ArrayList<Pizza>();

try {
	contenu = FileUtils.readLines(new File(path));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
//on lit le fichier et remplit un array avec le fichier
for (String line : contenu) {
	StringTokenizer decoupeur = new StringTokenizer(line, ",");
	String id = decoupeur.nextToken();
	String code = decoupeur.nextToken();
	String libelle = decoupeur.nextToken();
	String prix = decoupeur.nextToken();

	Pizza pizza1 = new Pizza(Integer.parseInt(id), code, libelle, Double.parseDouble(prix));
	pizzasadd.add(pizza1);
	
}
//puis on ajoute la nouvelle pizza à cet array
pizzasadd.add(pizza);
try {
	FileUtils.writeLines(new File(path), pizzasadd);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//this.writer.println(pizza + "\n");
		// listPizza.add(pizza);
		// writer.println("La deuxième ligne");
		//writer.close();
	}

	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub

	}

	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub

	}

	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
