import java.util.Scanner;
public class Main17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dividendo da operação: ");
        double dividendo = entrada.nextDouble();
        System.out.println("Digite o divisor da operação: ");
        double divisor = entrada.nextDouble();
        double quociente = dividendo / divisor;
        double resto = dividendo % divisor;
        System.out.println("O quociente dessa divisão é:" + quociente);
        System.out.println("o resto dessa divisão é: " + resto);
    }
}
