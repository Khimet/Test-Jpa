package banque;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** Représente l'entité Adresse
 * @author Khalil HIMET
 *
 */
@Embeddable
public class Adresse {
	
	
	@Column(name = "NUMERO")
	private Integer numero;
	
	@Column(name = "RUE")
	private String rue;
	
	@Column(name = "CODE_POSTAL")
	private Integer codePostal;
	
	@Column(name = "VILLE")
	private String ville;
	
	

	/** Constructeur
	 * 
	 */
	public Adresse() {
		super();
	}


	/** Getter
	 * @return numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero numero
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return rue
	 */
	public String getRue() {
		return rue;
	}

	/** Setter
	 * @param rue rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Getter
	 * @return codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}

	/** Setter
	 * @param codePostal codePostal
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/** Setter
	 * @param ville ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	

}
