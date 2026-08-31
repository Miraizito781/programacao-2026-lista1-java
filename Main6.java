
public class Main6 {
    public static void main(String[] args){
        int var1 = 20;
        int var2 = 30;
        int var3 = 40;
        int auxiliar;
        System.out.printf("Antes da troca: /n");
        System.out.printf("var1 = %d/n", var1);
        System.out.printf("var2 = %d/n", var2);
        System.out.printf("var3 = %d/n", var3);

        auxiliar = var1;
        var1 = var2;
        var2 = auxiliar;

        System.out.printf("Depois da troca: /n");
        System.out.printf("var1 = %d/n", var1);
        System.out.printf("var2 = %d/n", var2);
        System.out.printf("var3 = %d/n", var3);


    }
}