

public class atv4 {
    public static void main(String[] args){
        final double TAXA_CONVERSAO = 5.35;
        double valor_reais = 500.30;
        double valor_dolar = valor_reais / TAXA_CONVERSAO;

        System.out.println("O valor em dólar é: " + valor_dolar);
}
}