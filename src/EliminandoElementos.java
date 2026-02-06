import java.util.ArrayList;
import java.util.List;

public class EliminandoElementos {
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>(List.of("Juana", "Lucas", "Pedro", "Antonio"));
        System.out.println("Lista inicial: "+estudiantes);

        estudiantes.remove("Pedro");
        System.out.println("Lista después de la eliminación: "+estudiantes);
    }
}
