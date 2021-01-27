import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double d1, d2;

        System.out.println("Por favor, digite a diagonal 1 do losango:");
        d1 = teclado.nextDouble();

        System.out.println("Por favor, digite a diagonal 2 do losango:");
        d2 = teclado.nextDouble();

        double x = d1 * d2;

        System.out.println("A area do losango = " + x);

    }
}