package entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/** Représente la table livre dans la base de données compta
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "LIVRE")
public class Livre {
	
	@Id
	private Integer id;
	
	@Column(name = "TITRE")
	private String titre;
	
	@Column(name = "AUTEUR")
	private String auteur;

	@Override
	public String toString() {
		return "Livre id= " + id + ", titre= " + titre + ", auteur= " + auteur;
	}
	
	@ManyToMany
	@JoinTable(name = "COMPO",
	joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
	private Set<Emprunt> emprunts;

	/** Constructeur
	 * 
	 */
	public Livre() {
		
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
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter
	 * @param titre titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter
	 * @return auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param auteur auteur
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
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
