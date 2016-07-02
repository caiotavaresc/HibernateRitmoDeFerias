package Esquema;

import javax.persistence.*;

@Entity
public enum EstadoAparelho {
    DISPONIVEL, INDISPONIVEL;
    
    @Id @GeneratedValue
    private int valor;
}
