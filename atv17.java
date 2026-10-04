import java.util.Scanner;
public class atv17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dividendo da operação: ");
        int dividendo = entrada.nextInt();
        System.out.println("Digite o divisor da operação: ");
        int divisor = entrada.nextInt();
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        System.out.println("O quociente dessa divisão é:" + quociente);
        System.out.println("o resto dessa divisão é: " + resto);
    }
}
