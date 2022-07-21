/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
*/

import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Digite o numero de casos: ");
        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos) {
           // System.out.println("Digite o primeiro valor: ");
            double a = input.nextDouble();
           // System.out.println("Digite o segundo valor: ");
            double b = input.nextDouble();
           // System.out.println("Digite o terceiro valor: ");
            double c = input.nextDouble();

            System.out.printf("%.1f", ((2.0 * a) + (3.0 * b) + (5.0 * c)) / 10.0);
            System.out.println("");
            cont++;
        }

    }
}
