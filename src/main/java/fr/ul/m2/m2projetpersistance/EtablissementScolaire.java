
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class EtablissementScolaire extends BatimentPublic {
	private String nbEleves;
        @Enumerated(EnumType.STRING)
	private EEtatScolaire categorie;
}