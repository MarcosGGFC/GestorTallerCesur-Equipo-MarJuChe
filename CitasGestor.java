import java.time.LocalDate;
import java.util.ArrayList;

public class CitasGestor {

    static ArrayList<Cita> listaCitas = new ArrayList<>();

    public static void listarCitasHoy() {
        String hoy = LocalDate.now().toString();
        System.out.println("Citas de hoy (" + hoy + "):");
        boolean hayCitas = false;
        for (Cita cita : listaCitas) {
            if (hoy.equals(cita.getFecha())) {
                System.out.println(cita);
                hayCitas = true;
            }
        }
        if (!hayCitas) {
            System.out.println("No hay citas programadas para hoy.");
        }
    }

    public static void listarFuturasCitas() {
        LocalDate hoy = LocalDate.now();
        System.out.println("Citas futuras:");
        boolean hayCitas = false;
        for (Cita cita : listaCitas) {
            try {
                LocalDate fechaCita = LocalDate.parse(cita.getFecha());
                if (fechaCita.isAfter(hoy)) {
                    System.out.println(cita);
                    hayCitas = true;
                }
            } catch (Exception e) {
                // Si la fecha no es válida, ignorar
            }
        }
        if (!hayCitas) {
            System.out.println("No hay citas futuras programadas.");
        }
    }

    public static void AgendarCitas(Cita nuevaCita) {
        listaCitas.add(nuevaCita);
        System.out.println("Cita agendada: " + nuevaCita);
    }

    public static void CancelarCitas() {
        // En proceso
    }

    public static void ModificarCitas() {
        // En proceso
    }

}