import java.util.ArrayList;

public class ClienteGestor {

private ArrayList<Cliente> listaClientes = Persistencia.cargarClientes();

    public ClienteGestor() {
        
    }

    public void altaCliente(String dni, String nombre, String apellido) {
       
        listaClientes.add(new Cliente(nombre, apellido, dni));
        Persistencia.guardarClientes(listaClientes);
    }

    public Cliente buscarCliente(String dni) {
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
        
    }

    public boolean modificarCliente(String dni, String nuevoNombre, String nuevoApellido) {

        Cliente cliente = buscarCliente(dni); 
        if (cliente != null) {
            cliente.setNombre(nuevoNombre);
            cliente.setApellido(nuevoApellido);
            Persistencia.guardarClientes(listaClientes);
            return true; 
        }
        return false; 
        
    }


}