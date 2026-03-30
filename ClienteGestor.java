import java.util.ArrayList;

public class ClienteGestor {

    private ArrayList<Cliente> listaClientes;

    public ClienteGestor() {
        this.listaClientes = new ArrayList<>();
    }

    public void altaCliente(String dni, String nombre, String apellido) {
       
        listaClientes.add(new Cliente(dni, nombre, apellido));

    }


}