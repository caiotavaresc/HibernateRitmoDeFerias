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
}
