
import fr.ul.m2.m2projetpersistance.ETypeAppart;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
@Entity
public class Appartement {
        @Id
	private String niveau;
	private String surface;
        @Enumerated(EnumType.STRING)
	private ETypeAppart type;
}