import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int start, end, temp;
               
        start = teclado.nextInt();
        end = teclado.nextInt();

        temp = end - start;

        if (temp <= 0){
             temp = temp + 24;
        }
        System.out.println("O JOGO DUROU " + temp + " HORA(S)");
    }    
}    