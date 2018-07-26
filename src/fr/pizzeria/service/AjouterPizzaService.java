package fr.pizzeria.service;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizza.MemDao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	public void executeUC(Scanner sc, IPizzaDao memDao) throws SavePizzaException, FileNotFoundException {
		System.out.println("Ajout d'une nouvelle pizza");

		System.out.println("Veuillez saisir le code :");
		String nCode = sc.next().toUpperCase();
		System.out.println("Veuillez saisir le nom :");
		String nNom = sc.next();
		
			System.out.println("Veuillez saisir le prix :");
	
			String nPrix =sc.next();
			if(!NumberUtils.isCreatable(nPrix)){
				throw new SavePizzaException("Le prix doit être en chiffre");
			}
			
		if(Double.parseDouble(nPrix) <0){
			
			throw new SavePizzaException("prix négatif impossible");
		}

		System.out.println("Veuillez saisir la catégorie :");
		String categorie = sc.next().toUpperCase();
			CategoriePizza[] tab = CategoriePizza.values();
			
			int a=0;

		for (int i = 0; i < tab.length; i++) {
			 if ( tab[i].name().equalsIgnoreCase(categorie)){
				 Pizza newpizza = new Pizza(nCode, nNom, Double.parseDouble(nPrix), CategoriePizza.valueOf(categorie));
					memDao.saveNewPizza(newpizza);
					a=1;
				 break;
			 }
		}
		if(a==0){
			throw new SavePizzaException("choisir une catégorie existante ");
		}
			}
		}


