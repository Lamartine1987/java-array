package br.com.arrays;

import java.util.Scanner;

public class ArraysConsoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do array que você deseja? ");
        int tam_array = scan.nextInt();

        String[] consoantes = new String[tam_array];

        int count = 0, qtd_consoantes = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                qtd_consoantes++;
            }
            count++;
        }while(count < consoantes.length);
        System.out.println("\nQuantidade de consoantes: " + qtd_consoantes);
        System.out.print("Consoantes: ");
        for ( String consoante : consoantes ) {
            if(consoante != null)System.out.print(consoante + ", ");
        }
    }
}
