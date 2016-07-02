package Esquema;

import javax.persistence.*;

@Entity
public class ExperienciaMonitor {
    @Id
    private String expProfissional;
    
    @ManyToOne
    @JoinColumn(name="RGMonitor")
    private Monitor monitor;
}
