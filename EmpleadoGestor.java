import java.util.ArrayList;

public class EmpleadoGestor {

	ArrayList<Empleado> listaEmpleados = Persistencia.cargarEmpleados();

    public void contratarEmpleado(String nombre, String puesto, double sueldo, String turno) {
		Empleado nuevoEmpleado = new Empleado(nombre, puesto, sueldo, turno);
		listaEmpleados.add(nuevoEmpleado);
		Persistencia.guardarEmpleados(listaEmpleados);
	}

    public Empleado buscarEmpleado(String nombre) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getNombre().equalsIgnoreCase(nombre)) {
				return empleado;
			}
		}
		return null;
	}

    // 3. MODIFICAR EMPLEADO
	public boolean modificarEmpleado(String nombre, String nuevoPuesto, double nuevoSueldo, String nuevoTurno) {
		Empleado empleado = buscarEmpleado(nombre);
		
		if (empleado != null) {
			empleado.setPuesto(nuevoPuesto);
			empleado.setSueldo(nuevoSueldo);
			empleado.setTurno(nuevoTurno);
			Persistencia.guardarEmpleados(listaEmpleados);
			return true; 
		}
		return false; 
	}

}