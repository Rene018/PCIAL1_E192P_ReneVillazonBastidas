/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PCIAL1_E192P_ReneVillazonBastidas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author rune0
 */
public class Inventario {

    public static void main(String[] args) {

        String opcion;
        ArrayList<VehiculoVenta> listaVehiculos = new ArrayList<VehiculoVenta>();
        boolean encontrado;
        String buscar;
        int verify;

        do {
            opcion = JOptionPane.showInputDialog("Por favor digite la opción:"
                    + "\n1: Crear un vehículo de venta"
                    + "\n2: Consultar la información de un vehículo de venta por su placa."
                    + "\n3: Modificar el precio de venta del vehículo por su placa."
                    + "\n4: Eliminar un vehículo de venta por su placa"
                    + "\n5: Listado de productos almacenados"
                    + "\n0: Salir ");

            switch (opcion) {
                case "1":

                    String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del vehiculo:");
                    String numeroPlaca = JOptionPane.showInputDialog("Ingrese el numero de placa  del vehiculo:");
                    int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del vehiculo:"));
                    float motor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cilindrada del vehiculo:"));
                    String color = JOptionPane.showInputDialog("Ingrese el color del vehiculo:");
                    int valorDeVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de venta del vehiculo:"));

                    VehiculoVenta v = new VehiculoVenta(fabricante, numeroPlaca, kilometraje, motor, color, valorDeVenta);
                    listaVehiculos.add(v);
                    break;
                case "2":
                    encontrado = true;
                    buscar = JOptionPane.showInputDialog("Ingrese la referencia del vehiculo:");
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        if (listaVehiculos.get(i).getNumeroPlaca().equals(buscar)) {
                            JOptionPane.showMessageDialog(null, listaVehiculos.get(i).toString());
                            encontrado = false;
                        }
                    }
                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Numero de placa no encontrada");
                    }

                    break;

                case "3":
                    encontrado = true;

                    buscar = JOptionPane.showInputDialog("Ingrese la referencia del producto:");
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        if (listaVehiculos.get(i).getNumeroPlaca().equals(buscar)) {
                            valorDeVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del vehiculo:"));
                            verify = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro que desea cambiar el precio de venta del Veiculo " + listaVehiculos.get(i).getNumeroPlaca() + "\n"
                                    + "1. Si \n"
                                    + "2. No"));
                            if (verify == 1) {
                                listaVehiculos.get(i).setValorDeVenta(valorDeVenta);
                                JOptionPane.showMessageDialog(null, listaVehiculos.get(i).toString());
                            }
                            encontrado = false;
                        }
                    }
                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Numero de placa no encontrada");
                    }
                    break;

                case "4":
                    encontrado = true;
                    buscar = JOptionPane.showInputDialog("Ingrese la referencia del producto:");
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        if (listaVehiculos.get(i).getNumeroPlaca().equals(buscar)) {

                            verify = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro que desea eliminar el Veiculo " + listaVehiculos.get(i).getNumeroPlaca() + "\n"
                                    + "1. Si \n"
                                    + "2. No"));
                            if (verify == 1) {
                                listaVehiculos.remove(i);
                                JOptionPane.showMessageDialog(null, "Vehiculo eliminado");
                            }

                            encontrado = false;
                        }
                    }
                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Referencia no encontrada");
                    }

                    break;
                case "5":

                    JOptionPane.showMessageDialog(null, listaVehiculos.toString());

                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }

        } while (opcion != "0");
    }

}
