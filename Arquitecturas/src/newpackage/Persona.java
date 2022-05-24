/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
public abstract class Persona {
    protected String codigo;
    protected String nombre;
    protected String direccion;
    protected int telefono;

    public Persona(String codigo, String nombre, String direccion, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    public String mostrarDatos(){
        return "a ";
    }
    
}
