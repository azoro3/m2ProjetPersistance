import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T11:20:02")
@StaticMetamodel(Acteur.class)
public class Acteur_ { 

    public static volatile ListAttribute<Acteur, Projet> projet_;
    public static volatile SingularAttribute<Acteur, ETitre> titre;
    public static volatile SingularAttribute<Acteur, Entreprise> entreprise_;
    public static volatile SingularAttribute<Acteur, String> nom;
    public static volatile SingularAttribute<Acteur, EStatut> status;

}