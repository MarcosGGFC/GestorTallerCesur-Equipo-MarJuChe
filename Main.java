import java.util.Scanner;

public class Main {
	
	private static CitasGestor gestorCitas = new CitasGestor();
	private static ClienteGestor clienteGestor = new ClienteGestor();

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		precargarDatos();
	
		System.out.println("Selecciona una opcion:");
		//System.out.println("Create, Read, Update, Delete");
		System.out.println("1. Citas: ");
		System.out.println("2. Empleados: ");
		System.out.println("3. Clientes: ");
		System.out.println("4. Vehiculos: ");
		System.out.println("5. Facturas: ");
		System.out.println("6. Guardar y salir: ");
		int opcion = sc.nextInt();
	
		switch(opcion) {
		
			case 1 -> {

				menuCitas();

				System.out.println("Selecciona una opcion:");
				opcion = sc.nextInt();

				switch(opcion) {

					case 1 -> CitasGestor.listarCitasHoy();
					case 2 -> CitasGestor.listarFuturasCitas();
					case 3 -> CitasGestor.AgendarCitas();
					case 4 -> CitasGestor.CancelarCitas();
					case 5 -> CitasGestor.ModificarCitas();
				}
			
			}
			
			case 2 -> {

				menuEmpleados(); 

			}

			case 3 -> {
				
				menuClientes();
				System.out.println("Selecciona una opcion:");
				opcion = sc.nextInt();
				sc.nextLine(); 

				switch(opcion) {

					case 1 -> buscarCliente();
                    case 2 -> addCliente();
                    case 3 -> modCliente();
					
				}
				
			}

			case 4 -> {
				
				menuVehiculos();
				
			}
			
			case 5 -> {

				menuFacturas();

			}
			
		}

	}

	private static void menuCitas() {
	
		System.out.println("1. Listar citas de hoy");
		System.out.println("2. Ver futuras citas");
		System.out.println("3. Agendar cita: ");
		System.out.println("4. Cancelar cita: ");
		System.out.println("5. Modificar cita: ");

	}

	private static void menuEmpleados() {
   
        System.out.println("Modificar empleado");
        System.out.println("Contratar empleado: ");
        System.out.println("Ver horario de un empleado");      

    }

	private static void menuClientes() {
   
        System.out.println("Buscar cliente: ");
        System.out.println("Añadir cliente: ");
        System.out.println("Modificar información del cliente: ");      

    }

	private static void menuVehiculos() {
   
        System.out.println("Buscar vehiculo: ");
        System.out.println("Añadir Vehiculo: ");
        System.out.println("Modificar información del Vehiculo: ");

    }

	private static void menuFacturas() {
   
        System.out.println("Buscar por Cliente :");
        System.out.println("Buscar por ID factura: ");
        System.out.println("Buscar por matricula: ");
        System.out.println("Buscar por empleado:  ");
        System.out.println("Buscar por partes:  ");

    }

	private static void addCliente() {
		try {

			System.out.print("Introduce DNI: ");
			String dni = sc.nextLine();

			System.out.print("Introduce Nombre: ");
			String nombre = sc.nextLine();

			System.out.print("Introduce Apellido: ");
			String apellido = sc.nextLine();

			clienteGestor.altaCliente(dni, nombre, apellido);
			System.out.println("Cliente dado de alta correctamente.");

		} catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarCliente() {
		try {
			System.out.print("Introduce el DNI del cliente: ");
			String dni = sc.nextLine();

			Cliente encontrado = clienteGestor.buscarCliente(dni);

			if (encontrado != null) {
				System.out.println("Cliente encontrado: " + encontrado);
			} else {
				System.out.println("No existe ningún cliente con el DNI: " + dni);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

    }

    private static void modCliente() {

		try {
			System.out.print("Introduce el DNI del cliente a modificar: ");
			String dni = sc.nextLine();

			Cliente cliente = clienteGestor.buscarCliente(dni);

			if (cliente != null) {
				System.out.println("Cliente encontrado: " + cliente);
				
				System.out.print("Nuevo nombre: ");
				String nuevoNombre = sc.nextLine();
				
				System.out.print("Nuevo apellido: ");
				String nuevoApellido = sc.nextLine();

				clienteGestor.modificarCliente(dni, nuevoNombre, nuevoApellido);
				System.out.println("Cliente actualizado con éxito.");

			} else {
				System.out.println("No se puede modificar debido a que el DNI no se ha encontrado.");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
    }

	private static void precargarDatos() {
    	clienteGestor.altaCliente("Pepe", "Pérez", "12345678A");
    	clienteGestor.altaCliente("Ana", "García", "87654321B");
    }

}