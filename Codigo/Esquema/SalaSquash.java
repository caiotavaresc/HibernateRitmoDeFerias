package Esquema;

import javax.persistence.*;

@Entity
public class SalaSquash extends Sala{
    @Enumerated(EnumType.STRING)
    private EstadoSala estado;
}
