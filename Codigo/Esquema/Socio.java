package Esquema;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

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

    public Socio()
    {
        //Construtor padrão não faz nada
    }
    
    public Socio(String _nome, String _endereco, String _telefone, String _profissao, String _dadosBancarios)
    {
        this.nome = _nome;
        this.endereco = _endereco;
        this.telefone = _telefone;
        this.profissao = _profissao;
        this.dadosBancarios = _dadosBancarios;
        
    }
    
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public void setMatriculas(Collection<Aula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getDadosBancarios() {
        return dadosBancarios;
    }

    public Collection<Aula> getMatriculas() {
        return matriculas;
    }

    //Método que lista todos os sócios cadastrados no banco de dados
    public static List<Socio> listarSocios(EntityManager manager)
    {
        String texto = "SELECT s FROM Socio s";
        Query consulta = manager.createQuery(texto);
        
        List<Socio> resultado = consulta.getResultList();
        
        return resultado;
    }
    
}
