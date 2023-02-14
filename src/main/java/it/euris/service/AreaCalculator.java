package it.euris.service;

import it.euris.pojo.Shape;

import java.util.Collection;

public class AreaCalculator {

    protected Collection<Shape> shapes;

    public AreaCalculator(Collection<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        return shapes      // [Circle(),---] shapes.lenght ---> x
                .stream() //{Circle(5) ..... }non hanno lunghezza
                .map(Shape::calculateArea) //shape -> shape.calculateArea())  //map passa da shape a double {10d, 100d...}
                .reduce(0d,Double::sum); //.reduce(0d, (x, y) -> x + y); // il 1 valore è l'accumulatore è l'identità dell'operazione
        // se ho una moltiplicazione dopo sarà 1
        //double result = 0;

        //for (Shape shape: shapes) {
        // result += shape.calculateArea();

    /*for (Object shape : shapes) {
      if (shape instanceof Square) {
        double squareLength = ((Square) shape).getLength();
        result += Math.pow(squareLength, 2);
      } else if (shape instanceof Circle) {
        double circleRadius = ((Circle) shape).getRadius();
        result += Math.PI * Math.pow(circleRadius, 2);
      } else {
        throw new RuntimeException("Unrecognized shape, aborting sum...");
      }*/
        //}
        //return result;

    }

  /*public String output() {
    return "\tLa somma delle aree è: " + sum();
  }*/
}
