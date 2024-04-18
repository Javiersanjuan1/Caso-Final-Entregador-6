import java.io.*;
import java.util.*;

public class IndexacionOrdenacion {
    public static void main(String[] args) {
        // Ruta del directorio a indexar
        String directorioRaiz = "C:\\Directorio";

        // Crear un mapa para almacenar nombres de archivos y rutas
        Map<String, String> index = new HashMap<>();

        // Indexar archivos recursivamente
        indexarDirectorio(new File(directorioRaiz), index);

        // Ordenar alfabéticamente los nombres de los archivos
        List<String> nombresOrdenados = new ArrayList<>(index.keySet());
        Collections.sort(nombresOrdenados);

        // Listar archivos ordenados junto con sus rutas completas
        System.out.println("Archivos ordenados alfabéticamente:");
        for (String nombre : nombresOrdenados) {
            String ruta = index.get(nombre);
            System.out.println(ruta + "\\" + nombre);
        }
    }

    // Método recursivo para indexar archivos y sus rutas
    private static void indexarDirectorio(File directorio, Map<String, String> index) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile()) {
                        index.put(archivo.getName(), directorio.getAbsolutePath());
                    } else if (archivo.isDirectory()) {
                        indexarDirectorio(archivo, index);
                    }
                }
            }
        }
    }
}
