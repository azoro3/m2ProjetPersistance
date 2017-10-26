import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T11:20:02")
@StaticMetamodel(Entreprise.class)
public class Entreprise_ { 

    public static volatile SingularAttribute<Entreprise, Adresse> adresse;
    public static volatile SingularAttribute<Entreprise, String> nom;
    public static volatile SingularAttribute<Entreprise, String> numTel;
    public static volatile SingularAttribute<Entreprise, ECorpsMetier> corpsMetier;
    public static volatile ListAttribute<Entreprise, Acteur> acteur;

}