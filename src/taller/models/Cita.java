package taller.models;

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
	
	public Cita(String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.coche = coche;
		this.factura = factura;
		this.empleado = empleado;
	}

}
