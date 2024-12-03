package clases;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {

    @Id private String referencia;
    private String nombreProducto;
    private double precio;

    public Producto(String referencia, String nombreProducto, double precio) {
        this.referencia = referencia;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
