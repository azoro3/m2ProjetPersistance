import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Acteur {
        @Id
        private String nom;
        @Enumerated(EnumType.STRING)
	private ETitre titre;
        @Enumerated(EnumType.STRING)
	private EStatut status;
        @ManyToOne(fetch=FetchType.EAGER)
	public Entreprise entreprise;
        @ManyToMany(cascade = { CascadeType.ALL })
        @JoinTable(
        name="atceur_projet",
                joinColumns={@JoinColumn(name="nom")},
                inverseJoinColumns={@JoinColumn(name="refProjet")}
        )
        public Vector<Projet> projets = new Vector<Projet>();
}