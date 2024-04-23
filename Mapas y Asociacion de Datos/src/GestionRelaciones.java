import java.util.*;

public class GestionRelaciones {
    private TreeSet<String> nombres;
    private List<Venta> ventas;

    public GestionDatos() {
        nombres = new TreeSet<>();
        ventas = new ArrayList<>();
    }

    // Método para agregar un nombre al TreeSet
    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    // Método para buscar un nombre en el TreeSet
    public boolean buscarNombre(String nombre) {
        return nombres.contains(nombre);
    }

    // Método para agregar una venta a la lista
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    // Método para ordenar las ventas por producto
    public void ordenarVentasPorProducto() {
        ventas.sort(Comparator.comparing(Venta::getProducto));
    }

    // Método para ordenar las ventas por cantidad
    public void ordenarVentasPorCantidad() {
        ventas.sort(Comparator.comparing(Venta::getCantidad));
    }

    // Método para ordenar las ventas por precio unitario
    public void ordenarVentasPorPrecioUnitario() {
        ventas.sort(Comparator.comparing(Venta::getPrecioUnitario));
    }

    // Método para ordenar las ventas por monto total
    public void ordenarVentasPorMontoTotal() {
        ventas.sort(Comparator.comparing(Venta::getMontoTotal));
    }

    // Método para imprimir las ventas
    public void imprimirVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}