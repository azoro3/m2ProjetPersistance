import java.util.Vector;
import javax.persistence.Entity;
@Entity
public class Immeuble extends Projet {
	private String nbNiveaux;
	public Vector<Appartement> appartement = new Vector<Appartement>();
}