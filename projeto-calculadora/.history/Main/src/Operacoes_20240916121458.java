/*Encapsula as funcionalidades das operações matemáticas básicas: 
soma, subtração, multiplicação e divisão. Ela mantém o estado do 
resultado das operações realizadas até o momento.*/

public class Operacoes {

    // Variável
    private double soma, sub, multi, div, resultado;



    
    // Getter para o resultado
    public double getResultado() {
        return resultado;
    }

    // Setter para o resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

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