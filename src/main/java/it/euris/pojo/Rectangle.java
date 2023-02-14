package it.euris.pojo;

public class Rectangle implements Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }

    @Override
    public double calculateArea() {
        return this.width*this.length;
    }
}
