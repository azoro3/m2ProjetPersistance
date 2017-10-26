import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
@Entity
public class Entreprise {
        @Id
	private String nom;
        @Enumerated(EnumType.STRING)
	private ECorpsMetier corpsMetier;
	private String numTel;
	public Adresse adresse;
	public Vector<Acteur> acteur = new Vector<Acteur>();
}