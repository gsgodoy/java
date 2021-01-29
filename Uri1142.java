import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, L=0;
        N = teclado.nextInt();
		
		for (int cont = 0; cont < N; cont++) {
            System.out.println((L+1)+" "+(L+2)+" "+(L+3)+" PUM");
            L+=4;
        }
    }
}    