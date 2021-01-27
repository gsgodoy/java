import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int IDADE, ANOS, MESES, DIAS;

        IDADE = teclado.nextInt();

        ANOS = IDADE / 365;
        MESES = (IDADE % 365) / 30;
        DIAS = (IDADE % 365) % 30;

        System.out.println(ANOS + " ano(s)");
        System.out.println(MESES + " mes(es)");
        System.out.println(DIAS + " dia(s)");

    }    
}