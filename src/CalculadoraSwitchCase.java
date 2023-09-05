import java.util.Scanner;

public class CalculadoraSwitchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String saida;
        do {

            System.out.print("Digite o primeiro numero: ");
            double num1 = teclado.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double num2 = teclado.nextDouble();

            System.out.println("Escolha a operacao: \n[1] Adicao\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao");
            int operacao = teclado.nextInt();
            switch (operacao) {
                case 1 -> System.out.println(num1 + num2);
                case 2 -> System.out.println(num1 - num2);
                case 3 -> System.out.println(num1 * num2);
                case 4 -> System.out.println(num1 / num2);
            }
            System.out.println("Deseja Sair?");
            saida = teclado.next();
        } while (!saida.equalsIgnoreCase("sim"));


        teclado.close();
    }
}
