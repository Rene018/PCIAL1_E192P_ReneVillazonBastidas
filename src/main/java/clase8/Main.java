/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

import java.util.ArrayList;

/**
 *
 * @author rune0
 */
abstract class Animal {

    protected String nombre;
    protected String color;
    protected String raza;

    public Animal(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String mostrarDatos() {
        return "nombre: " + nombre + ", color: " + color + ", raza: " + raza;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public abstract void comer();
}

class Pig extends Animal implements Transporte {

    private int edad;

    public Pig(int edad, String nombre, String color, String raza) {
        super(nombre, color, raza);
        this.edad = edad;
    }

    @Override
    public String mostrarDatos() {
        return "nombre: " + nombre + ", color: " + color + ", raza: " + raza + "edad: " + edad;
    }

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");

    }

    @Override
    public void comer() {
        System.out.println("los cerdos comen todo");
    }

    @Override
    public void envio() {
        System.out.println("como dijo jack: 'vamos por partes'");
    }
;

}

class Dog extends Animal implements Transporte {

    private String tamano;

    public Dog(String tamano, String nombre, String color, String raza) {
        super(nombre, color, raza);
        this.tamano = tamano;
    }

    @Override
    public String mostrarDatos() {
        return "nombre: " + nombre + ", color: " + color + ", raza: " + raza + "tamano: " + tamano;
    }

    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public void comer() {
        System.out.println("los perros comen");
    }

    @Override
    public void envio() {
        System.out.println("como dijo jack: 'vamos por partes'.\n returbio bro");
    }
;

}

class Main {

    public static void main(String[] args) {
        ArrayList<Animal> a = new ArrayList<>();

//        Animal myAnimal = new Animal("vaca", "blanco", "braman");
        Pig myPig = new Pig(12, "spig", "rosado", "gordito");
        Dog myDog = new Dog("150", "dogki", "negro", "labrador");

//        a.add(myAnimal);
        a.add(myDog);
        a.add(myPig);
        a.forEach(el -> System.out.println(el.mostrarDatos()));
        a.forEach(el -> el.animalSound());
        a.forEach(el -> el.comer());


    }
}
