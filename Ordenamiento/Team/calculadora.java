import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {  // se repite hasta que elija salir
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Segundo número: ");
                double num2 = sc.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (opcion == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (opcion == 4) {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida.");
            }

            // Tabla de multiplicar con FOR
            if (opcion == 3) {
                System.out.println("\nTabla de multiplicar del resultado:");
                int resultado = (int)(sc.nextDouble()); 
                for (int i = 1; i <= 10; i++) {
                    System.out.println(resultado + " x " + i + " = " + (resultado * i));
                }
            }

            System.out.println(); // espacio entre operaciones
        }

        sc.close();
        System.out.println("¡Adiós!");
    }
}
