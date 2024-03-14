/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoperadores;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;   //Importa biblioteca

public class ListaOperadoresEx9 {
    public static void main(String[] args) {
        
        /*
        Faça um programa que calcula a área de uma circunferência com precisão de 2 casas decimais.
        */
        
        //Titulo do programa
        System.out.println("\n\n_____________________________________\n\nPrograma calculadora de area de circunferencia\n_____________________________________");
        
        //Instancia o Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Declara variavel
        float raio;
        
        //Atribui valor a raio
        System.out.print("\nDigite o raio da circunferencia: ");
        raio = teclado.nextInt();
        
        //Imprime da circunferencia
        System.out.println("Area da circunferencia: "+calcularAreaCircunferencia(raio));
        
    }
    
    //criando metodo de exemplo
    static float calcularAreaCircunferencia(float raio){
        return  (float)(Math.PI * Math.pow(raio,2));    //pi*raio^2
    }
}
