package dao;

import clases.Contrato;
import clases.Empleado;
import clases.Producto;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmpleadoDAO {

    public static void create(Empleado empleado) {
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        em.persist(empleado);
        em.getTransaction().commit();
    }

    public static Empleado read(int idEmpleado) {
        Empleado devolver = null;
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        devolver = em.find(Empleado.class,idEmpleado);
        em.getTransaction().commit();
        return devolver;
    }

    public static void update(int idEmpleado, String nombre, String apellido) {
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        Empleado e = em.find(Empleado.class,idEmpleado);
        e.setNombre(nombre);
        e.setApellido(apellido);
        em.getTransaction().commit();
    }

    public static void delete(int idEmpleado) {
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        Empleado e = em.find(Empleado.class,idEmpleado);
        em.remove(e);
        em.getTransaction().commit();
    }
}
