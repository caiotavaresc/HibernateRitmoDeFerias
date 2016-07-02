package Esquema;

import java.util.Collection;
import javax.persistence.*;

@Entity
public class Monitor {
    @Id
    private long Rg;
    
    private String nome;
    
    private String telefone;
    
    private String titulacao;
    
    @ManyToMany
    @JoinTable(name="podeLecionar", joinColumns = @JoinColumn(name="RGMonitor"), inverseJoinColumns = @JoinColumn(name="CodigoAula"))
    private Collection<Aula> podeLecionar;
    
}
