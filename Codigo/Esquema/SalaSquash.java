package Esquema;

import javax.persistence.*;

@Entity
public class SalaSquash extends Sala{
    @Enumerated(EnumType.STRING)
    private EstadoSala estado;

    public void setEstado(EstadoSala estado) {
        this.estado = estado;
    }

    public EstadoSala getEstado() {
        return estado;
    }
    
    public SalaSquash(int _nroIdSala, double _area, String _localizacao, EstadoSala _estadoSala)
    {
        super(_nroIdSala, _area, _localizacao, TipoSala.SQUASH);
        this.estado = _estadoSala;
    }
}
