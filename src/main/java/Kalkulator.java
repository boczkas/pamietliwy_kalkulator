import java.util.HashMap;
import java.util.Map;

public class Kalkulator {
    Map<String, Double> memory;

    public Kalkulator() {
        this.memory = new HashMap<>();
    }

    public void dodaj(double a, double b){
        String key = a + "+" + b;
        if (memory.containsKey(key)) {
            System.out.println("Czytam z pamieci");
            System.out.println(memory.get(key));
        } else {
            memory.put(key, a + b);
            System.out.println(a + b);
        }
    }

    public void odejmij(double a, double b) {
        System.out.println(a - b);
    }

    public void pomnoz(double a, double b) {
        System.out.println(a * b);
    }

    public void podziel(double a, double b) {
        System.out.println(a / b);
    }
}
