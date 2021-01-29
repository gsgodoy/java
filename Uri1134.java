import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtdAlcool = 0, qtdGasolina = 0, qtdDiesel = 0;
        int cod = teclado.nextInt();
        
        while (cod != 4) {
            switch (cod){
            case 1:
                qtdAlcool++;
                break;
            case 2:
                qtdGasolina++;
                break;
            case 3:
                qtdDiesel++;
                break;
            }
            cod = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGasolina);
        System.out.println("Diesel: " + qtdDiesel);
    }
}    