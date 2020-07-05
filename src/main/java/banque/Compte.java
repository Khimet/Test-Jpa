package banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Représente l'entité compte
 * @author Khalil HIMET
 *
 */
@Entity
@Table(name = "COMPTE")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "SOLDE")
	private Double solde;
	
	@ManyToMany
	@JoinTable(name = "COMPTE_CLIENT",
			joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"))
	private Set<Client> clients;
	
	@OneToMany(mappedBy = "compte")
	private Set<Operation> operations;

	/** Constructeur
	 * @param clients
	 * @param operations
	 */
	public Compte() {
		super();
		clients = new HashSet<Client>();
		operations = new HashSet<Operation>();
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
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return solde
	 */
	public Double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde solde
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
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

	/** Getter
	 * @return operations
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/** Setter
	 * @param operations operations
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}
	
	
	
	
	
	

}
