package taller;

public class Servicio extends Item {

    // Constructor: Para crear el servicio con datos iniciales
    public Servicio(String nombre, double precio) {
        super(0, nombre, "", precio, 0);
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + "€";
    }
}