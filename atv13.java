import java.util.Scanner;
public class atv13 {
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número para calcular:");
        double num = entrada.nextDouble();
        double quadrado_num = Math.pow(num, 2);
        double cubo_num = Math.pow(num, 3);
        System.out.println("O quadrado desse número é: " + quadrado_num);
        System.out.println("O cubo desse número é: " + cubo_num);
}
}