package Esquema;

import javax.persistence.*;

@Entity
public class Aparelho {
    
    @Id @GeneratedValue
    private int aparelho;
    
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private EstadoAparelho estado;
    
    @ManyToOne
    @JoinColumn(name="NROIDSALA")
    private Sala nroIdSala;
    
    public Aparelho(String _descricao, EstadoAparelho _estado, Sala _nroIdSala)
    {
        this.descricao = _descricao;
        this.estado = _estado;
        this.nroIdSala = _nroIdSala;
    }

    public int getAparelho() {
        return aparelho;
    }

    public String getDescricao() {
        return descricao;
    }

    public EstadoAparelho getEstado() {
        return estado;
    }

    public Sala getNroIdSala() {
        return nroIdSala;
    }

    public void setAparelho(int aparelho) {
        this.aparelho = aparelho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstado(EstadoAparelho estado) {
        this.estado = estado;
    }

    public void setNroIdSala(Sala nroIdSala) {
        this.nroIdSala = nroIdSala;
    }
}
