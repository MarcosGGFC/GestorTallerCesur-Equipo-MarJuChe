package taller;

import java.util.Scanner;

import taller.logic.CitasGestor;
import taller.logic.ClienteGestor;
import taller.logic.CocheGestor;
import taller.logic.EmpleadoGestor;
import taller.logic.FacturasGestor;

public class Main {
	
	private static CitasGestor gestorCitas = new CitasGestor();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
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

}