package dao;

import clases.Producto;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ProductoDAO {

    public static void create(Producto producto) {
            EntityManager em = ConexionODB.connect();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
    }

    public static Producto read(String referencia) {
        Producto devolver = null;
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        devolver = em.find(Producto.class,referencia);
        em.getTransaction().commit();
        return devolver;
    }

    public static void update(String referencia, String producto , double precio) {
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        Producto p = em.find(Producto.class,referencia);
        p.setNombreProducto(producto);
        p.setPrecio(precio);
        em.getTransaction().commit();
    }

    public static void delete(Producto producto) {
        EntityManager em = ConexionODB.connect();
        em.getTransaction().begin();
        em.remove(producto);
        em.getTransaction().commit();
    }

    public static List<Producto> buscarPorPrecio(double precio) {
        EntityManager em = ConexionODB.connect();
        String jpql = "SELECT p FROM Producto p WHERE p.precio > :prec" ;
        Query query = em.createQuery(jpql);
        query.setParameter("prec", precio);
        List<Producto> productos = query.getResultList();
        em.close();
        return productos;
    }

    public static List<Producto> buscarPorRango (double precioMin, double precioMax) {
        EntityManager em = ConexionODB.connect();
        String jpql = "SELECT p FROM Producto p WHERE p.precio > :precMin AND p.precio < :precMax" ;
        Query query = em.createQuery(jpql);
        query.setParameter("precMin", precioMin);
        query.setParameter("precMax", precioMax);
        List<Producto> productos = query.getResultList();
        em.close();
        return productos;
    }


}
