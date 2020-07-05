package banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Représente l'entité Client
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name = "BANQUE_ID")
	private Banque banque;
	
	@ManyToMany(mappedBy = "clients")
	private Set<Compte> comptes;
	

	/** Constructeur
	 * 
	 */
	public Client() {
		super();
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
	 * @return dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance dateNaissance
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter
	 * @return adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/** Setter
	 * @param banque banque
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** Getter
	 * @return comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/** Setter
	 * @param comptes comptes
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
	

}
