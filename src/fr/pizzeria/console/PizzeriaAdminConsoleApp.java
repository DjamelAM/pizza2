package fr.pizzeria.console;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.w3c.dom.Text;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import fr.pizza.MemDao.IPizzaDao;
import fr.pizza.MemDao.PizzaMemDao;
import fr.pizza.MemDao.PizzaTxtDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;
public class PizzeriaAdminConsoleApp {

	static int a=0;

	public static void main(String[] args) throws FileNotFoundException, DocumentException {

		Scanner sc = new Scanner(System.in);
		//PizzaMemDao memDao = new PizzaMemDao();
		IPizzaDao memDao = new PizzaTxtDao("ListePizza.txt");

		MenuService service=null;
		while(a!=99){

			System.out.println("\n***** Pizzeria Administration *****");

			System.out.println("1. Lister les pizzas");

			System.out.println("2. Ajouter une nouvelle pizza");

			System.out.println("3. Mettre à jour une pizza");

			System.out.println("4. Supprimer une pizza");
			
			System.out.println("5. Exporter la liste de pizza en pdf");


			System.out.println("99. Sortir");

			a = sc.nextInt();
			switch  (a){

			case 1:
				service = new ListerPizzasService();
				try {
					service.executeUC(sc, memDao);
				} catch (StockageException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:
				service = new AjouterPizzaService();
				try {
					service.executeUC(sc, memDao);
				} catch (StockageException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				break;

			case 3:

				service = new ModifierPizzaService();
				try {
					service.executeUC(sc, memDao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());

				}
				break;

			case 4:

				service = new SupprimerPizzaService();
				try {
					service.executeUC(sc, memDao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());

				}
				break;
				
				
			case 5:
				//sortir la liste de pizza en pdf
//				Document document = new Document();
//				
//				PdfWriter.getInstance(document, new FileOutputStream("Liste de Pizzas.pdf"));
//		        Paragraph paragraph = new Paragraph();
//
//				document.open();
//				Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
//				Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 32, BaseColor.CYAN);
//				paragraph.add(new Chunk("Liste de pizzas\n\n",font2));
//				for(int i=0;i<memDao.listPizza.size();i++){
//					
//					paragraph.add ( new Chunk((memDao.listPizza.get(i).toString())+ "\n" , font));
//					
//				}
//				
//				document.add(paragraph);
//				document.close();
				
				break;
			case 99:
				System.out.println("Aurevoir :(");
				
				break;
			}
		}
	}


}
