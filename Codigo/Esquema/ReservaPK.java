package Esquema;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;

@Embeddable
public class ReservaPK implements Serializable{
    
    @ManyToOne
    @JoinColumn(name="NroIdSala", nullable=false)
    private SalaSquash nroIdSala;
    
    @ManyToOne
    @JoinColumn(name="NroSocio", nullable=false)
    private Socio nroSocio;
    
    @Column(nullable=false)
    private Calendar dataHora;
    
}
