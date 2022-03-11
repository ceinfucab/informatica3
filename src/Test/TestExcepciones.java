
package Test;

import static Excepciones.Aritmetica.division;
import Excepciones.OperacionExcepcion;
public class TestExcepciones {
    
    public static void main(String[] args) {
        int resultado=0;
        
        try{
           resultado = division(resultado,resultado); 
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error 1");
        }
        catch(Exception e){
            System.out.println("Ocurrio un error 2");
            e.printStackTrace(System.out);
        }
        finally{
        System.out.println("Se reviso la division entre cero");
    }
       
        
        
        System.out.println("resultado = " + resultado);
    }
    
}
