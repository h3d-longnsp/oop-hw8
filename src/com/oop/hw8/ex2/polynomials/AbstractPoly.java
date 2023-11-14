package com.oop.hw8.ex2.polynomials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    abstract double[] derive();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        AbstractPoly otherPoly = (AbstractPoly) obj;
        return Arrays.equals(this.coefficients(), otherPoly.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        double[] coeffs = coefficients();
        if (coeffs.length == 0) {
            return "0";
        }
        int degree = degree();
        StringBuilder result = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == degree) {
                    result.append(coeffs[i]);
                } else {
                    result.append((coeffs[i] > 0) ? " + " : " - ");
                    result.append(Math.abs(coeffs[i]));
                }
                if (i > 0) {
                    result.append("x");
                    if (i > 1) {
                        result.append("^").append(i);
                    }
                }
            }
        }
        return result.toString();
    }
}
