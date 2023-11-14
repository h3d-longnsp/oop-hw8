package com.oop.hw8.ex2.polynomials;

public interface Poly {
    /** Return the degree of polynomial
     * @return the degree of polynomial
     */
    int degree();

    /** Return a new polynomial which is the derivative of the current object.
     * Example method call invoked on object (1), return object (2)
     * (1) c0 + c1 * x + ... + cn * x^n
     * (2) c1 + 2c2 * x + ... + ncn * x^(n-1)
     * @return Return a new polynomial which is the derivative of the current object
     */
    Poly derivative();

    /** Return the coefficient of the monomial with the specified degree
     * @param degree The degree to be queried to get the coefficient
     * @return The coefficient of the monomial with the specified degree
     */
    double coefficient(int degree);

    /** Return a double[] containing all the coefficients
     * @return A double[] containing all the coefficients
     */
    double[] coefficients();
}
