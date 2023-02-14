package it.euris;

import it.euris.pojo.Circle;
import it.euris.pojo.Shape;
import it.euris.pojo.Square;
import it.euris.service.AreaCalculator;
import it.euris.service.AreaPrinter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Collection<Object> shapes = new HashSet<>();
        Collection<Shape> shapes = new HashSet<>();
        //new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Square(5));
        shapes.add(new Square(6));

                /*Set.of(
            new Circle(2),
            new Square(5),
            new Square(6)
        );*/

        //AreaCalculator areaCalculator = new AreaCalculator(shapes);
        AreaPrinter areaPrinter = new AreaPrinter();
        System.out.println(areaPrinter.printer(shapes));
        //System.out.println(areaCalculator.output());
    }
}