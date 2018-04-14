/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author DELL
 */
public class Complex {

    private final double reZ;
    private final double imZ;

    public Complex(double real, double imag) {
        reZ = real;
        imZ = imag;
    }

    @Override
    public String toString() {
        if (imZ == 0) {
            return reZ + "";
        }
        if (reZ == 0) {
            return imZ + "i";
        }
        if (imZ < 0) {
            return reZ + " - " + (-imZ) + "i";
        }
        return reZ + " + " + imZ + "i";
    }

    public double reZ() {
        return reZ;
    }

    public double imZ() {
        return imZ;
    }

    public double abs() {
        return Math.hypot(reZ, imZ);
    }

    public double phase() {
        return Math.atan2(imZ, reZ);
    }

    public Complex plus(Complex b) {
        Complex a = this;
        double real = a.reZ + b.reZ;
        double imag = a.imZ + b.imZ;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.reZ - b.reZ;
        double imag = a.imZ - b.imZ;
        return new Complex(real, imag);
    }

    public Complex times(Complex b) {
        Complex a = this;
        double real = a.reZ * b.reZ - a.imZ * b.imZ;
        double imag = a.reZ * b.imZ + a.imZ * b.reZ;
        return new Complex(real, imag);
    }

    public Complex conjugate() {
        return new Complex(reZ, -imZ);
    }

    public Complex scale(double alpha) {
        return new Complex(alpha * reZ, alpha * imZ);
    }

    public Complex reciprocal() {
        double scale = reZ * reZ + imZ * imZ;
        return new Complex(reZ / scale, -imZ / scale);
    }

    public Complex divides(Complex b) {
        Complex a = this;
        return a.times(b.reciprocal());
    }

    public Complex exp() {
        return new Complex(Math.exp(reZ) * Math.cos(imZ), Math.exp(reZ) * Math.sin(imZ));
    }

    public Complex cos() {
        return new Complex(Math.cos(reZ) * Math.cosh(imZ), -Math.sin(reZ) * Math.sinh(imZ));
    }

    public Complex sin() {
        return new Complex(Math.sin(reZ) * Math.cosh(imZ), Math.cos(reZ) * Math.sinh(imZ));
    }

    public Complex tan() {
        return sin().divides(cos());
    }

    public static Complex plus(Complex a, Complex b) {
        double real = a.reZ + b.reZ;
        double imag = a.imZ + b.imZ;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    public static void main(String[] args) {
        Complex firstComplexNumber = new Complex(2.0, 4.0);
        Complex secondComplexNumber = new Complex(1.0, 2.0);

        System.out.println("Liczba zespolona w postaci algebraicznego = " + firstComplexNumber);
        System.out.println("Moduł liczby zespolonej = " + firstComplexNumber.abs());
        System.out.println("Liczba sprzężona do liczby zespolonej = " + firstComplexNumber.conjugate());
        System.out.println("Liczba zespolona algebraiczna w postaci wykladnicznej = " + firstComplexNumber.exp());
        System.out.println("Liczba zespolona wykladnicza w postaci algebraicznej = " + firstComplexNumber);
        System.out.println("Dodawanie = " + secondComplexNumber.plus(firstComplexNumber));
        System.out.println("Odejmowanie = " + firstComplexNumber.minus(secondComplexNumber));
        System.out.println("Mnozenie = " + firstComplexNumber.times(secondComplexNumber));
        System.out.println("Dzielenie = " + firstComplexNumber.divides(secondComplexNumber));
        System.out.println("Liczba zespolona w postaci wykladnicznej = " + firstComplexNumber.exp());
        System.out.println("Liczba zespolona w postaci trygonometryczna = " + firstComplexNumber.tan());
    }

}
