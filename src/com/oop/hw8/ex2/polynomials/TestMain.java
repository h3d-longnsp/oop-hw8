package com.oop.hw8.ex2.polynomials;

public class TestMain {
    public static void main(String[] args) {
        Poly arrayPoly = new ArrayPoly(2, 6, 4, 10, 12);
        Poly listPoly = new ListPoly(new double[]{1, 4, 9, 9});

        System.out.println("ArrayPoly = " + arrayPoly);
        System.out.println("ListPoly = " + listPoly);

        if (arrayPoly.equals(listPoly)) {
            System.out.println("ArrayPoly equal to ListPoly");
        } else {
            System.out.println("ArrayPoly not equal to ListPoly");
        }
        System.out.println("---");
        System.out.println("ArrayPoly = " + arrayPoly);
        arrayPoly = arrayPoly.derivative();
        System.out.println("ArrayPoly derivative: " + arrayPoly);
        arrayPoly = arrayPoly.derivative();
        System.out.println("ArrayPoly second derivative: " + arrayPoly);

        System.out.println("---");
        System.out.println("ListPoly = " + listPoly);
        listPoly = listPoly.derivative();
        System.out.println("ListPoly derivative: " + listPoly);
        listPoly = listPoly.derivative();
        System.out.println("ListPoly second derivative: " + listPoly);
    }
}
