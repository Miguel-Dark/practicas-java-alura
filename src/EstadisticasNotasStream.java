import java.util.List;

public class EstadisticasNotasStream {
    public static void main(String[] args) {
        // Lista de calificaciones
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        // Sumamos todos los elementos de la lista
        double sumaTotal = notas.stream()
                .reduce(0.0, Double::sum); // Empieza en 0.0 y va sumando cada nota

// Calculamos la media dividiendo la suma entre el total de notas
        double media = sumaTotal / notas.size();

        // Buscamos el valor mínimo comparando los números de la lista
        double menorNota = notas.stream()
                .min(Double::compare)// Compara las notas para hallar la más baja
                .get(); // Extrae el valor encontrado

        // Buscamos el valor máximo comparando los números de la lista
        double mayorNota = notas.stream()
                .max(Double::compare)// Compara las notas para hallar la más alta
                .get(); // Extrae el valor encontrado

        // Resultados finales
        System.out.println("La media de las notas es: " + media);
        System.out.println("La nota más baja fue: " + menorNota);
        System.out.println("La nota más alta fue: " + mayorNota);
    }
}
