package banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Représente la table Banque de la base de données banque
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "BANQUE")
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM")
	private String nom;
	
	@OneToMany(mappedBy = "banque")
	private Set<Client> clients;
	
	
	
	/** Constructeur
	 * 
	 */
	public Banque() {
		super();
		clients = new HashSet<Client>();
	}

	/** Getter
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/** Setter
	 * @param clients clients
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	

}
