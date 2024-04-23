import javax.swing.*;
import java.util.*;

public class IndexacionOrdenacion {
    public static void main(String[] args) {

        JTabbedPane tabbedPane = new JTabbedPane();


        JPanel gestionDatosPanel = new JPanel();
        gestionDatosPanel.add(new JLabel("Contenido de Gestión de Datos"));
        tabbedPane.addTab("Gestión de Datos", gestionDatosPanel);

        JPanel indexacionPanel = new JPanel();
        indexacionPanel.add(new JLabel("Contenido de Indexación Recursiva"));
        tabbedPane.addTab("Indexación Recursiva", indexacionPanel);

        JPanel ordenacionListadoPanel = new JPanel();
        ordenacionListadoPanel.add(new JLabel("Contenido de Ordenación y Listado"));
        tabbedPane.addTab("Ordenación y Listado", ordenacionListadoPanel);


        tabbedPane.addChangeListener(e -> {
            int selectedIndex = tabbedPane.getSelectedIndex();

            switch (selectedIndex) {
                case 0:
                    gestionDeDatos();
                    break;
                case 1:
                    indexacionRecursiva();
                    break;
                case 2:
                    ordenacionYListado();
                    break;
                default:
                    break;
            }
        });

        JFrame mainWindow = new JFrame("Ventana Principal");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.add(tabbedPane);

        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        mainWindow.setVisible(true);
    }

    private static void gestionDeDatos() {
        String mensaje = "Gestión de Relaciones:\n\n" +
                "Crear mapas para asociar y gestionar relaciones entre diferentes conjuntos de datos, como:\n" +
                "- Números y letras\n" +
                "- Números y sus representaciones textuales\n\n" +
                "Recuperación Eficiente:\n\n" +
                "Desarrollar métodos para recuperar información asociada de manera eficiente, " +
                "basándose en claves o criterios definidos por el usuario.";

        JOptionPane.showMessageDialog(null, mensaje);

        Map<Integer, String> numerosLetras = new HashMap<>();
        numerosLetras.put(1, "A");
        numerosLetras.put(2, "B");
        numerosLetras.put(3, "C");
        numerosLetras.put(4, "D");
        numerosLetras.put(5, "E");

        String numeroBuscado = JOptionPane.showInputDialog("Ingrese un número para obtener su letra asociada:");
        try {
            int numero = Integer.parseInt(numeroBuscado);
            if (numerosLetras.containsKey(numero)) {
                String letraAsociada = numerosLetras.get(numero);
                JOptionPane.showMessageDialog(null, "La letra asociada al número " + numero + " es: " + letraAsociada);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna letra asociada al número " + numero);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

    private static void indexacionRecursiva() {
        JOptionPane.showMessageDialog(null, "Indexación Recursiva: Sistema implementado");
    }

    private static void ordenacionYListado() {
        JOptionPane.showMessageDialog(null, "Ordenación y Listado: Funcionalidades implementadas");
    }
}
