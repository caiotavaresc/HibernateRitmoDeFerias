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
}
