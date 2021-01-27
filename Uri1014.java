import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        double Y, MEDIA;
        
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        MEDIA = (X / Y);

        System.out.printf("%.3f km/l\n", MEDIA);

    }    
}