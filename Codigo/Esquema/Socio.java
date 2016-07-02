package Esquema;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Socio {
    @Id @GeneratedValue
    private int nroSocio;
    
    private String nome;
    
    private String endereco;
    
    private String telefone;
    
    private String profissao;
    
    private String dadosBancarios;
    
    @ManyToMany
    @JoinTable(name="matricula", joinColumns = @JoinColumn(name="NroSocio"), inverseJoinColumns = @JoinColumn(name="CodigoAula"))
    private Collection<Aula> matriculas;

}
