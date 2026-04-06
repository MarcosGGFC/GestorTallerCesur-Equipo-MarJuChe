import java.util.ArrayList;

public class CocheGestor {

    ArrayList<Coche> listaCoches = Persistencia.cargarCoches();

    public void addCoche(String matricula, String modelo, String descripcionFallo) {
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");
				
			}
		}
		Coche coche = new Coche(matricula,modelo,descripcionFallo);
			
		listaCoches.add(coche);
		
		Persistencia.guardarCoches(listaCoches);
	}

}