/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author rune0
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45GH", "Toyota", "P14");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "J16", "Toyota", "J9");

        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        System.out.println("---------------------------------------------------------------------");
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("rene", 1052040924, 18);
        personas[1] = new Estudiante("0011e", "sistemas", 2, "juan", 1300490, 19);

        for (Persona persona : personas) {
            System.out.println(persona.mostrarDatos());
            System.out.println("");
        }
    }
}
