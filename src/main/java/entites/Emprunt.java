package entites;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Représente l'entité Emprunt
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	@Id
	private Integer id;
	
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;
	
	@Column(name = "DELAI")
	private Integer delai;
	
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany(mappedBy= "emprunts")
	private Set<Livre> livres;
	

	@Override
	public String toString() {
		return "Emprunt id = " + id + " , dateDebut = " + dateDebut + " , delai = " + delai + " , dateFin = " + dateFin
				+ " , Id_client = " + client.getId();
	}

	/** Constructeur
	 * 
	 */
	public Emprunt() {
		super();
		
		livres = new HashSet<Livre>();
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
	 * @return dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut dateDebut
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/** Setter
	 * @param delai delai
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/** Getter
	 * @return dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin dateFin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/** Getter
	 * @return livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}

	/** Setter
	 * @param livres livres
	 */
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}
	
	
	
	

}
