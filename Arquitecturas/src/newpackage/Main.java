/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 En un Taller de Proyectos de Arquitectura, existen 10 Jefes donde se desea saber su codigo, nombre, direccion y telefono  y ellos asignan Proyectos a arquitectos,  del cual se les desea conocer su codigo, nombre, direccion y telefono y el código del plano que se le es asignado para realizar un proyecto. Cada arquitecto tiene a 10 albañiles trabajadores, del cual también se les desea conocer su código, nombre, dirección y teléfono y la fecha de asignación del plano para su proyecto asignado. También se desea calcular el área y el perimetro de 3 tipos de figuras, las cuales son, rectangulos, cuadrados y 3 tipos de triangulos. Realice un programa en Java que resuelva este problema, usando POO y Polimorfismo, sobre escritura de métodos e implementaciones que crea necesarias, mostrando los datos en pantalla.
 */
package newpackage;


public class Main {
    
    public static void main(String[] args) {
        
        
        
        
        Persona mispersonas[] = new Persona[2];
        
       mispersonas[0] = new Jefes("a123","Wilter","Lomas",041233);
       
       mispersonas[1] = new Arquitectos("a123","Roberto","Lomas",041233);
       
       /*
       
      
       for(Persona persona: mispersonas){
           System.out.println(Persona.mostrarDatos());
           System.out.println(" ");
       }
 */
        System.out.println("ingrese base del triangulo");
        
        
       
    }
    
    
}
