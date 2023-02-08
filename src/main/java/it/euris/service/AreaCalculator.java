package it.euris.service;

import it.euris.pojo.Circle;
import it.euris.pojo.Square;

import java.util.Collection;
import java.util.Objects;

public class AreaCalculator {

  protected Collection<Object> shapes;

  public AreaCalculator(Collection<Object> shapes) {
    this.shapes = shapes;
  }

  public double sum() {
    double result = 0;
    for (Object shape : shapes) {
      if (shape instanceof Square) {
        double squareLength = ((Square) shape).getLength();
        result += Math.pow(squareLength, 2);
      } else if (shape instanceof Circle) {
        double circleRadius = ((Circle) shape).getRadius();
        result += Math.PI * Math.pow(circleRadius, 2);
      } else {
        throw new RuntimeException("Unrecognized shape, aborting sum...");
      }
    }
    return result;
  }

  public String output() {
    return "\tLa somma delle aree è: " + sum();
  }
}
