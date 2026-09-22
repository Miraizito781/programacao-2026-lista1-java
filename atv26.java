import java.util.Scanner;
public class atv26 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double tempAtual = 50.20;
        double tempCongel = 0;
        boolean maiorque = (tempAtual > tempCongel);
        System.out.println("A temperatura atual é maior que o grau 0? " + maiorque);
    }
}