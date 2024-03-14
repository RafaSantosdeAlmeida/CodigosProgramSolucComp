/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoperadores;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;   //Importa a biblioteca Scanner

public class ListaOperadoresEx1 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que leia um número inteiro e o imprima;
        */
        
        Scanner scan = new Scanner(System.in);  //Instancia a classe Scanner como parametro o input do sistema
        
        int num1;   //Declara variavel num1 como inteiro

        //Lê o input do sistema
        System.out.print("\n\nDigite um numero inteiro: ");
        num1 = scan.nextInt();
        
        //Imprime no output do sistema
        System.out.println("\nO numero que voce digitou e: "+num1);
        
    }
}
