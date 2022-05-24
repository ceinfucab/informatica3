
package newpackage;


public class Arquitectos extends Persona{
    protected String cod_plano;

    public Arquitectos(String codigo, String nombre, String direccion, int telefono) {
        super(codigo, nombre, direccion, telefono);
    }

    public String getCod_plano() {
        return cod_plano;
    }

   
     
   @Override
   public String mostrarDatos(){
        return "Nombre: "+nombre+"direccion: "+direccion+"telefono"+telefono;
    }
    
    
    
}
