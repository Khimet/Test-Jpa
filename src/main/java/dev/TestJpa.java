package dev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.Livre;

/**
 * Classe éxécutable pour tester la connexion à la base de données compta via
 * JPA
 * 
 * @author Khalil HIMET
 *
 */
public class TestJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création de l'instance de l'Entity Manager Factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");

		// Création de l'instance Entity Manager
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Exécution d'un find pour extraire un livre en fonction de son identifiant
		Livre livre1 = entityManager.find(Livre.class, 1);

		System.out.println(livre1);

		// Insertion d'un nouveau livre
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Livre livre2 = new Livre();
		livre2.setId(6);
		livre2.setAuteur("Paulo Coelho");
		livre2.setTitre("l'Alchimiste");

//		entityTransaction.begin(); // début de la transaction
//
//		entityManager.persist(livre2); // Ajout du livre à la base de données
//		
//		entityTransaction.commit(); // Commit et fin de la transaction

		/*
		 * Modification du titre du livre d'identifiant 5 qui possède une erreur : le
		 * nouveau titre doit être « Du plaisir dans la cuisine » au lieu de « 1001
		 * recettes de Cuisine ».
		 */
		
//		entityTransaction.begin();
//		
//		Livre livreId5 = entityManager.find(Livre.class, 5);
//		
//		livreId5.setTitre("Du plaisir dans la cuisine");
//		entityManager.merge(livreId5);
//		
//		entityTransaction.commit();
		
		// Requête JPQL pour extraire de la base un livre en fonction de son titre.
		TypedQuery<Livre> query1 = entityManager.createQuery("select l from Livre l where l.titre = 'l''Alchimiste'", Livre.class);
		
		Livre livreSelectionne = query1.getResultList().get(0);
		
		System.out.println(livreSelectionne);
		
		
		// Requête JPQL pour extraire de la base un livre en fonction de son auteur.
		TypedQuery<Livre> query2 = entityManager.createQuery("select l from Livre l where l.auteur like '%Tolstoï%'", Livre.class);
		
		Livre livreReponse = query2.getResultList().get(0);
		
		System.out.println(livreReponse);
		
		
		// Suppression d'un livre dans la base de données
		entityTransaction.begin();
		
		Livre livreASupprimer = entityManager.find(Livre.class, 1);
		
		if (livreASupprimer != null) {
			entityManager.remove(livreASupprimer);
		}
		
		entityTransaction.commit();
		
		// Affichage de tous les livre présent dans la base de données (titre et auteur)
		
		TypedQuery<Livre> query3 = entityManager.createQuery("select l from Livre l", Livre.class);
		
		List<Livre> resultats = query3.getResultList();
		
		resultats.forEach(System.out::println);

		entityManager.close(); // Cloture du manager d'entité

	}

}
