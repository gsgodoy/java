import java.util.Scanner;

public class TestandoIF{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, ne;

        System.out.println("Digite a N1:");
        n1 = teclado.nextDouble();
        System.out.println("Digite a N2:");
        n2 = teclado.nextDouble();

        ne = (n1 + n2)/2;

        System.out.println("Sua media = "+ne);

        if (ne >= 6.0){
            System.out.println("Parabens, aprovado!");
        }
        else{
            System.out.println("Que pena, reprovado!");
        }
    }
}    