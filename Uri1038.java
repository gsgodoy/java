import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        float total;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();
        
        if ( cod == 1) { //testo se o cod vale 1
            total = qtde * 4.00f;
        }
        else if (cod == 2){
            total = qtde * 4.50f;
        }
        else if (cod == 3){
            total = qtde * 5.00f;
        }
        else if (cod == 4){
            total = qtde * 2.00f;
        }
        else{
            total = qtde * 1.50f;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }    
}    