package it.euris.pojo;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    // la aggiungo quando creo la interfaccia shape per risolvere il problema
    // OCP
    public double calculateArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

}
