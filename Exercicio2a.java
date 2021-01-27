import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, x;

        System.out.println("Por favor, digite o lado do quadrado:");
        a = teclado.nextDouble();

        x = a * a;

        System.out.println("A area do quadrado = " + x);

        //se quiser colocar uma restrição no número de casa decimais
        System.out.printf("A area do quadrado = %.2f\n", x);

    }
}