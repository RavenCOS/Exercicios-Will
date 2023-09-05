import java.util.Scanner;

public class CalculadoraIMC {

    static double peso;
    static double altura;
    static double imc;

    static Scanner teclado = new Scanner(System.in);

    public static void coletaPeso() {
        peso = teclado.nextDouble();
    }

    public static void coletaAltura() {
        altura = teclado.nextDouble();

    }

    public static void calculoIMC() {
        imc = peso / Math.pow(altura, 2);
    }

    public static String calculoClassificacao() {
        String resultado = imc < 18.5 ? "Magreza" : "erro";
        resultado = imc >= 18.5 && imc <= 24.9 ? "Normal" : resultado;
        resultado = imc >= 25 && imc <= 29.9 ? "Sobrepeso" : resultado;
        resultado = imc >= 30 && imc <= 34.9 ? "Obesidade grau I" : resultado;
        resultado = imc >= 35 && imc <= 39.9 ? "Obesidade grau II" : resultado;
        resultado = imc >= 40 ? "Obesidade grau III" : resultado;
        return resultado;
    }

    public static void main(String[] args) {

//      03 - Faça uma calculadora que um calcule um IMC de uma pessoa e mostre o número e qual nível dela.

        System.out.print("Digite o seu peso: ");
        coletaPeso();
        System.out.print("Digite sua altura: ");
        coletaAltura();
        calculoIMC();
        String classificacao = calculoClassificacao();

        System.out.printf("Com um Imc de %.1f você se encontra na classificacao: %s", imc, classificacao);
        teclado.close();
    }
}
