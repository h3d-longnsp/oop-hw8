package com.oop.hw8.ex2.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double... coefficients) {
        this.coefficients = coefficients;
    }


    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivedCoefficients = derive();
        return new ArrayPoly(derivedCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.length) {
            return coefficients[degree];
        }
        return 0;
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone();
    }

    @Override
    double[] derive() {
        int degree = degree();
        double[] derivedCoefficients = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivedCoefficients[i - 1] = i * coefficients[i];
        }

        return derivedCoefficients;
    }
}
