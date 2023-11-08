/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

import java.util.Vector;


/**
 *
 * @author rune0
 */
class Figura {

    public double area() {
        return 0;
    }
;

};

class Cuadrado extends Figura {

    private float lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

}
class Triangulo extends Figura {

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return (base * altura)/2;
    }

}

class Circulo extends Figura {

    private float radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    
    @Override
    public double area() {
        return radio * radio*Math.PI;
    }

}

public class Jerarquia {

    public static void main(String[] args) {
        Vector<Figura> figuras = new Vector<>();
        figuras.add(new Cuadrado(10));
        figuras.add(new Circulo(10));
        figuras.add(new Triangulo(10,5));
        figuras.forEach(figura-> System.out.println("Area: " + figura.area()));

    }

}
