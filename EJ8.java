import java.util.Scanner;

public class EJ8 {
    /*
     *                               Analisis
     * Proposito: Imprime al usuario una piramide de Tartaglia segun la
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
     *              Bucle PARA imprimir el numero correspondiente
     *       Fin
     *
     * Programa detallado:
     *
     *       Inicio:
     *          Entero numero, number
     *              //Pedir altura
     *          Escribir("Introduce altura: ")
     *          Leer(numero)
     *              //Bucle PARA imprimir la altura
     *          Para Entero fila = 0 Hasta altura Hacer
     *                  //Bucle PARA imprimir asteriscos
     *              Para Entero asteriscos = 0 Hasta altura Hacer
     *                  Escribir(number * (fila - j) / (j + 1))
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
            int number = 1;
            for (int j = 0; j <= fila; j++) {
                System.out.print(" " + number + " ");
                number = number * (fila - j) / (j + 1);
            }
            System.out.println();
        }
    }
}