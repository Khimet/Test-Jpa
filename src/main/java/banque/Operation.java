package banque;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Représente l'entité opération
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "OPERATION")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DATE")
	private LocalDateTime date;
	
	@Column(name = "MONTANT")
	private Double montant;
	
	@Column(name = "MOTIF")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name = "COMPTE_ID")
	private Compte compte;

	/** Constructeur
	 * 
	 */
	public Operation() {
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
	 * @return date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/** Setter
	 * @param date date
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/** Getter
	 * @return montant
	 */
	public Double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant montant
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/** Getter
	 * @return motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Setter
	 * @param motif motif
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/** Getter
	 * @return compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/** Setter
	 * @param compte compte
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
	

}
