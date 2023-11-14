package com.oop.hw8.ex2.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivedCoefficients = derive();
        return new ListPoly(derivedCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.size()) {
            return coefficients.get(degree);
        }
        return 0;
    }

    @Override
    public double[] coefficients() {
        double[] coefficientsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficientsArray.length; i++) {
            coefficientsArray[i] = coefficients.get(i);
        }
        return coefficientsArray;
    }

    @Override
    double[] derive() {
        int degree = degree();
        double[] derivedCoefficients = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivedCoefficients[i - 1] = i * coefficients.get(i);
        }

        return derivedCoefficients;
    }
}
