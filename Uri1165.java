import java.util.Scanner;

public class Uri1165{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num;

        int N = teclado.nextInt();
        for (int cont = 1; cont <= N; cont++){
            boolean acheiDivisor = false;
            num = teclado.nextInt();
            for (int divisor = 2; divisor < num && acheiDivisor == false; divisor++){
                if (num % divisor == 0){
                    acheiDivisor = true;
                }
            }
            if (acheiDivisor == true){
                System.out.println(num+" nao eh primo");
            }
            else{
                System.out.println(num+" eh primo");
            }
        }
    }
}