import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1, m1, h2, m2;
        int tempoi, tempof, duracao;
        int htotal, mtotal;
               
        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();

        //converter tudo em minutos
        tempoi = h1 * 60 + m1;
        tempof = h2 * 60 + m2;

        duracao = tempof - tempoi;

        if (duracao <= 0){
            duracao = duracao + 1440; // somo 24h em minutos para mostrar que o dia virou
        }

        htotal = duracao / 60;
        mtotal = duracao % 60;

        System.out.println("O JOGO DUROU "+ htotal +" HORA(S) E "+ mtotal +" MINUTO(S)");
    }    
} 