public class conversorDeDolar {
    public static void main(String[] args) {
    double valorEmDolares = 100;
    double valorTaxaDeCambio = 4.94;
    double valorConvertido = (valorTaxaDeCambio*valorEmDolares);
        System.out.println(valorConvertido);

    }
}

/* resposta 5
public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}

 */