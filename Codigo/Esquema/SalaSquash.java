package Esquema;

import javax.persistence.*;
import java.util.List;

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
    
    public SalaSquash()
    {
        super();
    }
    
    public static List<SalaSquash> listarSalas(EntityManager manager)
    {
        
        String texto = "SELECT s FROM SalaSquash s ORDER BY s.nroIdSala";
        Query consulta = manager.createQuery(texto);
        
        List<SalaSquash> resultado = consulta.getResultList();
        
        return resultado;
    }
}
