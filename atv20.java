import java.util.Scanner;
public class atv20 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de segundos");
        int segundostempo = entrada.nextInt();
        int horas = segundostempo / 3600;
        int minutos = (segundostempo % 3600) / 60;
        int segundos = segundostempo % 60; 
        System.out.printf("O horário exato é de: %02d:%02d:%02d%n"  ,horas ,minutos, segundos);
    }
    }