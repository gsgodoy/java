import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, b;

        System.out.println("Por favor, digite a base do retangulo:");
        b = teclado.nextDouble();

        System.out.println("Por favor, digite a altura do retangulo:");
        a = teclado.nextDouble();

        double x = b * a;

        System.out.println("A area do retangulo = " + x);

    }
}