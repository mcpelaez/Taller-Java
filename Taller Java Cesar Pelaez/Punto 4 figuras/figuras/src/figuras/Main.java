package figuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);



        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        scanner.close(); // Cerrar el Scanner cuando ya no se necesite
    }
}
