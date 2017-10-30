import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Entreprise {
        @Id
	private String nom;
        @Enumerated(EnumType.STRING)
	private ECorpsMetier corpsMetier;
	private String numTel;
	public Adresse adresse;
        @ManyToOne(fetch=FetchType.EAGER)
        @OneToMany(mappedBy="Acteur")
	public Vector<Acteur> acteur = new Vector<Acteur>();
}