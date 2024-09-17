/*Controla a lógica da calculadora, aplicando as operações matemáticas
por meio de uma instância da classe Operacoes. Não realiza operações
diretamente, mas delega essa responsabilidade.*/

public class Calculadora {

    private Operacoes operacoes;

    // Construtor inicializando com a instância de Operacoes
    public Calculadora(double numeroInicial) {
        this.operacoes = new Operacoes();
        this.operacoes.setResult(numeroInicial);
    }

    // Método para realizar a operação com base no operador
    public void realizarOperacao(String operador, double numero) {
        switch (operador) {
            case "+":
                operacoes.getSomar(numero);
                break;
            case "-":
                operacoes.getSubtr(numero);
                break;
            case "*":
                operacoes.multiplicar(numero);
                break;
            case "/":
                operacoes.dividir(numero);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }

    // Método para obter o resultado atual
    public double getResult() {
        return operacoes.getResult();
    }
}