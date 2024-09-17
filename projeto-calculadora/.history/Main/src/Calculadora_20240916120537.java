/*Controla a lógica da calculadora, aplicando as operações matemáticas, p*/
public class Calculadora {

    private Operacoes operacoes;

    // Construtor inicializando com a instância de Operacoes
    public Calculadora(double numeroInicial) {
        this.operacoes = new Operacoes();
        this.operacoes.setResultado(numeroInicial);
    }

    // Método para realizar a operação com base no operador
    public void realizarOperacao(String operador, double numero) {
        switch (operador) {
            case "+":
                operacoes.somar(numero);
                break;
            case "-":
                operacoes.subtrair(numero);
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
    public double getResultado() {
        return operacoes.getResultado();
    }
}