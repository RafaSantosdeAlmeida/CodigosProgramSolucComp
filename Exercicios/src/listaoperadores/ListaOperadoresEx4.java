/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoperadores;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;

public class ListaOperadoresEx4 {
    public static void main(String[] args) {
        /*
        Faça programa em que o usuário digita uma letra e o programa
        retorna o número inteiro do código UNICODE referente àquela letra.
        */
        
        //Imprime titulo do programa
        System.out.println("\n\n_____________________________________\n\nPrograma conversor de letra para valor do UNICODE\n_____________________________________");
        
        //Instancia a classe Scanner com o parametro de input de sistema
        Scanner scan = new Scanner(System.in);
        
        //Declara variaveis
        char caracter;
        
        //Atribui um valor as variaveis
        System.out.print("\nDigite uma letra do alphabeto: ");
        caracter = scan.next().charAt(0);
        System.out.println("Numero Unicode: "+(int)caracter);
        
    }
}
