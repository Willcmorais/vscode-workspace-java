public class Operacoes {

    // Variável
    private double resultado;

    // Método de soma
    public void somar(double numero) {
        this.resultado += numero;
    }

    // Método de subtração
    public void subtrair(double numero) {
        this.resultado -= numero;
    }

    // Método de multiplicação
    public void multiplicar(double numero) {
        this.resultado *= numero;
    }

    // Método de divisão
    public void dividir(double numero) {
        if (numero != 0) {
            this.resultado /= numero;
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }

}