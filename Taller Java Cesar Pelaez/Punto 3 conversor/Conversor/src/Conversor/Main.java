package tallerClase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos colombianos a convertir: ");
        double cantidadPesos = Double.parseDouble(scanner.nextLine());

        conversor conversor = new conversor(cantidadPesos);

        System.out.println(conversor);
        System.out.println("Valor en dólares: $" + conversor.convertirDolares());
        System.out.println("Valor en euros: €" + conversor.convertirEuros());

        scanner.close();
    }
}
