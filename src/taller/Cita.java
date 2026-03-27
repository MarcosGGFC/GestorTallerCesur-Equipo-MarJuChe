package taller;

public class Cita {
	private String fecha;
	private String hora;
	private Cliente cliente;
	private Coche coche;
	private Factura factura;
	private Empleado empleado;

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Coche getCoche() {
		return coche;
	}

	public Factura getFactura() {
		return factura;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
