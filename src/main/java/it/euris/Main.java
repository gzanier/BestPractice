package it.euris;

import it.euris.pojo.Circle;
import it.euris.pojo.Square;
import it.euris.service.AreaCalculator;
import java.util.Collection;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Collection<Object> shapes = Set.of(
            new Circle(2),
            new Square(5),
            new Square(6)
        );

        AreaCalculator areaCalculator = new AreaCalculator(shapes);

        System.out.println(areaCalculator.output());
    }
}