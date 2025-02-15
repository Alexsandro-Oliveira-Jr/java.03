package atividade;


public class Carro {

    private String placa;
    private String nome;
    private String cor;
    private int numPassageiros;
    private double CapacidadeTanque;
    private int velocidadeMx;
    private double consumo;


    public String getPlaca() {
        return placa;
    }public Carro(String placa, String nome, String cor, int numPassageiros, double capacidadeTanque, int velocidadeMx,
        double consumo) {
    this.placa = placa;
    this.nome = nome;
    this.cor = cor;
    this.numPassageiros = numPassageiros;
    CapacidadeTanque = capacidadeTanque;
    this.velocidadeMx = velocidadeMx;
    this.consumo = consumo;
}

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        CapacidadeTanque = capacidadeTanque;
    }
    public int getVelocidadeMx() {
        return velocidadeMx;
    }
    public void setVelocidadeMx(int velocidadeMx) {
        this.velocidadeMx = velocidadeMx;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }


    






}
