import java.util.ArrayList;

public class CocheGestor {

    ArrayList<Coche> listaCoches = new ArrayList<>();

    public void addCoche(Cliente cliente, String matricula, String modelo, String descripcionFallo) {
		
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");
			}
		}

		Coche coche = new Coche(cliente, matricula,modelo,descripcionFallo);
		listaCoches.add(coche);

	}

	public Coche buscarCoche(String matricula) {

		for (Coche coche : listaCoches) {
			if (coche.getMatricula().equals(matricula)) {
				return coche;
			}
		}
		return null;
	
	}

	public boolean modificarCoche(String matricula, String nuevoFallo) {

		Coche coche = buscarCoche(matricula); 
		
		if (coche != null) {
			coche.setDescripcionFallo(nuevoFallo);
			return true;
		}
		return false; 
	
	}

}