public class Empleado {
	private String nombre;
	private String puesto;
	private double sueldo;
	private String turno;
	private boolean estaDisponible;
	
	public Empleado(String nombre, String puesto, double sueldo, String turno) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.turno = turno;
		this.estaDisponible = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void cambiarEstado() {
		this.estaDisponible = !this.estaDisponible;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre + ", Puesto=" + puesto + ", Sueldo=" + sueldo + "€, Turno=" + turno + ", Disponible=" + estaDisponible + "]";
	}
	
	
}
