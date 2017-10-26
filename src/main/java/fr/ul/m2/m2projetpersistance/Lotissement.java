import java.util.Vector;
import javax.persistence.Entity;
@Entity
public class Lotissement extends Projet {
	private String nbMaisons;
	public Vector<Maison> Maison = new Vector<Maison>();
}