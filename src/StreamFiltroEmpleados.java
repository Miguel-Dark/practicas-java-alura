import java.util.List;
import java.util.stream.Collectors;

public class StreamFiltroEmpleados {
    public static void main(String[] args) {
        List<String> empleados = List.of("Génesys", "Ellen", "Pedro", "Miguel", "Gabriela", "Sofia", "Divya", "Anna");
// Filtrado usando Streams: seleccionando nombres de 5 letras o menos
        List<String> nombresCortos = empleados.stream()
                .filter(nombre -> nombre.length() <= 5)// Operación intermedia: condición de longitud
                .collect(Collectors.toList()); // Operación terminal: recolecta el resultado

// Impresión de la lista original y la lista filtrada
        System.out.println(empleados);
        System.out.println(nombresCortos);
    }
}
