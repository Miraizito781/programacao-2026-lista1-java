import java.util.Scanner;
public class atv12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os dois números para calcular:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int resultado = num1 % num2;
        System.out.println("O resto da divisão entre esses números é: " + resultado);
    }
}
