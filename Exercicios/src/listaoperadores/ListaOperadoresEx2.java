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

public class ListaOperadoresEx2 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que leia um número real e o imprima;
        */
        
        Scanner scan = new Scanner(System.in);  //Instancia a classe Scanner como parametro o input do sistema
        
        double num1;   //Declara variavel num1 como double(pode receber qualquer numero real)

        //Lê o input do sistema
        System.out.print("\n\nDigite um numero real: ");
        num1 = scan.nextDouble();
        
        //Imprime no output do sistema
        System.out.println("\nO numero que voce digitou e: "+num1);
    }
}
