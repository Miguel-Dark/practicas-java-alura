import java.util.List;
import java.util.stream.Collectors;

public class CalculoCuadradosStream {
    public static void main(String[] args) {
        // Lista original de números enteros
        List<Integer> numeros = List.of(2, 4, 6, 7, 8, 9, 12, 14, 16, 18, 20, 24);

        // Uso de .map() para transformar cada número en su cuadrado
        List<Integer> numerosAlCuadrado = numeros.stream()
                .map(numero -> numero * numero)// Operación intermedia: eleva al cuadrado
                .collect(Collectors.toList()); // Operación terminal: guarda en nueva lista

// Muestra la lista original y la lista transformada
        System.out.println(numeros);
        System.out.println("Cuadrados de los números: "+numerosAlCuadrado);
    }
}
