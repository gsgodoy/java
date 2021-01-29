public class TestandoDoWhile{
    
    //WHILE - repetições: 0 a INFINITO
    //DoWHILE - repetições: 1 a INFINITO
    
    public static void main(String args[]){

        int valor = 0;

        do {
            System.out.println(" 3 x "+valor+" = "+ (3 * valor));
            valor = valor + 1;

        } while (valor <= 10);
    }
}