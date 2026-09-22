import java.util.Scanner;
public class atv24 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double preco1 = 20.50;
        double preco2 = 50.20;
        boolean comparacao = (preco1 < preco2);
        System.out.println("O produto A é mais barato que o produto B?: " + comparacao);
    }
}