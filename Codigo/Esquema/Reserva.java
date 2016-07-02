package Esquema;

import javax.persistence.*;

@Entity
public class Reserva {
    @EmbeddedId
    private ReservaPK id;
}
