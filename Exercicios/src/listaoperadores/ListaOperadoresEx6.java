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

public class ListaOperadoresEx6 {
    public static void main(String[] args) {
        /*
        Faça para converter a velocidade de km/h para m/s.
        v(m/s)=v(Km/h)/3,6 
        */
        
        //Imprime o titulo do programa
        System.out.println("\n\n_____________________________________\n\nPrograma conversor de m/s para Km/h\n_____________________________________");
        
        //Instancia a classe Scanner com o parametro de input de sistema
        Scanner teclado = new Scanner(System.in);
        
        //Declara a variavel
        float velocidadeKmh;
        
        //Atribui valor a velocidadeMS
        System.out.print("\nDigite o valor da velocidade em Km/h: ");
        velocidadeKmh = teclado.nextFloat();
        
        //Imprime a temperatura em farenheith
        System.out.println("Velocidade em m/s: "+(velocidadeKmh/3.6)); //Calcula a velocidade em m/s
        
    }
}
