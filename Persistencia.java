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

    private static final String FICHERO_CLIENTES = "clientes.txt";

    public static void guardarClientes(ArrayList<Cliente> listaClientes) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(FICHERO_CLIENTES))) {
            for (Cliente clienteActual : listaClientes) {
                escritor.println(clienteActual.getNombre() + "," + clienteActual.getApellido() + "," + clienteActual.getDni());
            }
        } catch (IOException error) {
            System.out.println("Error al guardar clientes: " + error.getMessage());
        }
    }

    public static ArrayList<Cliente> cargarClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        File archivoClientes = new File(FICHERO_CLIENTES);
        if (!archivoClientes.exists()) return listaClientes;
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoClientes))) {
            String lineaTexto;
            while ((lineaTexto = lector.readLine()) != null) {
                String[] datos = lineaTexto.split(",");
                if (datos.length == 3) {
                    listaClientes.add(new Cliente(datos[0], datos[1], datos[2]));
                }
            }
        } catch (Exception error) {
            System.out.println("Error al cargar clientes: " + error.getMessage());
        }
        return listaClientes;
    }



    private static final String FICHERO_COCHES = "coches.txt";

    public static void guardarCoches(ArrayList<Coche> listaCoches) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(FICHERO_COCHES))) {
            for (Coche c : listaCoches) {
                escritor.println(c.getMatricula() + "," + c.getModelo() + "," + c.getDescripcionFallo());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar coches: " + e.getMessage());
        }
    }

    public static ArrayList<Coche> cargarCoches() {
        ArrayList<Coche> lista = new ArrayList<>();
        File archivo = new File(FICHERO_COCHES);
        if (!archivo.exists()) return lista;
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] d = linea.split(",");
                if (d.length == 3) lista.add(new Coche(d[0], d[1], d[2]));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar coches: " + e.getMessage());
        }
        return lista;
    }

}