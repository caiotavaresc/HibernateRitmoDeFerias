package Esquema;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class GeraTabelas {
    static EntityManagerFactory managerFactory;
    
    public static void gerarTabelas() {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sempre_em_forma");
        factory.close();
    }
    
    public static EntityManager criarManager()
    {
        if(managerFactory == null)
           managerFactory = Persistence.createEntityManagerFactory("sempre_em_forma");
        
        return managerFactory.createEntityManager();
    }
    
    public static void closeEntityManager()
    {
        if(managerFactory == null)
            return;
        
        managerFactory.close();
        managerFactory = null;
    }
    
}