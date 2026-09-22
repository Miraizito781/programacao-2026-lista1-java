import java.util.Scanner;
public class atv19 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário a ser aumentado: ");
        double salario = entrada.nextDouble();
        double acrescimo = 15.0 / 100.0;
        double valorFinal = salario + (acrescimo * salario);
        System.out.println("O valor do salário com acréscimo de 15% é: " + valorFinal);
    }
}
