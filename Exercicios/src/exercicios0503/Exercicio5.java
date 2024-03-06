/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios0503;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;   //importar a classe Scanner

public class Exercicio5 {
    public static void main(String[] args) {
        /*
            Fazer um conversor de moeda BRL -> USD.
            O usuario digita um valor em reais e o
            programa deve devolver o equivalente em dolar.
        */
        
        //criar novo objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);    //Cria um objeto Scanner que possui como parametro System.in

        //declarar variaveis
        float reais,dolar,cotacaod;
        
        System.out.print("Digite um valor em reais(R$): ");   //Exibir para o usuario oque fazer
        
        //atribuir valores as variaveis
        reais = sc.nextFloat();
        cotacaod = 4.96f;
        dolar = reais/cotacaod;
        
        //imprimir no console o valor convertido em dolar
        System.out.println("\nO valor do seu dinheiro em dolar($): "+dolar+"\n");
    }
}
