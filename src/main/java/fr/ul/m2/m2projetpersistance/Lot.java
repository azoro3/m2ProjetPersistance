import java.util.Date;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
        @OneToMany(mappedBy="Entreprise")
	public Vector<Entreprise> realise = new Vector<Entreprise>();
        @ManyToOne
        @JoinColumn(name="refProjet")
	public Projet projet;
}