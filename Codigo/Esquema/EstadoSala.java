package Esquema;

import javax.persistence.*;

@Entity
public enum EstadoSala {
    LIVRE, RESERVADO;
    
    @Id @GeneratedValue
    private int valor;
}
