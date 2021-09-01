/*
 *leia o primeiro numero real do teclado
 * leia o segundo numero real do teclado
 * some os dois numeros
 * o resultado da soma divida por 2
 * imprima a sua média é: #resultado
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        float soma;
        float media;

        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Primeiro numero:");
        int num1 = leTeclado.nextInt();
        System.out.println("Segundo numero:");
        int num2 = leTeclado.nextInt();

        soma = num1 + num2;
        media = soma / 2;

        System.out.println("A sua média é:" + media);
    }
}
