/*
Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar na hora de tentar encontrar algum vídeo específico. 
Entretanto, como você é programador e domina a artes de conseguir o que quer por meio do código, 
você decidiu escrever um programa para encontrar os seus vídeos na página. Dada a lista de gameplays publicados na página, 
determine quantos gameplays seus de Contra-Strike foram publicados. */

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number,id;
        //System.out.println("Digite o número de gameplays publicadas");
        number=sc.nextInt();
        //System.out.println("Digite o seu identificador na universidade");
        id=sc.nextInt();

        int count=0;
        while(number>0){

            int id1,num;

            //System.out.println("Digite o identificador do player");
            id1=sc.nextInt();
            //System.out.println("Digite o numero referente ao game: 0 - CS 1 - LOL");
            num=sc.nextInt();

            if(id== id1 &&  num==0){
                count++;
            }

            number--;
        }
        System.out.println(count);

    }
}
