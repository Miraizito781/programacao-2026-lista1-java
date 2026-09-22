import java.util.Scanner;
public class atv29 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double alt1 = 1.80;
        double alt2 = 1.50;
        boolean igualdade = (alt1 == alt2);
        boolean diferença = (alt1 != alt2);
        boolean maiorque = (alt1 > alt2);
        boolean menorque = (alt1 < alt2);
        boolean maiorigual = (alt1 >= alt2);
        boolean menorigual = (alt1 <= alt2);    
        System.out.println("As alturas são iguais? " + igualdade );
        System.out.println("As alturas são diferentes? " + diferença );
        System.out.println("A altura número 1 é maior? " + maiorque);
        System.out.println("A altura número 1 é menor? " + menorque );
        System.out.println("A altura número 1 é maior ou igual a altura número 2 ?" + maiorigual);
        System.out.println("A altura número 1 é menor ou igual a altura número 2 ?" + menorigual);
    }
}