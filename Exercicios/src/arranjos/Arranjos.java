/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arranjos;

/**
 *
 * @author Dinopc
 */

import java.util.Arrays;

public class Arranjos {
    public static void main(String[] args) {
        /*
        Arranjos/Arrays
        
        O arranjo é um conjunto de variaveis do mesmo tipo,
        seja ele primitivo não primitivo.
        */
        
        //DECLARAR ARRAY
        int[] idades = {19,20,22,30,32};
        String[] nomes = {"Rafael","Pedro","Julia","Jose","Paula"};
        int[][] arrayMultiD = {{1,2,3,6},{3,2,1,3},{3,3,5,1}};
        
        //Printar na tela nome e idade
        System.out.println("Nomes\tIdades\n--------------");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]+"\t"+idades[i]);
        }
        
        //mostrarArray(arrayMultiD);  //Mostra na tela as linhas, colunas e elementos de um array multidimensional
        
    }
    
    
    private static void mostrarArray(int[][] array){
        
        //Faz loop para cada coluna
        for (int i = 0; i < array[0].length; i++) {
            System.out.print("\tCol"+i);    //Imprime os indices das colunas
        }
        
        //Faz loop para cada linha
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n"+i+"\t");  //Imprime os indices das linhas
            
            //Faz loop para cada coluna
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            
        }
        
        System.out.println("\n");
        
    }
    
    
}
