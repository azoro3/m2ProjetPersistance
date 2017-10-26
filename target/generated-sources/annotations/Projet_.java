import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T11:20:02")
@StaticMetamodel(Projet.class)
public abstract class Projet_ { 

    public static volatile ListAttribute<Projet, Lot> lot;
    public static volatile SingularAttribute<Projet, Boolean> termine;
    public static volatile SingularAttribute<Projet, String> avancement;
    public static volatile SingularAttribute<Projet, String> coutTotalEstime;
    public static volatile SingularAttribute<Projet, String> surfaceTotal;
    public static volatile SingularAttribute<Projet, String> refProjet;
    public static volatile SingularAttribute<Projet, Adresse> adresse;
    public static volatile SingularAttribute<Projet, Date> dateFinEstime;
    public static volatile SingularAttribute<Projet, String> nom;
    public static volatile SingularAttribute<Projet, Date> dateFinReel;
    public static volatile ListAttribute<Projet, Acteur> acteur;

}