import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        int qtde=0;

        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                qtde++;
            }
        } 

        System.out.println(qtde+" valores positivos");   
    }
}