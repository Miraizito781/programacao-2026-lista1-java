import java.util.Scanner;
public class atv23 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double nota = 2.0;
        double media_minima = 6.0;
        boolean aprovado = (nota  > media_minima);
        System.out.println("O aluno está aprovado? : " + aprovado);
    }
}