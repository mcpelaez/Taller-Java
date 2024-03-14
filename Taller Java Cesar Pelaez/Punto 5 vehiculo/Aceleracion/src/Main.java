import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo miVehiculo = new Vehiculo();

        System.out.println(miVehiculo);
        System.out.println("Ingrese un numero: ");
        int aumento = scanner.nextInt();

        if (aumento >= 0) {
            miVehiculo.acelerar(aumento);
            System.out.println("Vehículo acelerado.");
        } else {
            miVehiculo.detener();
            System.out.println("Vehículo detenido.");
        }

        System.out.println(miVehiculo);
        scanner.close();
    }
}
