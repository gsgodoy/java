import java.util.Scanner;

// switch case propaga os valores verdadeiros, como se fosse OR... por isso usar o BREAK

public class Uri1050switch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int ddd;

        ddd = teclado.nextInt();

        switch(ddd){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
} 