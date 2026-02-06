import java.util.HashSet;
import java.util.Set;

public class ElementosUnicos {
    public static void main(String[] args) {
        Set<String> eventos = new HashSet<>();
        eventos.add("IA Conference");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference");
        eventos.add("DevFest");

        System.out.println("Lista de eventos: "+eventos);
    }
}
