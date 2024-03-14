/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoperadores;

/**
 *
 * @author Dinopc
 */

//Importa as bibliotecas
import java.util.Scanner;
import java.util.Calendar;

public class ListaOperadoresEx8 {
    public static void main(String[] args) {
        /*
        Peça ao usuário inserir um número inteiro e imprima o seu antecessor;
        */
        
        //Instancia as classes
        Scanner teclado = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        //Declara variavel
        int anoNascimento;
        
        //Atribui valor a variavel
        System.out.print("Digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        
        //Imprime numero antecessor
        System.out.println("Sua idade atual: "+(calendario.get(Calendar.YEAR)-anoNascimento));
    }
}
