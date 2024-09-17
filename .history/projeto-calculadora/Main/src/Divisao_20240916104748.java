
publ class Divisao extends Operacao {

    public double calcular(double resultado, double numero) {
        if (numero != 0) {
            return resultado / numero;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return resultado; // Retorna o resultado inalterado em caso de erro
        }
    }
}
