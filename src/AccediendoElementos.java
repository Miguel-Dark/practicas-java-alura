import java.util.ArrayList;
import java.util.List;

public class AccediendoElementos {
    public static void main(String[] args) {
        List<String> empleados = new ArrayList<>(List.of("Juan", "Maria", "Ana", "Pedro", "Antonio"));

        System.out.println("La segunda persona de la lista es: "+empleados.get(1));
        System.out.println("Total de empleados: "+empleados.size());

        empleados.set(0, "Génesys");
        System.out.println("Lista actualizada: "+empleados);

    }
}
