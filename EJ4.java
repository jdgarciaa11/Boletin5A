import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ4 {
    //Menu principal para elegir que queremos pasar a que
    public static void main(String[] args) {
        //Variable
        int opc;
        //Utilidades
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("""
                    Medidas de temperaturas:
                    [1]. Pasar de Celsius a ...
                    [2]. Pasar de Fahrenheit a ...
                    [3]. Pasar de Kelvin a ...
                    [4]. Salir
                    Elige una opcion:\040""");
            opc = scan.nextInt();
            switch (opc) {
                case 1 -> menuCelsius(); //Nos mostrar el menu de Celsius
                case 2 -> menuFahrenheit(); //Nos mostrar el menu de Fahrenheit
                case 3 -> menuKelvin(); //Nos mostrar el menu de Kelvin
                case 4 -> System.out.println("Adios"); //Caso en el que queramos salir
                default -> System.out.println("Opcion no valida"); // Caso para cualquier opcion introducida
            }
        } while (opc != 4); //Si la opc es 4, sales del programa

    }

    private static void menuCelsius() {
        //Variable
        int opc, grado;
        String modo = "celsius"; //Un modo es un indicador que se le pasa un subprograma para que el sepa que tiene que pasar
        //Utilidades
        Scanner scan = new Scanner(System.in);
        char salir = 'N'; //Inicializo el char para que no se salga del do...while
        do {
            System.out.print("Introduce un grado Celsius: ");
            grado = scan.nextInt();
            do {
                System.out.print("""
                        [1]. Pasar a Fahrenheit
                        [2]. Pasar a Kelvin
                        Elige una opcion:\040""");
                opc = scan.nextInt();
                switch (opc) {
                    case 1 -> pasarFahrenheit(grado, modo); //Nos mostrara por pantalla como seria en Fahrenheit
                    case 2 -> pasarKelvin(grado, modo); //Nos mostrara por pantalla como seria en Kelvin
                    default -> System.out.println("Opcion no valida");
                }
            } while (opc != 1 && opc != 2);
            //Modulo para ver si queremos volver a ejecutar el codigo o no
            System.out.println("Deseas volver a pasar grados celsius? S/N");
            salir = scan.next().charAt(0);
        } while (salir == 'S' || salir == 's');
    }

    private static void menuFahrenheit() {
        //Variable
        int opc, grado;
        char salir = 'N';
        String modo = "fahernheit";
        //Utilidades
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Introduce un grado Fahrenheit: ");
            grado = scan.nextInt();
            do {
                System.out.print("""
                        [1]. Pasar a Kelvin
                        [2]. Pasar a Celsius
                        Elige una opcion:\040""");
                opc = scan.nextInt();
                switch (opc) {
                    case 1 -> pasarKelvin(grado, modo);
                    case 2 -> pasarCelsius(grado, modo);
                    default -> System.out.println("Opcion no valida");
                }
            } while (opc != 1 && opc != 2);
            System.out.println("Deseas volver a pasar grados fahernheit? S/N");
            salir = scan.next().charAt(0);
        } while (salir == 'S' || salir == 's');
    }

    private static void menuKelvin() {
        //Variable
        int opc, grado;
        char salir = 'N';
        String modo = "kelvin";
        //Utilidades
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Introduce un grado Kelvin: ");
            grado = scan.nextInt();
            do {
                System.out.print("""
                        [1]. Pasar a Fahrenheit
                        [2]. Pasar a Celsius
                        Elige una opcion:\040""");
                opc = scan.nextInt();
                switch (opc) {
                    case 1 -> pasarFahrenheit(grado, modo);
                    case 2 -> pasarCelsius(grado, modo);
                    default -> System.out.println("Opcion no valida");
                }
            } while (opc != 1 && opc != 2);
            System.out.println("Deseas volver a pasar grados kelvin? S/N");
            salir = scan.next().charAt(0);
        } while (salir == 'S' || salir == 's');
    }

    private static void pasarCelsius(int grado, String modo) {
        //Si es igual al modulo introducido por teclado, este te calcula segun de donde vengas
        if (modo.equals("kelvin")) { // En este caso seria de Celsius a kelvin
            System.out.println((grado - 273.15) + " C");
        } else { // En este caso seria de Celsius a Fahrenheit
            System.out.println(((grado - 32) * 5 / 9) + " C");
        }
    }

    private static void pasarKelvin(int grado, String modo) {
        if (modo.equals("fahernheit")) {
            System.out.println(((grado - 32) * 5 / 9 + 273.15) + " K");
        } else {
            System.out.println((grado + 273.15) + " K");
        }
    }

    private static void pasarFahrenheit(int grado, String modo) {
        if (modo.equals("celsius")) {
            System.out.println(((grado * 9 / 5) + 32) + " F");
        } else {
            System.out.println(((grado - 273.15) * 9 / 5 + 32) + " F");
        }
    }
}
