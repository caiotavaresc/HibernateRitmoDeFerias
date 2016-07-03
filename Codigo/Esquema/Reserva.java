package Esquema;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Reserva {
    @EmbeddedId
    private ReservaPK id;

    public void setId(ReservaPK id) {
        this.id = id;
    }

    public ReservaPK getId() {
        return id;
    }
    
    public Reserva(SalaSquash _nroIdSala, Socio _socio, Calendar data_hora)
    {
        this.id = new ReservaPK();
        this.id.setNroIdSala(_nroIdSala);
        this.id.setNroSocio(_socio);
        this.id.setDataHora(data_hora);
    }
}
