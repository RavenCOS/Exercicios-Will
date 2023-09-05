package calculadoraimc;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

//      03 - Faça uma calculadora que um calcule um IMC de uma pessoa e mostre o número e qual nível dela.

        Coleta coleta = new Coleta();
        System.out.print("Digite o seu peso: ");
        coleta.coletaAPeso();
        System.out.print("Digite sua altura: ");
        coleta.coletaAltura();

        System.out.printf("Com um Imc de %.1f você se encontra na classificacao: %s", coleta.getImc(), coleta.getClassificacao());
    }
}
