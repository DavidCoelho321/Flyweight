package Flyweight;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IndustriaTest {

    @Test
    void deveRetornarMontadoras() {
        Industria Industria = new Industria();
        Industria.cadrstro("TERRITORY", "Ford", "BR");
        Industria.cadrstro("RANGER", "Ford", "BR");
        Industria.cadrstro("G 310 GS", "BMW(motos)", "BR");

        List<String> saida = Arrays.asList(
                "Veiculo{VIN='TERRITORY', montadora='Ford', MontCar='BR'}",
                "Veiculo{VIN='RANGER', montadora='Ford', MontCar='BR'}",
                "Veiculo{VIN='G 310 GS', montadora='BMW(motos)', MontCar='BR'}");

        assertEquals(saida, Industria.obterVeiculos());
    }

    @Test
    void deveRetornarTotalMontadoras() {
        Industria Industria = new Industria();
        Industria.cadrstro("TERRITORY", "Ford", "BR");
        Industria.cadrstro("RANGER", "Ford", "BR");
        Industria.cadrstro("G 310 GS", "BMW(motos)", "BR");

        assertEquals(2, MontadoraFactory.getTotalMontadoras());
    }

}