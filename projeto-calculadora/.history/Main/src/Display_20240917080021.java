import java.util.Scanner;

public class Ma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora!");
        System.out.print("Digite o número inicial: ");
        double numeroInicial = scanner.nextDouble();

        // Cria uma instância da classe Calculadora
        Calculadora calculadora = new Calculadora(numeroInicial);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a operação (+, -, *, /) ou 'sair' para encerrar: ");
            String operador = scanner.next();

            if (operador.equals("sair")) {
                continuar = false;
                break;
            }

            System.out.print("Digite o próximo número: ");
            double numero = scanner.nextDouble();

            // Aplica a operação
            calculadora.realizarOperacao(operador, numero);

            // Exibe o resultado atual
            System.out.println("Resultado atual: " + calculadora.getResult());
        }

        System.out.println("Calculadora encerrada. Resultado final: " + calculadora.getResult());
        scanner.close();
    }
}