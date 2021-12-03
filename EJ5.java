import java.util.Scanner;

public class EJ5 {
    /*
     *                               Analisis
     * Proposito: Imprime al usuario una piramide de asteriscos segun la
     * altura indicada por teclado, usaremos un PARA anidado
     *
     * Entrada: entero
     *
     * Salida: none
     *
     *                               Entorno
     * Variables: Entero altura;
     *
     *
     * Programa generalizado:
     *
     *       Inicio:
     *          Pedir numero
     *          Bucle PARA imprimir la altura
     *              Bucle PARA imprimir asteriscos
     *       Fin
     *
     * Programa detallado:
     *
     *       Inicio:
     *          Entero numero
     *              //Pedir altura
     *          Escribir("Introduce altura: ")
     *          Leer(numero)
     *              //Bucle PARA imprimir la altura
     *          Para Entero fila = 0 Hasta altura Hacer
     *                  //Bucle PARA imprimir asteriscos
     *              Para Entero asteriscos = 0 Hasta altura Hacer
     *                  Escribir(" * ")
     *              FinPara
     *              Escribir(saltoDeLinea)
     *          FinPara
     *       Fin
     *
     */
    public static void main(String[] args) {
        int altura;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la altura del triangulo");
        altura = scan.nextInt();
        for (int fila = 0; fila < altura; fila++) {
            for (int asteriscos = 0; asteriscos <= fila; asteriscos++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

