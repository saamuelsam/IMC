package IndiceDeMassaCoporal;

import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Peso: ");
        int peso = input.nextInt();

        System.out.print("Altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC de %s: %.2f%n", nome, imc);
    }
}
