/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDeCondicional;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;

public class EstruturaDeCondicional {
    public static void main(String[] args) {
        //Estrutura de condicional exemplo
        
        //Titulo do programa
        System.out.println("\n\n___________________________________\n\nPrograma verificador de par e impar\n___________________________________");
        
        //Instanciando a classe Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Declarando as variaveis
        int num;
        
        //Atribuindo valores as variaveis
        System.out.print("\nDigite um numero inteiro: ");
        num = teclado.nextInt();
        teclado.close();
        
        //Estrutura de condicional
        if (num%2 == 0){
            System.out.println("Seu numero e par");
        }
        else    {
            System.out.println("Seu numero e impar");
        }
    }
}
