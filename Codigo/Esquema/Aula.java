package Esquema;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Aula {
    @Id @GeneratedValue
    private int codigo;
    
    private String descricao;
    
    private Calendar dia_hora;
    
    @ManyToOne
    @JoinColumn(name="NroIdSala")
    private Sala sala;
    
    @ManyToOne
    @JoinColumn(name="RGMonitor")
    private Monitor monitor;

    public Aula(String _descricao, Calendar _dia_hora, Sala _sala, Monitor _monitor)
    {
        this.descricao = _descricao;
        this.dia_hora = _dia_hora;
        this.sala = _sala;
        this.monitor = _monitor;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDia_hora(Calendar dia_hora) {
        this.dia_hora = dia_hora;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Calendar getDia_hora() {
        return dia_hora;
    }

    public Sala getSala() {
        return sala;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
