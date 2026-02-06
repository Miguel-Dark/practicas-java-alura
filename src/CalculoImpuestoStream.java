import java.util.List;

public class CalculoImpuestoStream {
    public static void main(String[] args) {
        // Nuestra lista de precios iniciales
        List<Double> preciosProductos = List.of(29.99, 49.50, 15.75, 99.99, 103.34);

        // Nuestra lista de precios iniciales
        double totalGastado = preciosProductos.stream()
                .reduce(0.0, Double::sum);

        // Calculamos el 8% de impuesto sobre el total obtenido
        double impuesto = totalGastado * 0.08;

        // Sumamos el impuesto al total para obtener el valor final
        double totalConImpuesto = totalGastado + impuesto;

        // Imprimimos formateando a 2 decimales para que parezca dinero real
        System.out.println("Valor total antes del impuesto: " + String.format("%.2f", totalGastado));
        System.out.println("Valor total con impuesto de 8%: " + String.format("%.2f", totalConImpuesto));
    }
}
