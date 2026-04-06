import java.util.ArrayList;

public class FacturasGestor {

    private ArrayList<Factura> listaFacturas = new ArrayList<>();

    public void agregarFactura(Factura factura) {
        listaFacturas.add(factura);
        System.out.println("Factura añadida correctamente: " + factura.getId());
    }

    public Factura buscarFacturaPorId(int id) {
        for (Factura factura : listaFacturas) {
            if (factura.getId() == id) {
                return factura;
            }
        }
        return null;
    }

    public double calcularTotalFactura(int id) {
        Factura factura = buscarFacturaPorId(id);
        if (factura == null) {
            return 0.0;
        }

        double total = 0.0;
        for (Item item : factura.getListaElementos()) {
            total += item.getPrecio();
        }
        return total;
    }
}