package Esquema;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Sala {
    @Id @GeneratedValue
    private int nroIdSala;
    
    private double area;
    
    private String localizacao;
    
    @Enumerated(EnumType.ORDINAL)
    private TipoSala tipoSala;
}
