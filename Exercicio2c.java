import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, b;

        System.out.println("Por favor, digite a base do triangulo:");
        b = teclado.nextDouble();

        System.out.println("Por favor, digite a altura do triangulo:");
        a = teclado.nextDouble();

        double x = (b * a)/2;

        System.out.println("A area do triangulo = " + x);

    }
}