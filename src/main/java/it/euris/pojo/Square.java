package it.euris.pojo;

public class Square implements Shape{

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }


    @Override
    public double calculateArea() {
        return Math.pow(this.length,2);
    }
}
