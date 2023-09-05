import java.util.Scanner;

public class CalculadoraIMC {

    public static double coleta(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }
    public static void main(String[] args) {

//      03 - Faça uma calculadora que um calcule um IMC de uma pessoa e mostre o número e qual nível dela.

        System.out.print("Digite o seu peso: ");
        double peso = coleta();
        System.out.print("Digite sua altura: ");
        double altura = coleta();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("\n Seu imc e de %.1f.", imc);
        String resultado = imc < 18.5 ? " Magreza" : "erro";
        resultado = imc >= 18.5 && imc <= 24.9 ? " Normal" : resultado;
        resultado = imc >= 25 && imc < 29.9 ? " Sobrepeso" : resultado;
        resultado = imc >= 30 && imc < 34.9 ? " Obesidade Grau I" : resultado;
        resultado = imc >= 35 && imc < 39.9 ? " Obesidade Grau II" : resultado;
        resultado = imc >= 40 ? " Obesidade Grau III" : resultado;


        System.out.println(resultado);

    }
}
