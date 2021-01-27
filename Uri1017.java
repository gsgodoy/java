import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int MEDIA, TEMPO;
        double VELOCIDADE, DISTANCIA, LITROS;
        
        MEDIA = 12;

        TEMPO = teclado.nextInt();
        VELOCIDADE = teclado.nextInt();

        DISTANCIA = TEMPO * VELOCIDADE;
        LITROS = DISTANCIA / MEDIA;

        System.out.printf("%.3f\n", LITROS);

    }    
}