import java.util.ArrayList;

public class Factura {
	
	private int id;
	private ArrayList<Item> listaElementos;
	
	public int getId() {
		return id;
	}
	
	public ArrayList<Item> getListaElementos() {
		return listaElementos;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setListaElementos(ArrayList<Item> listaElementos) {
		this.listaElementos = listaElementos;
	}
	
	public Factura(int id, ArrayList<Item> listaElementos) {
		this.id = id;
		this.listaElementos = listaElementos;
	}
	
	@Override
	public String toString() {
		return "Factura [id=" + id + ", listaElementos=" + listaElementos + "]";
	}
}