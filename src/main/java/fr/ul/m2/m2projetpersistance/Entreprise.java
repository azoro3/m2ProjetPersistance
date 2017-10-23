import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Entreprise {
        @Id
	private String nom;
	private ECorpsMetier corpsMetier;
	private String numTel;
	public Adresse adresse;
	public Vector<Acteur> acteur = new Vector<Acteur>();
}