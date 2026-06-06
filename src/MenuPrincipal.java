import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Intentos de Contrasena (Ej 1)");
            System.out.println("2. Numeros Positivos (Suma y Promedio) (Ej 2)");
            System.out.println("3. Validar Nota 0-10 (Ej 3)");
            System.out.println("4. Cajero Automatico (Ej 4)");
            System.out.println("5. Contador Pares/Impares (Ej 5)");
            System.out.println("6. Ventas Diarias (Ej 6)");
            System.out.println("7. Numeros hasta Negativo (Ej 7)");
            System.out.println("8. Tabla de Multiplicar (Ej 8)");
            System.out.println("9. Factorial de un Numero (Ej 9)");
            System.out.println("10. Contador Positivos/Negativos/Ceros (Ej 10)");
            System.out.println("11. Promedio de Calificaciones (Ej 11)");
            System.out.println("12. Secuencia Fibonacci (Ej 12)");
            System.out.println("13. Numero Mayor y Menor (Ej 13)");
            System.out.println("14. Suma Pares 1-200 (Ej 14)");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:// Ejercicio 1 [cite: 11, 12]
                    String llaveMaestra = "utc2026"; 
                    int intentos = 0;
                    while (true) { 
                        System.out.print("Ingrese el codigo de seguridad requerido: ");
                        String clave = sn.next();
                        intentos++;
                        if (clave.equalsIgnoreCase(llaveMaestra)) {
                            break; 
                        }
                        System.out.println("[ALERTA] Credenciales incorrectas. Pruebe otra vez.");
                        if (intentos >= 3) {
                            System.out.println(">> [SISTEMA]: Se han detectado multiples fallos continuos.");
                        }
                    } 
                    System.out.println("\n========================================");
                    System.out.println("  AUDITORIA: LOGIN PROCESADO CON EXITO  ");
                    System.out.println("  Intentos registrados en consola: " + intentos);
                    System.out.println("========================================");
                    break;
                case 2: // Ejercicio 2 [cite: 13, 14]
                    int num, cant = 0, suma = 0;
                    while (true) {
                        System.out.print("Ingrese un entero positivo: ");
                        num = sn.nextInt();
                        if (num < 0) break;
                        cant++;
                        suma += num;
                    }
                    if (cant > 0) {
                        System.out.println("Cantidad: " + cant + " | Suma: " + suma + " | Promedio: " + ((double)suma/cant));
                    } else System.out.println("No se ingresaron numeros validos.");
                    break;

                case 3: // Ejercicio 3 [cite: 15, 16]
                    double nota;
                    do {
                        System.out.print("Ingrese nota (0-10): ");
                        nota = sn.nextDouble();
                    } while (nota < 0 || nota > 10);
                    System.out.println("Nota valida registrada: " + nota);
                    break;

                case 4: // Ejercicio 4 [cite: 17, 18]
                    int iCajero = 0;
                    boolean acceso = false;
                    while (iCajero < 3 && !acceso) {
                        System.out.print("Clave de cajero: ");
                        String c = sn.next();
                        if (c.equals("1234")); // Clave fija de ejemplo
                        if (c.equals("1234")) acceso = true;
                        else { iCajero++; System.out.println("Incorrecta."); }
                    }
                    if (acceso) System.out.println("Bienvenido!");
                    else System.out.println("Acceso bloqueado.");
                    break;

                case 5:
                    // COMPANERO 2: Aqui borras esto y pones tu Ejercicio 5 [cite: 19]
                    break;
                case 6:
                    // COMPANERO 2: Aqui borras esto y pones tu Ejercicio 6 [cite: 20, 21]
                    break;
                case 7:
                    // COMPANERO 2: Aqui borras esto y pones tu Ejercicio 7 [cite: 22]
                    break;
                case 8:
                    // COMPANERO 3: Aqui borras esto y pones tu Ejercicio 8 [cite: 23]
                    break;
                case 9:
                    // COMPANERO 3: Aqui borras esto y pones tu Ejercicio 9 [cite: 24]
                    break;
                case 10:
                    // COMPANERO 3: Aqui borras esto y pones tu Ejercicio 10 [cite: 25]
                    break;
                case 11:
                    // COMPANERO 4: Aqui borras esto y pones tu Ejercicio 11 [cite: 26]
                    break;
                case 12:
                    // COMPANERO 4: Aqui borras esto y pones tu Ejercicio 12 [cite: 27]
                    break;
                case 13:
                    // COMPANERO 4: Aqui borras esto y pones tu Ejercicio 13 [cite: 28]
                    break;
                case 14:
                    // COMPANERO 4: Aqui borras esto y pones tu Ejercicio 14 [cite: 29]
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



