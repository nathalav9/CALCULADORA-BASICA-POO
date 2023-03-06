/**
 *
 * @author nataj
 */
public class ProyectoCalculadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        calculadora miCalculadora = new calculadora(10,5);
        //Valor 10 equivale a operador 1 y 5 a operador2
        
        int suma = miCalculadora.sumar();
        System.out.println("La suma es: + \n" + suma);
        
       
        System.out.println("La resta es:" + miCalculadora.restar());
        
       
        System.out.println("La multiplicación es:" + miCalculadora.multiplicar());
        
       
        System.out.println("La división es:" + miCalculadora.dividir());
        
    }
    
}
