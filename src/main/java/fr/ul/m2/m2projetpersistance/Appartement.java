
import fr.ul.m2.m2projetpersistance.ETypeAppart;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Appartement {
        @Id
	private String niveau;
	private String surface;
	private ETypeAppart type;
}