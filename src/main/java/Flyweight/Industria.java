package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Industria {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void cadrstro(String VINVeiculo, String nomeMontadora, String MontCar) {
        Montadora Montadora = MontadoraFactory.getMontadora(nomeMontadora, MontCar);
        Veiculo Veiculo = new Veiculo(VINVeiculo, Montadora);
        veiculos.add(Veiculo);
    }

    public List<String> obterVeiculos() {
        List<String> saida = new ArrayList<String>();
        for (Veiculo Veiculo : this.veiculos) {
            saida.add(Veiculo.obterVeiculo());
        }
        return saida;
    }


}
