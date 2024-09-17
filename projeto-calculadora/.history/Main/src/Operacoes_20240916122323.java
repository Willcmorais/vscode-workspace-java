/*Encapsula as funcionalidades das operações matemáticas básicas: 
soma, subtração, multiplicação e divisão. Ela mantém o estado do 
resultado das operações realizadas até o momento.*/

public class Operacoes {

    // Variável
    private double somar, sub, multi, div, result;

    public double getSomar(double numero) {
        return this.result += numero;
    }

    public void setSomar(double somar) {
        this.somar = somar;
    }

    public double getSub(double numero) {
        return this.result -= numero;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getMulti(double numero) {
        return this.result *= numero;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public void getDiv() {
        if (numero != 0) return {
            this.result /= numero;
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    public void setDiv(double div) {
        this.div = div;
    }

    // Getter para o resultado
    public double getResult() {
        return result;
    }

    // Setter para o resultado
    public void setResult(double result) {
        this.result = result;
    }

    // Método de soma
    public void somar(double numero) {

    }

    // Método de subtração
    public void subtrair(double numero) {

    }

    // Método de multiplicação
    public void multiplicar(double numero) {

    }

    // Método de divisão
    public void dividir(double numero) {

    }

}