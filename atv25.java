import java.util.Scanner;
public class atv25 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int var1 = 2;
        int var2 = 3;
        boolean igualdade = (var1 == var2);
        boolean diferença = (var1 != var2);
        boolean maiorque = (var1 > var2);
        boolean menorque = (var1 < var2);
        boolean maiorigual = (var1 >= var2);
        boolean menorigual = (var1 <= var2);

        System.out.println("Os números são iguais? " + igualdade );
        System.out.println("Os números são diferentes? " + diferença );
        System.out.println("O número 1 é maior? " + maiorque);
        System.out.println("O número 1 é menor? " + menorque );
        System.out.println("O número 1 é maior ou igual ao número 2 ?" + maiorigual);
        System.out.println("O número 1 é menor ou igual ao número 2 ?" + menorigual);

    }
}