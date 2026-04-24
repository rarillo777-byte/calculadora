import operaciones.*;

public class Calculadora {

    public static void main(String[] args) {

        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion mult = new Multiplicacion();
        Division div = new Division();

        System.out.println("Suma: " + suma.calcular(5, 4));
        System.out.println("Resta: " + resta.calcular(5, 3));
        System.out.println("Multiplicación: " + mult.calcular(5, 3));
        System.out.println("División: " + div.calcular(5, 3));
    }
}