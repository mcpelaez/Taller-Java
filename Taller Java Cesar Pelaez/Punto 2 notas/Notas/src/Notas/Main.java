package tallerClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el documento del estudiante:");
        String documento = scanner.nextLine();

        System.out.println("Ingrese el nombre de la asignatura:");
        String asignatura = scanner.nextLine();

        System.out.println("Ingrese la nota del primer parcial:");
        double nota40 = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la nota del segundo parcial:");
        double nota60 = Double.parseDouble(scanner.nextLine());

        notas notas1 = new notas(documento, asignatura, nota40, nota60);
        System.out.println(notas1);
        System.out.println("El estudiante ha " + (notas1.evaluarAprobacion().equals("Aprobado") ? "aprobado" : "reprobado") + " la asignatura.");

        System.out.println("\nIngrese el documento del segundo estudiante:");
        documento = scanner.nextLine();

        System.out.println("Ingrese el nombre de la asignatura:");
        asignatura = scanner.nextLine();

        System.out.println("Ingrese la nota del primer parcial:");
        nota40 = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la nota del segundo parcial:");
        nota60 = Double.parseDouble(scanner.nextLine());

        notas notas2 = new notas(documento, asignatura, nota40, nota60);
        System.out.println(notas2);
//        System.out.println("El estudiante ha " + (notas2.evaluarAprobacion().equals("Aprobado") ? "aprobado" : "reprobado") + " la asignatura.");
System.out.println(notas2.evaluarAprobacion());
        scanner.close();
    }
}



