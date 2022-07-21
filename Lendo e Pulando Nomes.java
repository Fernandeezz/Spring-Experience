/*Faça um programa com as características abaixo:
  1-Leia 10 nomes, sem espaço em branco;
  2-Imprima o terceiro nome da lista;
  3-Imprima o sétimo nome da lista;
  4-Imprima o nono nome da lista.*/
  
import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        //System.out.println("Digite 10 nomes sem espaço: ");
        for(int i=0 ; i<10 ; i++)
            nomes[i] = sc.nextLine();

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
    }
}
