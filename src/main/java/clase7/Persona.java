/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author rune0
 */
public class Persona {

    protected String nombre;
    protected long identificacion;
    protected int edad;

    public Persona(String nombre, long identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String mostrarDatos() {
        return "nombre: " + nombre + "\n identificacion: " + identificacion + "\n edad: " + edad;
    }
    
}

