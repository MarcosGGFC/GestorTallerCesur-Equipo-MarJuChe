import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistencia {

    private static final String FICHERO_EMPLEADOS = "empleados.txt";

    public static void guardarEmpleados(ArrayList<Empleado> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO_EMPLEADOS))) {
            for (Empleado e : lista) {
                pw.println(e.getNombre() + "," + e.getPuesto() + "," + e.getSueldo() + "," + e.getTurno() + "," + e.isEstaDisponible());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

}