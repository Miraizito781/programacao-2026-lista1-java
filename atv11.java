import java.util.Scanner;
public class atv11 {
      public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os dois números para calcular:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração entre esses números é: " + subtracao);
        System.out.println("O produto desses números é: " + multiplicacao);
        System.out.println("o quociente da divisão é: " + divisao);
      }
}
