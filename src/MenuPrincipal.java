import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Intentos de Contrasena");
            System.out.println("2. Numeros Positivos (Suma y Promedio)");
            System.out.println("3. Validar Nota (0-10)");
            System.out.println("4. Cajero Automatico");
            System.out.println("5. Contador Pares/Impares");
            System.out.println("6. Ventas Diarias");
            System.out.println("7. Numeros hasta Negativo");
            System.out.println("8. Tabla de Multiplicar");
            System.out.println("9. Factorial de un Numero");
            System.out.println("10. Contador Positivos/Negativos/Ceros");
            System.out.println("11. Promedio de Calificaciones");
            System.out.println("12. Secuencia Fibonacci");
            System.out.println("13. Numero Mayor y Menor");
            System.out.println("14. Suma Pares (1-200)");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    // Aqui va el ejercicio 1
                    break;
                case 2:
                    // Aqui va el ejercicio 2
                    break;
                case 3:
                    // Aqui va el ejercicio 3
                    break;
                case 4:
                    // Aqui va el ejercicio 4
                    break;
                case 5:
                    // Aqui va el ejercicio 5
                    break;
                case 6:
                    // Aqui va el ejercicio 6
                    break;
                case 7:
                    // Aqui va el ejercicio 7
                    break;
                case 8:
                    // Aqui va el ejercicio 8
                    break;
                case 9:
                    // Aqui va el ejercicio 9
                    break;
                case 10:
                    // Aqui va el ejercicio 10
                    break;
                case 11:
                    // Aqui va el ejercicio 11
                    break;
                case 12:
                    // Aqui va el ejercicio 12
                    break;
                case 13:
                    // Aqui va el ejercicio 13
                    break;
                case 14:
                    // Aqui va el ejercicio 14
                    break;
                case 15:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 15);
    }
}