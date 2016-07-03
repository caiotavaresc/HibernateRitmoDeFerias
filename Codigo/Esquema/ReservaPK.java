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

    public void setNroIdSala(SalaSquash nroIdSala) {
        this.nroIdSala = nroIdSala;
    }

    public void setNroSocio(Socio nroSocio) {
        this.nroSocio = nroSocio;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public SalaSquash getNroIdSala() {
        return nroIdSala;
    }

    public Socio getNroSocio() {
        return nroSocio;
    }

    public Calendar getDataHora() {
        return dataHora;
    }
    
}
