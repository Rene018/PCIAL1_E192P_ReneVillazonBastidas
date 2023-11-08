/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author rune0
 */
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
        public String mostrarDatos() {
        return "matricula: " + matricula + "\n marca: " + marca + "\n modelo: " + modelo +"\n cilindrada: " + cilindrada;
    }
}
