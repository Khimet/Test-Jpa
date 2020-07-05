package banque;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Khalil HIMET
 *
 */
public class BanqueApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création de l'instance de l'Entity Manager Factory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque_db");

		// Création de l'instance Entity Manager
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Instanciation de la transaction
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		// Insertion d'un client
		Client client1 = new Client();
		client1.setNom("Dupont");
		client1.setPrenom("Roger");
		client1.setDateNaissance(LocalDate.of(1950, 4, 27));
		
		Adresse adresse1 = new Adresse();
		adresse1.setCodePostal(75000);
		adresse1.setNumero(107);
		adresse1.setRue("Rue de la Paix");
		adresse1.setVille("Paris");
		
		client1.setAdresse(adresse1);
		
		Banque banque1 = new Banque();
		banque1.setNom("Crédit Agricole");
		
		client1.setBanque(banque1);
		
		entityTransaction.begin();
		
		entityManager.persist(client1);
		
		entityTransaction.commit();
		
		entityManager.close();

	}

}
