import java.util.Scanner;

public class EJ7 {
    /*
     *                               Analisis
     * Proposito: Resolver al usuario el numero combiantorio de N y M, para ello
     * usaremos la funcion FACTORIAL(), comprobaremos si n > m
     *
     * Entrada: long
     *
     * Salida: long
     *
     *                               Entorno
     * Variables: Long n, m, resultado;
     *
     *
     * Programa generalizado:
     *
     *       Inicio:
     *          Pedir numero N
     *          Pedir numero M
     *          Comprobar si n > m
     *              Calculos de resultado con la funcion FACTORIAL()
     *          Mostrar resultado
     *       Fin
     *
     * Programa detallado:
     *
     *       Inicio:
     *          Long n, m, resultado = 0;
     *              //Pedir numero N
     *          Escribir("Introduce un numero N: ")
     *          Leer(numero)
     *              //Pedir numero M
     *          Escribir("Introduce un numero M: ")
     *          Leer(numero)
     *              //Comprobar si n > m
     *          Si n > m
     *                  //Calculos de resultado con la funcion FACTORIAL()
     *              resultado = factorial(n) / factorial(m) * factorial(n-m)
     *          SiNo
     *              Escribir("N tiene que ser mayor que M")
     *          FinSI
     *              //Mostrar resultado
     *          Escribir(resultado)
     *       Fin
     *
     */
    public static void main(String[] args) {
        long n, m, resultado = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculo del numero combinatorio");
        System.out.print("Introduce un numero N: ");
        n = scan.nextInt();
        System.out.print("Introduce un numero M: ");
        m = scan.nextInt();
        if (n > m){
            resultado = factorial(n) / factorial(m) * factorial(n-m);
        } else {
            System.out.println("N tiene que ser mayor que M");
        }
        System.out.println("El resultado es " + resultado);
    }


    /*
     *                               Analisis
     * Proposito: Culcular el factorila de un numero
     *
     * Entrada: long
     *
     * Salida: long
     *
     *                               Entorno
     * Variables: Long numero, resultado;
     *
     *
     * Programa generalizado:
     *
     *       Inicio:
     *          Comprobar si numero es igual a 1
     *          Calcular el factorial
     *          Devolver resultado
     *       Fin
     *
     * Programa detallado:
     *
     *       Inicio:
     *          Long resultado = 0;
     *              //Comprobar si numero == 1
     *          Si numero == 1
     *               resultado = 1;
     *          SiNo
     *                  //Calcular el factorial
     *              resultado = resultado * factorial(numero - 1)
     *          FinSI
     *              //Devolver resultado
     *          Return resultado
     *       Fin
     *
     */
    private static long factorial(long numero) {
        long resultado = 0;
        if (numero == 1){
            resultado = 1;
        } else {
            resultado = numero * factorial(numero - 1);
        }
        return resultado;
    }


}
