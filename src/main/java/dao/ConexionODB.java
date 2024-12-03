package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionODB {
    public static EntityManager connect() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("./db/tienda.odb");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}