package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.Client;
import entites.Emprunt;

/**
 * @author Khalil HIMET
 *
 */
public class TestBibliotheque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Requête qui permet d’extraire un emprunt et tous ses livres associés.
		
		// Création de l'instance de l'entity Manager Factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai2");
		
		// Création de l'instance Entity Manager
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		TypedQuery<Emprunt> query1 = entityManager.createQuery("select e from Emprunt e where e.id = 1", Emprunt.class);
		
		Emprunt resultats1 = query1.getResultList().get(0);
		
		
		System.out.println("Emprunt recherché : ");
		System.out.println(resultats1);
		
		System.out.println("\n livres associés : ");
		
		resultats1.getLivres().forEach(System.out::println);
		
		
		// Requête qui permet d'extraire tous les emprunts d'un client donné
		TypedQuery<Client> query2 = entityManager.createQuery("select c from Client c where c.id = 1", Client.class);
		
		Client resultats2 = query2.getResultList().get(0);
		
		System.out.println("\nClient recherché");
		System.out.println(resultats2);
		
		System.out.println("\nEmprunts associés à ce client");
		resultats2.getEmprunts().forEach(System.out::println);
		
		

	}

}
