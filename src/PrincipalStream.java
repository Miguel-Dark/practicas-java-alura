import java.util.List;
import java.util.stream.Collectors;

public class PrincipalStream {
    public static void main(String[] args) {
        // PARTE DE EMPLEADOS (Filtrado)
//        List<String> empleados = List.of("Génesys", "Ana", "Alberto", "Gabriela");
//
//        List<String> empleadosLetraA = empleados.stream()
//                .filter(empleado -> empleado.startsWith("A"))
//                .collect(Collectors.toList());
//
//        System.out.println(empleados);
//        System.out.println(empleadosLetraA);

        // PARTE DE VENTAS (Mapeo y Transformación)
        List<Double> valorDeVentas = List.of(200.0, 4000.0, 50.0);

        // Toma cada venta y le calcula el 5% de comisión
        List<Double> comision = valorDeVentas.stream()
                .map(valor -> valor * 0.05)
                .collect(Collectors.toList());
        System.out.println(valorDeVentas);
        System.out.println(comision);

        // PARTE DE COMISIONES FILTRADAS
        // Calcula la comisión y luego solo deja las que son mayores a 12.0
        List<Double> comisionFilter = valorDeVentas.stream()
                .map(valor -> valor * 0.05)
                .filter(valor -> valor > 12.0)
                .collect(Collectors.toList());
        System.out.println(comisionFilter);

        // PARTE DE TOTALIZACIÓN (Reducción)
        // Suma todos los valores de la lista empezando desde 0.0
        double valorTotalDeVentas = valorDeVentas.stream()
                .reduce(0.0, Double::sum);
        System.out.println(valorTotalDeVentas);
    }
}
