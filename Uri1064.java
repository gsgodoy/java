import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        int qtde=0;
        float media=0;

        for (int i=1; i<=6; i++){
            valor = teclado.nextFloat();
            if (valor > 0){
                qtde++;
                media = media + valor; //media += valor;
            }
        } 

        System.out.println(qtde+" valores positivos");
        System.out.printf("%.1f\n", media/qtde);
    }
}