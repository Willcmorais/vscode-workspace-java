
private class Operacoes {

    public double Somar(double resultado, double numero) {
        return resultado + numero;
    }

    public double Subtrair(double resultado, double numero) {
        return resultado - numero;
    }

    public double Multiplicar(double resultado, double numero) {
        return resultado * numero;
    }

    public double Divis(double resultado, double numero) {
        if (numero != 0) {
            return resultado / numero;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return resultado; // Retorna o resultado inalterado em caso de erro
        }
    }
}
