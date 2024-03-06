/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios0503;

/**
 *
 * @author Dinopc
 */
public class Exercicio3 {
    public static void main(String[] args) {
        /*
            Fazer um programa que calcula a area de uma circunferencia de raio 4.
        */
        
        //declarar variaveis
        double raio,area;
        
        //atribuir valores as variaveis
        raio = 4.0;
        area = Math.PI * Math.pow(raio,2.0);    //ultiliza a classe Math para usar o objeto PI(3,14...) e pow(raiz quadrada), assim calculando a area de uma circunferencia
        
        //Imprimir na tela o resultado do calculo a area da circunferencia
        System.out.println("A area da circunferencia de raio "+raio+" e igual a "+area);
    }
}
