/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoperadores;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;   //Importa a lib Scanner

public class ListaOperadoresEx5 {
    public static void main(String[] args) {
        /*
        Peça ao usuário inserir a temperatura em °C e imprima a temperatura em °F:
        F=C*9/5+32
        */
        
        //Imprime o titulo do programa
        System.out.println("\n\n_____________________________________\n\nPrograma conversor de graus CELSIUS para FARENHEIGHT\n_____________________________________");
        
        //Instancia a classe Scanner com o parametro de input de sistema
        Scanner teclado = new Scanner(System.in);
        
        //Declara as variaveis
        float temperaturaCelsius;
        
        //Atribui valor a temperaturaCelsius
        System.out.print("\nDigite o valor da temperatura em CELSIUS: ");
        temperaturaCelsius = teclado.nextFloat();
        
        //Imprime a temperatura em farenheith
        System.out.println("Temperatura em FARENHEIGHT: "+(temperaturaCelsius*9/5+32)); //Calcula a temperatura em farenheith
        
    }
}
