package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MontadoraFactory {
    public static Map<String, Montadora> Montadoras = new HashMap<>();

    public static Montadora getMontadora(String VIN, String MontCar) {
        Montadora Montadora = Montadoras.get(VIN);
        if (Montadora == null) {
            Montadora = new Montadora(VIN, MontCar);
            Montadoras.put(VIN, Montadora);
        }
        return Montadora;
    }

    public static int getTotalMontadoras() {
        return Montadoras.size();
    }

}
