package Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0){

            System.out.println("======== Menú ========");
            System.out.println("| 1.Hablar con el duro");
            System.out.println("| 2. Pepe el herrero");
            System.out.println("| 3. Moro en la costa");
            System.out.println("| 0. Salir corriendo");
            System.out.println("======================");
            System.out.println("¿Que le gustaría hacer?");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Podrás hablar conmigo jefe, soy Juanfran, duro");
                    break;
                case 2:
                    System.out.println("Hola soy Pepe el herrero");
                    break;
                case 3:
                    System.out.println("Soy Rehman y me gusta el jamón");
                    break;
                case 0:
                    System.out.println("Hasta mañana...");
                    break;
                default:
                    System.out.println("Escribe una opción válida, vaya empanada mesopotámica me llevas");
                    break;

            }
        }
    }
}