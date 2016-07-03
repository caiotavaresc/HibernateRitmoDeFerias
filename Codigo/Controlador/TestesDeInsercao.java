package Controlador;

import Esquema.*;
import javax.persistence.*;
import java.util.*;

//Classe destinada a inserir dados de teste nas relações
public class TestesDeInsercao {
    
    public static void main(String args[])
    {
        System.out.println("Teste");
        
        EntityManager manager = GeraTabelas.criarManager();
        
        //Iniciar a transação
        manager.getTransaction().begin();
        
        //Inserir os monitores
        Monitor m1 = new Monitor(123456789, "João Gilberto de Lima", "(11) 2088-3012", "Mestre");
        manager.persist(m1);
        
        Monitor m2 = new Monitor(987654321, "Marcia Rodrigues Santana", "(11) 3567-3012", "Bacharel");
        manager.persist(m2);
        
        Monitor m3 = new Monitor(222222222, "Gustavo Menotti Brandão", "(11) 2088-9835", "Pobre");
        manager.persist(m3);
        
        Monitor m4 = new Monitor(333333333, "Tifanny Barbie da Silva", "(11) 5325-5566", "Bandido");
        manager.persist(m4);
        
        Monitor m5 = new Monitor(444444444, "Suzelaine Talacker", "(11) 9385-4832", "Doutor");
        manager.persist(m5);
        
        //Inserir as experiencias dos monitores
        ExperienciaMonitor exp1 = new ExperienciaMonitor("Vendedor de Sapatos", m1);
        manager.persist(exp1);
        
        ExperienciaMonitor exp2 = new ExperienciaMonitor("Criador de Formigas", m3);
        manager.persist(exp2);
        
        ExperienciaMonitor exp3 = new ExperienciaMonitor("Fisiculturista", m5);
        manager.persist(exp3);
        
        //Inserir as salas
        Sala s1 = new Sala(1,25,"Corredor 1",TipoSala.GERAL);
        manager.persist(s1);
        
        Sala s2 = new Sala(2,30,"Corredor 1",TipoSala.MUSCULACAO);
        manager.persist(s2);
        
        Sala s3 = new Sala(3,25,"Corredor 2",TipoSala.CARDIO);
        manager.persist(s3);
        
        Sala s4 = new SalaSquash(10, 120, "Espaço A", EstadoSala.LIVRE);
        manager.persist(s4);
        
        Sala s5 = new SalaSquash(20, 100, "Espaço B", EstadoSala.LIVRE);
        manager.persist(s5);
        
        Sala s6 = new SalaSquash(11, 150, "Espaço C", EstadoSala.LIVRE);
        manager.persist(s6);
        
        //Inserir os Aparelhos
        Aparelho a1 = new Aparelho("Esteira", EstadoAparelho.DISPONIVEL, s1);
        manager.persist(a1);
        
        Aparelho a2 = new Aparelho("Bicicleta", EstadoAparelho.DISPONIVEL, s1);
        manager.persist(a2);
        
        Aparelho a3 = new Aparelho("Argolas", EstadoAparelho.DISPONIVEL, s2);
        manager.persist(a3);
        
        Aparelho a4 = new Aparelho("Desfibrilador", EstadoAparelho.INDISPONIVEL, s3);
        manager.persist(a4);
        
        //Inserir os Sócios
        Socio soc1 = new Socio("Mayko Melo", "Rua das Flores, 16 - Vila Rica/MG", "(41) 4433-8877", "Gestor de Políticas Culturais", "Banco 341 Ag 9879 C/C 44331-9");
        manager.persist(soc1);
        
        Socio soc2 = new Socio("Pedro Álvares Cabral", "Rua Malta, 78 - Lisboa/LI", "+99 90864-8658", "Navegador Ultramarino", "Banco 104 Ag 342 C/C 43314-87");
        manager.persist(soc2);
        
        Socio soc3 = new Socio("Princesa Isabel", "Avenida Barão de Itararé, 887 - Rio de Janeiro/RJ", "(21) 3224-9747", "Filha do Imperador", "Banco 1 Ag 1 C/C 0");
        manager.persist(soc3);
        
        Socio soc4 = new Socio("Joaquim José da Silva Xavier", "Rua Central, 9 - Ouro Preto/MG","(41) 9865-9746","Inconfidente","Banco 1 Ag 32 C/C 0972-99");
        manager.persist(soc4);
        
        //Reservas - Não vai ter porque vai ser via tela
        
        //Aulas
        Aula au1 = new Aula("Esteira 1", new GregorianCalendar(), s1, m1);
        manager.persist(au1);
        
        Aula au2 = new Aula("Bicicleta 1", new GregorianCalendar(), s1, m2);
        manager.persist(au2);
        
        Aula au3 = new Aula("Musculacao 1", new GregorianCalendar(), s2, m5);
        manager.persist(au3);
        
        //Aulas que o monitor pode lecionar
        Collection pd1 = new ArrayList<Aula>();
        pd1.add(au1);
        pd1.add(au2);
        
        Collection pd2 = new ArrayList<Aula>();
        pd2.add(au1);
        pd2.add(au3);
        
        Collection pd3 = new ArrayList<Aula>();
        pd3.add(au2);
        pd3.add(au3);
        
        m1.setPodeLecionar(pd1);
        m2.setPodeLecionar(pd2);
        m3.setPodeLecionar(pd3);
        m4.setPodeLecionar(pd1);
        m5.setPodeLecionar(pd2);
        
        //Inserir Matriculas
        soc1.setMatriculas(pd1);
        soc2.setMatriculas(pd2);
        soc3.setMatriculas(pd3);
        soc4.setMatriculas(pd1);
        
        manager.getTransaction().commit();
        manager.close();
        GeraTabelas.closeEntityManager();
    }
    
}