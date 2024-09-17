/*Encapsula as funcionalidades das operações matemáticas básicas: 
soma, subtração, multiplicação e divisão. Ela mantém o estado do 
resultado das operações realizadas até o momento.*/

private class Operacoes {

    // Variáveis
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

    public void (double numero) {
        if (numero != 0) {
            this.result /= numero;
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    public void setDiv(double div) {
        this.div = div;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}