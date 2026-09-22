import java.util.Scanner;
public class atv28 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int estoqueProd = 20;
        int estoqueMin = 5;
        boolean estoqueQtd = (estoqueProd <= estoqueMin);
        System.out.println("O estoque desse produto é igual ou menor a quantidade mínima exigida? " + estoqueQtd);



    }
    }