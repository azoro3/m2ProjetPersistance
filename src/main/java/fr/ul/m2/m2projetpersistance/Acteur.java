import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Acteur {
        @Id
        private String nom;
	private ETitre titre;
	private EStatut status;
	public Entreprise entreprise_;
	public Vector<Projet> projet_ = new Vector<Projet>();
}