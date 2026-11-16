package es.daw.calculadora;

public class Calculadora {

 

 


    // Divide el primer número entre el segundo
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
