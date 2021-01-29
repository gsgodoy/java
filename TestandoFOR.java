public class TestandoFOR{
    
    //WHILE - repetições: 0 a INFINITO
    //Do WHILE - repetições: 1 a INFINITO 
    //FOR - repetições: DETERMINADO 
    
    public static void main(String args[]){

        for (int valor = 0 ; valor <= 10 ; valor = valor ++) {
            System.out.println(" 3 x "+valor+" = "+ (3 * valor));

        }

        valor = valor + 5;

        valor += 5;
    }
}