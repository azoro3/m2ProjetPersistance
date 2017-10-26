
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Charpente extends Lot {

    @Enumerated(EnumType.STRING)
    private ECharpente typeCharpente;
}
