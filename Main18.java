import java.util.Scanner;
public class Main18 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base do retangulo: ");
        double base = entrada.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        double altura = entrada.nextDouble();
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        System.out.println("O perimetro do retangulo é: " + perimetro);
        System.out.println("O area do retangulo é: " + area);
    }
}
