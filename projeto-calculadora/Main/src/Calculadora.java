
public class Calculadora {

    private double resultado;

    // Construtor inicializa o resultado
    public Calculadora(double numeroInicial) {
        this.setResultado(numeroInicial);
    }

    // Getter para o resultado (encapsulamento)
    public double getResultado() {
        return resultado;
    }

    // Setter para o resultado (encapsulamento)
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Método para aplicar uma operação
    public void aplicarOperacao(Operacao operacao, double numero) {
        this.setResultado(operacao.calcular(this.getResultado(), numero));
    }
}
