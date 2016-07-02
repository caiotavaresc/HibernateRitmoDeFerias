package Esquema;

import javax.persistence.*;

@Entity
public enum TipoSala {
    CARDIO, GERAL, SQUASH, MUSCULACAO;
    
    @Id @GeneratedValue
    private int valor;
}
