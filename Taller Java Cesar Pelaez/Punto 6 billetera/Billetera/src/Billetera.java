
import java.util.Scanner;

public class Billetera {
    private double capital;

    public Billetera(double capitalInicial) {
        this.capital = capitalInicial;
    }

    public void depositar(double cantidad) {
        capital += cantidad;
        System.out.println("Se depositaron $" + cantidad + ". El capital actual es: $" + capital);
    }

    public void retirar(double cantidad) {
        if (cantidad <= capital) {
            capital -= cantidad;
            System.out.println("Se retiraron $" + cantidad + ". El capital actual es: $" + capital);
        } else {
            System.out.println("No se puede retirar. Fondos insuficientes.");
        }
    }

    public double getCapital() {
        return capital;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la billetera electrónica");
        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        
        Billetera billetera = new Billetera(capitalInicial);
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    billetera.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    billetera.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Gracias por usar la billetera electrónica.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
