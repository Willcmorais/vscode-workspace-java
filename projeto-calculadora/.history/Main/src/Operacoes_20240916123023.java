/*Encapsula as funcionalidades das operações matemáticas básicas: 
soma, subtração, multiplicação e divisão. Ela mantém o estado do 
resultado das operações realizadas até o momento.*/

private class Operacoes {

    // Variáveis
    private double somar, sub, multi, div, result;

    public double getSomar(double numero) {
        return   this.resultado += numero;;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    
}