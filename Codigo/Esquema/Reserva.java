package Esquema;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Reserva {
    @EmbeddedId
    private ReservaPK id;

    public void setId(ReservaPK id) {
        this.id = id;
    }

    public ReservaPK getId() {
        return id;
    }
    
    public Reserva()
    {
        //Construtor padrão na faz nada
        this.id = new ReservaPK();
    }
    
    //Métodos de set da chave usando valores e busca
    public void setNroIdSala(int nroIdSala, EntityManager manager)
    {
        SalaSquash sala = manager.find(SalaSquash.class, nroIdSala);
        this.id.setNroIdSala(sala);
    }
    
    public void setSocio(int nroSocio, EntityManager manager)
    {
        Socio socio = manager.find(Socio.class, nroSocio);
        this.id.setNroSocio(socio);
    }
    
    public void setDataHora(Calendar data_hora)
    {
        this.id.setDataHora(data_hora);
    }
    
    public Reserva(SalaSquash _nroIdSala, Socio _socio, Calendar data_hora)
    {
        this.id = new ReservaPK();
        this.id.setNroIdSala(_nroIdSala);
        this.id.setNroSocio(_socio);
        this.id.setDataHora(data_hora);
    }
    
    public boolean salaJaReservada(EntityManager manager)
    {
        Reserva res1 = manager.find(Reserva.class, this.id);
        
        if(res1==null)
            return false;
        else
            return true;
    }
    
    //Método que lista todas as reservas de uma sala em ordem ascendente de data
    public static List listarReservasPorSala(EntityManager manager, int nroIdSala)
    {
        SalaSquash sala = manager.find(SalaSquash.class, nroIdSala);
        
        String texto = "SELECT r FROM Reserva r WHERE r.id.nroIdSala = ?1 ORDER BY dataHora ASC";
        Query consulta = manager.createQuery(texto);
        consulta.setParameter(1, sala);
        
        List<Reserva> resultado = consulta.getResultList();
        
        return resultado;
    }
    
    //Método que lista os ids dos sócios e a quantidade de reservas feitas por cada um deles, tanto por mês quanto por ano
    public static List listarMaioresReservadores(EntityManager manager, String tipo)
    {
        String texto;
        if(tipo.equals("A"))
            texto = "SELECT TO_CHAR(R.DATAHORA, 'YYYY') ANO, R.NROSOCIO, TO_CHAR(COUNT(1)) CONTAGEM FROM RESERVA R GROUP BY TO_CHAR(R.DATAHORA, 'YYYY'), R.NROSOCIO ORDER BY TO_CHAR(R.DATAHORA, 'YYYY') ASC, COUNT(1) DESC";
        else
            texto = "SELECT TO_CHAR(R.DATAHORA, 'MM') MES, R.NROSOCIO, TO_CHAR(COUNT(1)) CONTAGEM FROM RESERVA R WHERE TO_CHAR(R.DATAHORA,'YYYY') = TO_CHAR(SYSDATE,'YYYY') GROUP BY TO_CHAR(R.DATAHORA, 'MM'), R.NROSOCIO ORDER BY TO_CHAR(R.DATAHORA, 'MM') ASC, COUNT(1) DESC";

        Query query = manager.createNativeQuery(texto);
        return query.getResultList();
    }
    
    //Classe que lista as reservas ainda não usadas (futuras)
    public static List listarReservasNaoUsadas(EntityManager manager)
    {
        String texto = "SELECT R.NROSOCIO, COUNT(1) FROM RESERVA R WHERE R.DATAHORA > SYSDATE GROUP BY R.NROSOCIO ORDER BY R.NROSOCIO ASC";
        Query consulta = manager.createNativeQuery(texto);
        
        return consulta.getResultList();
    }
}
