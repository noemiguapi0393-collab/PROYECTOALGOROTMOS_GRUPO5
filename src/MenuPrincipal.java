import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==========================");
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("==========================");
            System.out.println("1. Intentos de Contrasena (Ej 1)");
            System.out.println("2. Numeros Positivos (Suma y Promedio) (Ej 2)");
            System.out.println("3. Validar Nota 0-10 (Ej 3)");
            System.out.println("4. Cajero Automatico (Ej 4)");
            System.out.println("5. Contador Pares/Impares (Ej 5)");
            System.out.println("6. Ventas Diarias (Ej 6)");
            System.out.println("7. Numeros hasta Negativo (Ej 7)");
            System.out.println("8. Tabla de Multiplicar (Ej 8)");
            System.out.println("9. Factorial de un Numero ");
            System.out.println("10. Contador Positivos/Negativos/Ceros ");
            System.out.println("11. Promedio de Calificaciones ");
            System.out.println("12. Secuencia Fibonacci ");
            System.out.println("13. Numero Mayor y Menor ");
            System.out.println("14. Suma Pares 1-200 (Ej 14)");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Ejercicio 1 [cite: 11, 12]
                    System.out.println("\n::: INICIANDO CONTROL DE ACCESOS :::");
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
                }
                case 2 -> {
                    // Ejercicio 2
                    System.out.println("\n========================================");
                    System.out.println("   PROCESADOR DE ENTEROS POSITIVOS      ");
                    System.out.println("========================================");
                    int num, cant = 0;
                    long suma = 0; 
                    while (true) {
                        System.out.print("Ingrese un numero entero positivo: ");
                        num = sn.nextInt();
                        if (num < 0) {
                            System.out.println(">> [AVISO]: Detectado numero negativo. Procesando estadisticas finales...");
                            break; 
                        }
                        cant++;
                        suma += num;
                    }
                    System.out.println("\n========================================");
                    System.out.println("          REPORTE GENERAL (EJ 2)        ");
                    System.out.println("========================================");
                    System.out.println("  - Total Datos Registrados : " + cant);
                    System.out.println("  - Sumatoria Calculada     : " + suma);
                    if (cant > 0) {
                        double promedio = (double) suma / cant;
                        System.out.println("  - Promedio de Muestreo    : " + promedio);
                    } else {
                        System.out.println("  - Promedio de Muestreo    : N/A (Sin datos)");
                    }
                    System.out.println("========================================");
                }
                    
                case 3 -> {
                    // Ejercicio 3
                    System.out.println("\n**************");
                    System.out.println("* VALIDADOR DE CALIFICACIONES    *");
                    System.out.println("************");
                    double nota;
                    do {
                        System.out.print("Digite la nota final (0.0 - 10.0): ");
                        nota = sn.nextDouble();
                        if (nota < 0 || nota > 10) {
                            System.out.println(">> Error: Entrada invalida.");
                        }
                    } while (nota < 0 || nota > 10);
                    System.out.println("------------------------------------");
                    System.out.println(" RESULTADO: Nota " + nota + " aceptada.");
                    System.out.println("------------------------------------");
                }

                case 4 -> {
                    // Ejercicio 4
                    System.out.println("\n--- CAJERO AUTOMÁTICO ---");

                    int iCajero = 0;
                    boolean acceso = false;
                    while (iCajero < 3 && !acceso) {
                        System.out.println("Intentos restantes: " + (3 - iCajero));
                        System.out.print("Clave de cajero: ");
                        String c = sn.next();

                        while (c.length() != 4) {
                            System.out.println("Error: La clave debe tener 4 dígitos.");
                            System.out.print("Clave de cajero: ");
                            c = sn.next();
                        }

                        if (c.equals("1234")) {
                            acceso = true;
                        } else {
                            iCajero++;
                            System.out.println("La clave introducida es incorrecta.\n"); 
                        }
                    }
                    
                    // CAMBIO 6: Separador visual
                    System.out.println("---------------------------------");

                    if (acceso) {
                        System.out.println("Bienvenido!");
                    } else {
                        System.out.println("Acceso bloqueado.");
                    }
                }

                case 5 -> { 
                    System.out.println("---CONTEO DE PARES E IMPARES ");
                    int numero5;
                    int pares = 0;
                    int impares= 0;
                    do{
                        System.out.println("Ingrese un numero: ");
                        numero5 = sn.nextInt();
                        if(numero5 !=0){
                            if(numero5 % 2 == 0){ 
                                pares++;
                            }else{
                                impares++;
                            }
                        }
                        }while(numero5 !=0);
                    System.out.println("\nRESULTADOS");
                    System.out.println("Cantidad de pares: "+pares );
                    System.out.println("Cantidad de impares: "+impares);
                        
                        
                    break;
                    
                }
                case 6 -> {
                    double venta;
                    double total =0;
                    int cantidad =0;
                    do { System.out.println("Ingrese una venta: ");
                    venta= sn.nextDouble();
                        if (venta < 0) { 
                            System.out.println("no se permiten ventas negartivas ");}
                        else if(venta !=0) { 
                            total += venta;
                            cantidad++;
                         }
                    }while(venta !=0);
                    System.out.println("Total vendido: $"+total);
                    System.out.println("Cantidad de ventas: "+cantidad);
                    
                    break; 
                    
                }
                case 7 -> {
                    int numControl;
                    int cantidad=0;
                    System.out.println("\n=== INGRESO DE NUMEROS ===");
                    System.out.println("El programa finalizara cuando ingrese un numero negativo.");
                    System.out.println("Ingrese un numero: ");
                    numControl =sn.nextInt();
                    while(numControl >=0){
                        cantidad++;
                        System.out.println("Ingrese un numero: ");
                        numControl =sn.nextInt();
                    }
                    System.out.println("\nSe ingreso un numero negativo.");
                    System.out.println("Cantidad de numeros no negativos ingresados: " + cantidad);
                    break;
                    
                }
                case 8 -> {
                    int tabla;
                    int resultado;
                    System.out.println("Ingrese un numero: ");
                    tabla= sn.nextInt();
                    if(tabla>0 ){
                        System.out.println("TABLA DEL"+tabla);
                        for(int i=1;i<=20; i++){
                            resultado = tabla*i;
                            System.out.println( tabla+" x "+i+"="+resultado );
                    }} else{ System.out.println("Debe ingresar un numero positivo");
                                
                                }
                    break;
                    
                }
                
                
                case 9 -> {
                    System.out.println("================================");
                    System.out.println("FACTORIAL DE UN NUMERO INGRESADO");
                    System.out.println("=================================");
                    System.out.print("Ingrese un número: ");
                    int numFactorial = sn.nextInt();
                    
                    long factorial = 1;
                    
                    for (int i = 1; i <= numFactorial; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + numFactorial + " es: " + factorial);
                }
                case 10 -> {
                    System.out.println("===================================================");
                    System.out.println("BIENVENIDOS A Contador de Positivos/Negativos/Ceros");
                    System.out.println("===================================================");
                    System.out.println("se solicitara un muestreo de 15 numeros enteros.\n");
                    
                    int positivos = 0;
                    int negativos = 0;
                    int ceros = 0;
                    
                    for (int i = 1; i <= 15; i++){
                        System.out.print("Ingrese el número " + i + ": ");
                        int numIngresado = sn.nextInt();
                        
                        if (numIngresado > 0) {
                            positivos++;
                        } else if (numIngresado < 0) {
                            negativos++;
                        } else {
                            ceros++;
                        }
                    }
                    System.out.println("REPORTE DE CLASIFICACION");
                    System.out.println("Cantidad de valores Positivos: " + positivos);
                    System.out.println("Cantidad de valores Negativos: " + negativos);
                    System.out.println("Cantidad de valores Ceros: " + ceros);
                }
                
                case 11 -> {
                    System.out.println("========================================");
                    System.out.println("BIENVENIDOS A Promedio de Calificaciones");
                    System.out.println("========================================");
                    System.out.print("se procesara el promedio de 20 estudiantes.\n ");
                
                    double sumaCalificaciones = 0;
                    
                    for (int i = 1; i <= 20; i++) {
                        
                        System.out.print("Ingrese la calificación del estudiante " + i + ": ");
                        double notaEstudiante = sn.nextDouble();
                        
                        sumaCalificaciones += notaEstudiante;
                    }
                    
                    double promedio = sumaCalificaciones / 20;
                    
                    System.out.println("El promedio general de las notas es : " + promedio);
                }
                
                case 12 -> {
                    System.out.println("====================================");
                    System.out.println("BIENVENIDOS a la Secuencia Fibonacci");
                    System.out.println("====================================");
                    System.out.print("Ingrese la cantidad de términos: ");
                   
                    int n = sn.nextInt();
                    
                    int a = 0;
                    
                    int b = 1;
                    
                    System.out.println("Serie de Fibonacci:");
                    
                    for (int i = 1; i <= n; i++) {
                    
                    System.out.print(a + " ");
                        
                    int siguiente = a + b;
                    a = b;
                    b = siguiente;
                    }
                    //ejercicio terminado
                }
                case 13 -> {
                    System.out.println("===================================");
                    System.out.println("DETERMINAR EL NUMERO MAYOR Y MENOR" );
                    System.out.println("===================================");
                    
                    System.out.println("Ingrese el primer numero: ");
                    
                    int numePrimero = sn.nextInt();
                    int mayor = numePrimero; 
                    int menor = numePrimero ;
                    
                    for (int i = 2; i <= 10; i++) {
                        System.out.println("Ingrese el numero : "+ i +" : ");
                        numePrimero = sn.nextInt();
                        if (numePrimero > mayor ){
                            mayor = numePrimero;
                        }
                        if (numePrimero < menor ){
                            menor = numePrimero;
                        }
                    }
                    System.out.println("==========");
                    System.out.println("RESULTADOS");
                    System.out.println("===========");
                    System.out.println("NUMEROS MAYORES: "+ mayor );
                    System.out.println("NUMEROS MENORES: " + menor);
                   
               }
                case 14 -> {// Ejercicio 14: Suma de pares 1 al 200
                System.out.println("\n=================================");
                System.out.println("--- SUMA DE PARES (1-200) ---");
                System.out.println("=================================");
                System.out.println("Optimizando proceso mediante la Formula de Gauss...");
                
                long tiempoInicio = System.nanoTime();
                int resultadoFormula = 100 * 101;
                long tiempoFin = System.nanoTime();
                
                if (resultadoFormula > Integer.MAX_VALUE || resultadoFormula < 0) {
                    System.out.println("STATUS ERROR: Desbordamiento de memoria detectado.");
                } else {
                    System.out.println("La suma de los pares es: " + resultadoFormula);
                }
                
                System.out.println("Tiempo de procesamiento: " + (tiempoFin - tiempoInicio) + " ns");
                System.out.println("=================================\n");
                }
                
                case 15 -> {
                System.out.println("==================================");
                System.out.println("Determinar si es un numero primo"  ); 
                System.out.println("==================================");

                System.out.println("Ingrese un numero positivo entero: ");
                //declaracion variables
                int numerPrimo = sn.nextInt();
                int contadorDivisores = 0 ;
                
                if (numerPrimo <=1){
                System.out.println("El numero " + numerPrimo "no es numero primo ");
                
                }else{
                    //ciclo para 
                    for (int i = 1; i <= numerPrimo; i++) {
                        if (numerPrimo % i == 0){
                            contadorDivisores++;
                        }
                    }
                if (contadorDivisores ==2)
                
                }
                
                }
            
          
               
    




