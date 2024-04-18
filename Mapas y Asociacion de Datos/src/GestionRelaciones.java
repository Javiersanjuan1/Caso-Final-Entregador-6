import java.util.*;

public class GestionRelaciones {
    public static void main(String[] args) {
        // Crear un mapa para asociar números con letras
        Map<Integer, String> mapaNumerosLetras = new HashMap<>();
        mapaNumerosLetras.put(1, "A");
        mapaNumerosLetras.put(2, "B");
        mapaNumerosLetras.put(3, "C");
        mapaNumerosLetras.put(4, "D");

        // Imprimir el mapa
        System.out.println("Mapa de números a letras:");
        for (Map.Entry<Integer, String> entry : mapaNumerosLetras.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Crear un mapa para asociar números con sus representaciones textuales
        Map<Integer, String> mapaNumerosTexto = new HashMap<>();
        mapaNumerosTexto.put(1, "uno");
        mapaNumerosTexto.put(2, "dos");
        mapaNumerosTexto.put(3, "tres");
        mapaNumerosTexto.put(4, "cuatro");

        // Imprimir el mapa
        System.out.println("\nMapa de números a representaciones textuales:");
        for (Map.Entry<Integer, String> entry : mapaNumerosTexto.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Recuperar información asociada de manera eficiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese un número para obtener su representación textual: ");
        int numero = scanner.nextInt();
        if (mapaNumerosTexto.containsKey(numero)) {
            String representacionTexto = mapaNumerosTexto.get(numero);
            System.out.println("El número " + numero + " se representa como \"" + representacionTexto + "\".");
        } else {
            System.out.println("No se encontró una representación textual para el número " + numero + ".");
        }
        scanner.close();
    }
}
