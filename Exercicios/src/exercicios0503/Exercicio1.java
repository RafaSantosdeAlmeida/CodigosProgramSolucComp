/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios0503;

/**
 *
 * @author Dinopc
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Criar as variaveis inteiras: num1, num2 e resto.
            O programa deve mostrar na tela o resto da divisao
            entre num1 e num2.
        */
        
        //declarar variaveis
        int num1 = 5;
        int num2 = 3;
        int resto = num1%num2;  //a variavel resto recebe o "resto" da divisao de num1 por num2
        
        //imprimir resultados
        System.out.println("O resto da divisao de "+num1+" e "+num2+" resulta "+resto);
    }
    
}
