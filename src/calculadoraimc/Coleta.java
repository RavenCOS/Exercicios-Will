package calculadoraimc;

import java.util.Scanner;

public class Coleta extends CalculadoraIMC {
    protected double peso;
    protected double altura;
    protected double imc;
    protected String classificacao;

    static Scanner teclado = new Scanner(System.in);

    public String getClassificacao() {
        return classificacao;
    }

    public double getImc() {
        return imc;
    }

    public void coletaAPeso() {
        peso = teclado.nextDouble();
    }

    public void coletaAltura() {
        altura = teclado.nextDouble();
        calculoIMC();
    }

    public void calculoIMC(){
        imc = peso / Math.pow(altura,2);
        classificacao();
    }

    public void classificacao(){
        String resultado = imc < 18.5 ? "Magreza" : "erro";
        resultado = imc >= 18.5 && imc <= 24.9 ? "Normal" : resultado;
        resultado = imc >= 25 && imc <= 29.9 ? "Sobrepeso" : resultado;
        resultado = imc >= 30 && imc <= 34.9 ? "Obesidade grau I" : resultado;
        resultado = imc >= 35 && imc <= 39.9 ? "Obesidade grau II" : resultado;
        resultado = imc >= 40 ? "Obesidade grau III" : resultado;
        classificacao = resultado;
    }
}
