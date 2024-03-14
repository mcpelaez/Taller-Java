import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reserva");

        double cedula;
        String tipoHabitacion = " ";
        String nombres = " ";
        String apellidos = " ";
        String fechaIngreso = " ";
        String fechaSalida = " ";
        double precio;

        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese su cedula ");
        cedula = leer.nextDouble();

        System.out.println("ingrese tipo de habitacion que desea ");
        tipoHabitacion = leer.next();

        System.out.println("ingrese su nombre ");
        nombres = leer.next();

        System.out.println("ingrese su apellido ");
        apellidos = leer.next();
        
        System.out.println("ingrese la fecha de ingreso ");
        fechaIngreso = leer.next();

        System.out.println("ingrese la fecha de salida ");
        fechaSalida = leer.next();

        System.out.println("ingrese el precio ");
        precio = leer.nextDouble();

        // Corrección aquí: usa Reservas en lugar de reserva
        reservas reserva1 = new reservas(cedula, tipoHabitacion, nombres, apellidos, fechaIngreso, fechaSalida, precio);
     

        //llamar metodos de la clase reservas
        reserva1.registrarReserva();
        reserva1.consultarReserva();
        reserva1.actualizarReserva();
        reserva1.cambiarEstadoReserva();

        leer.close();
    }
}


