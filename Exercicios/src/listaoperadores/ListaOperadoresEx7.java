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

public class ListaOperadoresEx7 {
    public static void main(String[] args) {
        /*
        Peça ao usuário inserir um número inteiro e imprima o seu antecessor;
        */
        
        //Instancia a classe Scanner com o parametro de input de sistema
        Scanner teclado = new Scanner(System.in);
        
        //Declara variavel
        int num1;
        
        //Atribui valor a variavel
        System.out.print("Digite um numero inteiro: ");
        num1 = teclado.nextInt();
        
        //Imprime numero antecessor
        System.out.println("O numero antecessor a ele e: "+(num1-1));
    }
}
