
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora!");
        System.out.print("Digite o número inicial: ");
        double numeroInicial = scanner.nextDouble();

        // Criando uma instância da classe Calculadora
        Calculadora calculadora = new Calculadora(numeroInicial);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a operação (+, -, *, /) ou 'sair' para encerrar: ");
            String operacao = scanner.next();
            if (operacao.equals("sair")) {
                continuar = false;
                break;
            }

            System.out.print("Digite o próximo número: ");
            double numero = scanner.nextDouble();

            // Polimorfismo: seleciona a operação com base no input do usuário
            Operacao operacaoEscolhida = null;
            switch (operacao) {
                case "+":
                    operacaoEscolhida = new get.Soma();
                    break;
                case "-":
                    operacaoEscolhida = get.Subtracao();
                    break;
                case "*":
                    operacaoEscolhida = get.Multiplicacao();
                    break;
                case "/":
                    operacaoEscolhida = get.Divisao();
                    break;
                default:
                    System.out.println("Operação inválida.");
                    continue; // Continua o loop sem alterar o resultado
            }

            // Aplica a operação escolhida
            calculadora.aplicarOperacao(operacaoEscolhida, numero);

            // Exibe o resultado atual
            System.out.println("Resultado atual: " + calculadora.getResultado());
        }

        System.out.println("Calculadora encerrada. Resultado final: " + calculadora.getResultado());
        scanner.close();
    }
}
