
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse {
        @Id
	private String numero;
	private String rue;
	private String cP;
	private String ville;
}