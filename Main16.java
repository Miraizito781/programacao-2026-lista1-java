import java.util.Scanner;
public class Main16 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double tempCelsius = entrada.nextDouble();
        double tempFahrenheit = (tempCelsius * 9/5) + 32; 
        System.out.println("O valor da temperatura em Fahrenheit é: " + tempFahrenheit);
}
}