import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        valor = teclado.nextInt();
        
        for (int cont=1; cont >= valor; cont = cont+2){
            System.out.println(cont);  
        }  
    }
}