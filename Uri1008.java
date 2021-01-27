import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NUMBER, HORASTRABALHADAS;
        double VALORHORA, SALARY;

        NUMBER = teclado.nextInt();
        HORASTRABALHADAS = teclado.nextInt();
        VALORHORA = teclado.nextDouble();

        SALARY = HORASTRABALHADAS * VALORHORA;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n" , SALARY);

    }    
}
