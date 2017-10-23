import java.util.Date;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public abstract class Lot {
        @Id
	private String numero;
	private Date dateDebut;
	private String dureeEstime;
	private String coutEstime;
	private String avancement;
	private String coutReel;
	private Date dateFinReel;
	public Entreprise responsable;
	public Vector<Entreprise> realise = new Vector<Entreprise>();
	public Projet projet_;
}