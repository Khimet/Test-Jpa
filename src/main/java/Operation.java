import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** Représente l'entité opération
 * @author Khalil HIMET
 *
 */
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
	
	

}
