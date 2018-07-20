package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizza.MemDao.PizzaMemDao;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;
public class PizzeriaAdminConsoleApp {

	static int a=0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PizzaMemDao memDao = new PizzaMemDao();
		
		MenuService service=null;
		while(a!=99){

			System.out.println("\n***** Pizzeria Administration *****");

			System.out.println("1. Lister les pizzas");

			System.out.println("2. Ajouter une nouvelle pizza");

			System.out.println("3. Mettre à jour une pizza");

			System.out.println("4. Supprimer une pizza");

			System.out.println("99. Sortir");

			a = sc.nextInt();
			switch  (a){

			case 1:
				service = new ListerPizzasService();
				service.executeUC(sc, memDao);
				break;

			case 2:
				service = new AjouterPizzaService();
				service.executeUC(sc, memDao);
				
				break;

			case 3:

				service = new ModifierPizzaService();
				service.executeUC(sc, memDao);
				break;

			case 4:

				service = new SupprimerPizzaService();
				service.executeUC(sc, memDao);
				break;
			case 99:
				System.out.println("Aurevoir :(");
				break;
			}
		}
	}


}
