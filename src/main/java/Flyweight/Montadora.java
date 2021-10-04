package Flyweight;

public class Montadora {
    private String nome;
    private String MontCar;

    public Montadora(String nome, String MontCar) {
        this.nome = nome;
        this.MontCar = MontCar;
    }
    public String nome() {
        return nome;
    }
    public String getMontCar() {
        return MontCar;
    }
}
