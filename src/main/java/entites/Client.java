package entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Représente un client
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	private Integer id;
	
	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;
	
	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunts;
	
	@Override
	public String toString() {
		return "Client id = " + id + " , nom = " + nom + " , prenom = " + prenom;
	}

	/** Constructeur
	 * 
	 */
	public Client() {
		super();
		emprunts = new HashSet<Emprunt>();
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
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return emprunts
	 */
	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	/** Setter
	 * @param emprunts emprunts
	 */
	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	
	
	

}
