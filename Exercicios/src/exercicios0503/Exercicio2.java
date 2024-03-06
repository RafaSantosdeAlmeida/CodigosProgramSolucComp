/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios0503;

/**
 *
 * @author Dinopc
 */
public class Exercicio2 {
    public static void main(String[] args) {
        /*
            Criar duas variaveis inteiras (num1 e num2) criar uma variavel double.
            O programa deve imprimir na tela a divisao de num1 por num2.
        */
        
        //declarar variaveis
        int num1=1;
        int num2=2;
        double num3=(double)num1/(double)num2;  //num3 recebe num1 dividido por num2, casting nas variaveis do tipo int
        
        //imprimir resultado
        System.out.println("A divisao de "+num1+" e "+num2+" resulta em "+num3);
    }
}
