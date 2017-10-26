import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T11:20:02")
@StaticMetamodel(Lot.class)
public abstract class Lot_ { 

    public static volatile SingularAttribute<Lot, String> avancement;
    public static volatile SingularAttribute<Lot, Entreprise> responsable;
    public static volatile SingularAttribute<Lot, Projet> projet_;
    public static volatile SingularAttribute<Lot, String> numero;
    public static volatile ListAttribute<Lot, Entreprise> realise;
    public static volatile SingularAttribute<Lot, Date> dateDebut;
    public static volatile SingularAttribute<Lot, String> dureeEstime;
    public static volatile SingularAttribute<Lot, String> coutReel;
    public static volatile SingularAttribute<Lot, String> coutEstime;
    public static volatile SingularAttribute<Lot, Date> dateFinReel;

}