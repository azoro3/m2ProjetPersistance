import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
@Entity
public class Acteur {
        @Id
        private String nom;
        @Enumerated(EnumType.STRING)
	private ETitre titre;
        @Enumerated(EnumType.STRING)
	private EStatut status;
	public Entreprise entreprise_;
	public Vector<Projet> projet_ = new Vector<Projet>();
}