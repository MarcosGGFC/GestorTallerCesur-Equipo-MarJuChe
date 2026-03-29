package taller.models;

public class Pieza extends Item {
	private String nombre;
	private String marca;
	private String referencia;
	private double precio;
	private int cantidad;

	public Pieza(String referencia, String nombre, String marca, double precio, int cantidad) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
	}

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pieza [nombre=" + nombre + ", marca=" + marca + ", referencia=" + referencia + ", precio=" + precio
                + ", cantidad=" + cantidad + "]";
    }
}
