/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios0503;

/**
 *
 * @author Dinopc
 */
public class Exercicio4 {
    public static void main(String[] args) {
        /*
            Criar um variavel do tipo char (caractere).
            Criar uma outra variavel do tipo int (num).
            Num deve receber caractere.
            Imprimir na tela a variavel num.
        */
        
        //declarar variaveis
        char caractere;
        int num;
        
        //atribuir valores as variaveis
        caractere = '1';
        num = Character.getNumericValue(caractere); //num recebe o valor numerico que o caractere representa no unicode(ASCII)
        
        
        //imprimir resultado
        System.out.println("O numero que o caractere "+caractere+" representa e "+num);
    }
}
