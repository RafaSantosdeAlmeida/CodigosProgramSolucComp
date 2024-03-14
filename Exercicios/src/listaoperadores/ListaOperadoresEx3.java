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

public class ListaOperadoresEx3 {
    public static void main(String[] args) {
        
        /*
        Peça ao usuário para digitar três valores inteiros e imprima a soma deles;
        */
        
        //Imprime o titulo do programa
        System.out.println("\n\n____________________________________________\n\nPrograma para calcular SOMA de tres numeros inteiros\n____________________________________________");
        
        //Instancia a classe Scanner com o parametro o input do sistema
        Scanner scan = new Scanner(System.in);
        
        //Declara as variaveis
        int num1,num2,num3,soma;

        //Atribui valores as variaveis declaradas
        System.out.print("\nDigite o primeiro numero inteiro: ");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        num2 = scan.nextInt();
        System.out.print("Digite o terceiro numero inteiro: ");
        num3 = scan.nextInt();
        soma = num1+num2+num3;
        
        //Imprime no output do sistema
        System.out.println("\nSOMA e igual a: "+soma);
    }
}
