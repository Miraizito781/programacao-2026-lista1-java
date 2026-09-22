import java.util.Scanner;
public class atv21 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1 = 1;
        int num2 = 2;
        boolean igualdade = (num1 == num2);
        boolean maiorque = (num1 > num2);
        boolean menorque = (num1 < num2 );
        // != é o sinal para expressar inequalidade numa operação
        boolean diferença = (num1 != num2);

        System.out.println("Os dois números são iguais? " + igualdade);
        System.out.println("1 é maior que 2?: " + maiorque);
        System.out.println("1 é menor que 2?: " + menorque);
        System.out.println("São números diferentes?" + diferença);




    }

    }