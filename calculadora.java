public class calculadora {
    //atributos
    private int operador1;
    private int operador2;
    


    //constructores
    public calculadora(){
     
    }
    
    // int operador1 y dos son parametros que inicializan los atributos
    public calculadora(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    
    }
    
    //Métodos
    
   public int sumar(){
       int suma = this.operador1 + this.operador2;
       return suma;
   }
   
   public int restar(){
       int resta = this.operador1 - this.operador2;
       return resta;
   }
   
   public int multiplicar(){
       int multiplica  = this.operador1 * this.operador2;
       return multiplica;
   }
   
   public double dividir(){
       double divide = (double)this.operador1 / (double)this.operador2;
       return divide;
   
   }

     //Encapsular atributos que están privados y se puedan modificar
    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

}
  
 