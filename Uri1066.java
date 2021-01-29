import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, par=0, impar=0, positivo=0, negativo=0;

        for (int cont=1; cont<=5; cont++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
            if (valor > 0){
                positivo++;
            }
            if (valor < 0){
                negativo++;
            }
        } 
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");   
    }
}