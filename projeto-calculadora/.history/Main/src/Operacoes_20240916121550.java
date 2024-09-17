/*Encapsula as funcionalidades das operações matemáticas básicas: 
soma, subtração, multiplicação e divisão. Ela mantém o estado do 
resultado das operações realizadas até o momento.*/

public class Operacoes {

    // Variável
    private double somar, sub, multi, div, resulta;

    public double getSomar() {
        return somar;
    }

    public void setSomar(double somar) {
        this.somar = somar;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getMulti() {
        return multi;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }

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