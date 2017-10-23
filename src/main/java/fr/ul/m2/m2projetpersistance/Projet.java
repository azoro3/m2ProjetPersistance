import java.util.Date;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public abstract class Projet {
        @Id
	private String refProjet;
	private String nom;
	private String surfaceTotal;
	private String avancement;
	private Date dateFinEstime;
	private String coutTotalEstime;
	private boolean termine;
	private Date dateFinReel;
	public Vector<Acteur> acteur = new Vector<Acteur>();
	public Adresse adresse;
	public Vector<Lot> lot = new Vector<Lot>();
}