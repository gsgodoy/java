import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Por favor, digite um valor inteiro");
        a = teclado.nextInt();

        System.out.println("Por favor, digite um valor float");
        b = teclado.nextFloat();

        System.out.println("Por favor, digite um valor double");
        c = teclado.nextDouble();

        System.out.println("Voce digitou: " + a +" " + b +" " + c);

    }
}