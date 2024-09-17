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
            case "+" -> operacoes.somar(numero);
            case "-" -> operacoes.subtrair(numero);
            case "*" -> operacoes.multiplicar(numero);
            case "/" -> operacoes.dividir(numero);
            default -> System.out.println("Operação inválida.");
        }
    }

    // Método para obter o resultado atual
    public double getResultado() {
        return operacoes.getResultado();
    }
}