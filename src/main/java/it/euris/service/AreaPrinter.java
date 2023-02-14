package it.euris.service;

import it.euris.pojo.Shape;

import java.util.Collection;

public class AreaPrinter {

    //public String printer(Collection<Object> shapes){
    public String printer(Collection<Shape> shapes){
        AreaCalculator areaCalculator = new AreaCalculator(shapes);
        return  "\tLa somma delle aree è: " + areaCalculator.sum();
    }
}
