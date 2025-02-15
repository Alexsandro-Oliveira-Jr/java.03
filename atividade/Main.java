package atividade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

//informações sobre o carro

        System.out.println("Digite as informações abaixo:\n");

        System.out.println("Informções sobre o carro\n");

        System.out.println("Digite O Número da placa: ");
        String placa1 = sc.nextLine();

        System.out.println("\nDigite A Cor: ");
        String cor1 = sc.nextLine();

        System.out.println("\nDigite O Número de passageiros: ");
        int Numpg1 = sc.nextInt();
            sc.nextLine();

        System.out.println("\nDigite A Capacidade do tanque: ");
        double capacidade = sc.nextDouble();

        System.out.println("\nDigite A Velocidade máxima: ");
        int velocidade = sc.nextInt();
            sc.nextLine();

        System.out.println("\nDigite O Consumo médio: ");
        int consumo = sc.nextInt();

    Carro car = new Carro(placa1, placa1, cor1, Numpg1, capacidade, velocidade, consumo);

System.out.println("____________________________");

    System.out.println("\nNúmero da placa: ");
    System.out.println("" + placa1);

    System.out.println("\nCor: ");
    System.out.println(cor1);

    System.out.println("\nNúmero de passageiros: ");
    System.out.println(Numpg1);

    System.out.println("\nCapacidade do tanque: ");
    System.out.println(capacidade);

    System.out.println("\nVelocidade máxima: ");
    System.out.println(velocidade);

    System.out.println("\nConsumo médio: ");
    System.out.println(consumo);        

//informações sobre o livro



Livro livro1 = new Livro("Ladrão de raios", "Jack.h.", "AFLHJGRBV", 10, 190);

System.out.println("\n\ntitulo: " + livro1.getTitulo());
System.out.println("Autor: " + livro1.getAutor());
System.out.println("ISBN: " + livro1.getISBN());
System.out.println("Número de páginas: " + livro1.getNumPG());
System.out.println("Valor: " + livro1.getValor());



sc.close();
    }
    


}
