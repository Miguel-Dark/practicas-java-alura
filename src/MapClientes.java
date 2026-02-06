import java.util.HashMap;
import java.util.Map;

public class MapClientes {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Génesys");
        clientes.put(2, "Marcos");
        clientes.put(3, "Maria");
        System.out.println("El nombre del cliente con ID 2 es: "+clientes.get(2));

        for (Integer i : clientes.keySet()) {
            System.out.println(i);
        }
        for (String i : clientes.values()) {
            System.out.println(i);
        }

// Recorriendo el mapa completo (clave y valor) de una sola vez usando entrySet
        for (Map.Entry<Integer, String> entrada : clientes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " - Nombre: " + entrada.getValue());
        }
    }
}
