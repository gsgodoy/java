import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int COD1, QTDE1, COD2, QTDE2;
        double VALORUNIT1, VALORUNIT2, VALORTOTAL;
        
        COD1 = teclado.nextInt();
        QTDE1 = teclado.nextInt();
        VALORUNIT1 = teclado.nextDouble();
        COD2 = teclado.nextInt();
        QTDE2 = teclado.nextInt();
        VALORUNIT2 = teclado.nextDouble();

        VALORTOTAL = ((QTDE1 * VALORUNIT1) + (QTDE2 * VALORUNIT2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , VALORTOTAL);

    }    
}