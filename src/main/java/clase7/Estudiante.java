/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author rune0
 */
public class Estudiante extends Persona{
    private String codigo;
    private String carrera;
    private int semestre;

    public Estudiante(String codigo, String carrera, int semestre, String nombre, long identificacion, int edad) {
        super(nombre, identificacion, edad);
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }
    
    
    @Override
        public String mostrarDatos() {
        return "codigo " + codigo + "\n carrera: " + carrera + "\n semestre: " + semestre + "\n nombre: " + nombre + "\n identificacion: " + identificacion + "\n edad: " + edad;
    }
}
