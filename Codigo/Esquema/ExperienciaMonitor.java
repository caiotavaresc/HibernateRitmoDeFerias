package Esquema;

import javax.persistence.*;

@Entity
public class ExperienciaMonitor {
    @Id
    private String expProfissional;
    
    @ManyToOne
    @JoinColumn(name="RGMonitor")
    private Monitor monitor;

    public ExperienciaMonitor(String _experiencia, Monitor _monitor)
    {
        this.expProfissional = _experiencia;
        this.monitor = _monitor;
    }
    
    public void setExpProfissional(String expProfissional) {
        this.expProfissional = expProfissional;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getExpProfissional() {
        return expProfissional;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
