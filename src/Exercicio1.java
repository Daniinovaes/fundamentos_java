/*
 *leia um nome do usuário do teclado
 * imprima Olá, #NOME
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        Scanner leTeclado = new Scanner(System.in);
        String nome = leTeclado.next();
        System.out.println("Oi, " + nome);
    }
}
