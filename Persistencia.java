import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistencia {

    private static final String FICHERO_EMPLEADOS = "empleados.txt";

    public static void guardarEmpleados(ArrayList<Empleado> listaEmpleados) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(FICHERO_EMPLEADOS))) {
            for (Empleado empleadoActual : listaEmpleados) {
                escritor.println(empleadoActual.getNombre() + "," + empleadoActual.getPuesto() + "," + empleadoActual.getSueldo() + "," + empleadoActual.getTurno() + "," + empleadoActual.isEstaDisponible());
            }
        } catch (IOException error) {
            System.out.println("Error al guardar: " + error.getMessage());
        }
    }

    public static ArrayList<Empleado> cargarEmpleados() {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        File archivoEmpleados = new File(FICHERO_EMPLEADOS);
        
        if (!archivoEmpleados.exists()) {
            return listaEmpleados;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoEmpleados))) {
            String lineaTexto;
            while ((lineaTexto = lector.readLine()) != null) {
                String[] datosEmpleado = lineaTexto.split(",");
                
                if (datosEmpleado.length == 5) {
                    String nombre = datosEmpleado[0];
                    String puesto = datosEmpleado[1];
                    double sueldo = Double.parseDouble(datosEmpleado[2]);
                    String turno = datosEmpleado[3];
                    String disponibilidad = datosEmpleado[4];

                    Empleado nuevoEmpleado = new Empleado(nombre, puesto, sueldo, turno);
                    
                    if (disponibilidad.equals("false")) {
                        nuevoEmpleado.cambiarEstado();
                    }
                    
                    listaEmpleados.add(nuevoEmpleado);
                }
            }
        } catch (Exception error) {
            System.out.println("Error al cargar: " + error.getMessage());
        }
        return listaEmpleados;
    }

}