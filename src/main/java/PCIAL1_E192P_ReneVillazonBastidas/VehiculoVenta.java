package PCIAL1_E192P_ReneVillazonBastidas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rune0
 */
public class VehiculoVenta {

    private String Fabricante;
    private String NumeroPlaca;
    private int Kilometraje;
    private float Motor;
    private String Color;
    private int ValorDeVenta;

    public VehiculoVenta(String Fabricante, String NumeroPlaca, int Kilometraje, float Motor, String Color, int ValorDeVenta) {
        this.Fabricante = Fabricante;
        this.NumeroPlaca = NumeroPlaca;
        this.Kilometraje = Kilometraje;
        this.Motor = Motor;
        this.Color = Color;
        this.ValorDeVenta = ValorDeVenta;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public float getMotor() {
        return Motor;
    }

    public void setMotor(int Motor) {
        this.Motor = Motor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getValorDeVenta() {
        return ValorDeVenta;
    }

    public void setValorDeVenta(int ValorDeVenta) {
        this.ValorDeVenta = ValorDeVenta;
    }

    @Override
    public String toString() {
        return "Fabricante=" + Fabricante + ", NumeroPlaca=" + NumeroPlaca + ", Kilometraje=" + Kilometraje + ", Motor=" + Motor + ", Color=" + Color + ", ValorDeVenta=" + ValorDeVenta +"\n";
    }
    
}
