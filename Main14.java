import java.util.Scanner;
public class Main14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = entrada.nextDouble();
        System.out.println("Digite a quantidade que você comprou desse produto: ");
        int qtd = entrada.nextInt();
        double valorttl = qtd * valor;
        System.out.println("O valor total do produto é: " + valorttl); 
        double valorttldesc = valorttl - (valorttl / 10.0);
        System.out.println("O valor total do produto com o desconto de 10% é: " + valorttldesc); 
}
}