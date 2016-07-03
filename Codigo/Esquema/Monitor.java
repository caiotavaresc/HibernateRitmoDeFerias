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

    public Monitor(long _Rg, String _nome, String _telefone, String _titulacao)
    {
        this.Rg = _Rg;
        this.nome = _nome;
        this.telefone = _telefone;
        this.titulacao = _titulacao;
    }
    
    public void setRg(long Rg) {
        this.Rg = Rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setPodeLecionar(Collection<Aula> podeLecionar) {
        this.podeLecionar = podeLecionar;
    }

    public long getRg() {
        return Rg;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public Collection<Aula> getPodeLecionar() {
        return podeLecionar;
    }
    
}
