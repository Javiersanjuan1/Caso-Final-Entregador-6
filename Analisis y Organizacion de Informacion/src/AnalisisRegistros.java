import java.util.*;

public class AnalisisRegistros {
    public static void main(String[] args) {
        // Ejemplo de registros de transacciones de venta
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta("Producto A", 100, 500.0));
        ventas.add(new Venta("Producto B", 150, 750.0));
        ventas.add(new Venta("Producto C", 200, 1000.0));
        ventas.add(new Venta("Producto D", 50, 300.0));

        // Ordenar ventas por monto total de forma descendente
        Collections.sort(ventas, Comparator.comparing(Venta::getMontoTotal).reversed());

        System.out.println("Ventas ordenadas por monto total (descendente):");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }

        // Filtrar ventas con cantidad mayor a 100
        List<Venta> ventasFiltradas = new ArrayList<>();
        for (Venta venta : ventas) {
            if (venta.getCantidad() > 100) {
                ventasFiltradas.add(venta);
            }
        }

        System.out.println("\nVentas con cantidad mayor a 100:");
        for (Venta venta : ventasFiltradas) {
            System.out.println(venta);
        }
    }
}

class Venta {
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getMontoTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", montoTotal=" + getMontoTotal() +
                '}';
    }
}
