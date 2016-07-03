package Esquema;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Sala {
    @Id
    private int nroIdSala;
    
    private double area;
    
    private String localizacao;
    
    @Enumerated(EnumType.ORDINAL)
    private TipoSala tipoSala;

    public Sala(int _nroIdSala, double _area, String _localizacao, TipoSala _tipoSala)
    {
        this.nroIdSala = _nroIdSala;
        this.area = _area;
        this.localizacao = _localizacao;
        this.tipoSala = _tipoSala;
    }
    
    public void setNroIdSala(int nroIdSala) {
        this.nroIdSala = nroIdSala;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getNroIdSala() {
        return nroIdSala;
    }

    public double getArea() {
        return area;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
