import java.util.HashMap;
import java.util.Map;

public class VerificacionClave {
    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Génesys");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Gabriela");
        clientes.put(5, "Ellen");


        int idCliente = 5;

        if (clientes.containsKey(idCliente)) {
            String nombreCliente = clientes.get(idCliente);
            System.out.println("El nombre del cliente con ID "+idCliente+ " es: "+nombreCliente);
        } else{
            System.out.println("Cliente con ID "+idCliente+" no encontrado.");
        }


        int clienteId = 6;

        if (clientes.containsKey(clienteId)) {
            String nombreCliente = clientes.get(clienteId);
            System.out.println("El nombre del cliente con ID "+clienteId+ " es: "+nombreCliente);
        } else{
            System.out.println("Cliente con ID "+clienteId+" no encontrado.");
        }

        System.out.println("Tamaño del sistema: "+clientes.size());
    }
}
