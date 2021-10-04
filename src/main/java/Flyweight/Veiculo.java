package Flyweight;

public class Veiculo {
    private String VIN;
    private Montadora MontadoraFabricada;

    public Veiculo(String VIN, Montadora MontadoraFabricada) {
        this.VIN = VIN;
        this.MontadoraFabricada = MontadoraFabricada;

    }


    public String obterVeiculo(){
        return "VIN{" +
                "Veiculo=' " + this.VIN + '\'' +
                ", MontCar='" + MontadoraFabricada.getMontCar() + '\'';
    }
}
