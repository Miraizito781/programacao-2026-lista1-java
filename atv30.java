import java.util.Scanner;
public class atv30 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double saldoConta = 850.0;
        final double LIMITE_CHEQUE_ESPECIAL = 500.0;
        boolean comparacao = (saldoConta > LIMITE_CHEQUE_ESPECIAL);
        System.out.println("O saldo da conta do usuário é maior que o limite do cheque especial? " + comparacao);
    }
}
