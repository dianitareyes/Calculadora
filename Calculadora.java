import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salida){
            System.out.println("=== Menú de Calculadora ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División (Cociente)");
            System.out.println("5. División (Residuo)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

             opcion = scanner.nextInt();

            if(opcion >= 1 && opcion <= 5){

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();


                 switch (opcion) {
                    case 1: // Suma
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2: // Resta
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3: // Multiplicación
                        System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                        break;
                    case 4: // División 
                        if (num2 != 0) {
                            System.out.println("Resultado de la división: " + (num1 / num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5: // División 
                        if (num2 != 0) {
                            System.out.println("Residuo de la división: " + (num1 % num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }

            }else if (opcion == 6) {
               
                System.out.println("Saliendo del programa. ¡Adiós!");
                salir = true;
            } else {
               
                System.out.println("Opción inválida. Por favor, seleccione una opción entre 1 y 6.");
            }

            System.out.println(); 
        }

           
        scanner.close();
    }
}