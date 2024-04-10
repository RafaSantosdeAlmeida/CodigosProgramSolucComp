/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacaoDeMatrizes;

import java.util.Arrays;

/**
 *
 * @author Dinopc
 */
public class MultiplicacaoDeMatrizes {
    public static void main(String[] args) {
        //Fazer duas matrizes com valores aleatórios e printar eles e a multiplicação deles
        
        double[][] a = {{2,-3},{5,1}};
        double[][] b = {{4,2},{6,3}};
        /*
        double[][] c = new double[2][2];
        double acumulador;
        
        for (int linha_c = 0; linha_c < c.length; linha_c++) {  //Percorre linhas da matriz c
            for (int coluna_c = 0; coluna_c < c[linha_c].length; coluna_c++) {  //Percorre colunas da matriz c
                for (int elemento_vetor = 0; elemento_vetor < a.length; elemento_vetor++) { //Percorre elementos dos vetores
                    c[linha_c][coluna_c] += a[linha_c][elemento_vetor]*b[elemento_vetor][coluna_c];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(multiplicarMatrizes(a,b)));
        */
        
        
    }
    
    
    
    private static double[][] multiplicarMatrizes(double[][] matriz1,double[][] matriz2){
        double[][] matrizSaida = new double[matriz1.length][matriz2[0].length];
        
        if (matriz1.length==matriz2[0].length){
            
            for (int linhaMatrizSaida = 0; linhaMatrizSaida < matrizSaida.length; linhaMatrizSaida++) {
                for (int colunaMatrizSaida = 0; colunaMatrizSaida < matrizSaida[linhaMatrizSaida].length; colunaMatrizSaida++) {
                    for (int elementoVetor = 0; (elementoVetor < matriz1.length) || (elementoVetor < matriz2[0].length); elementoVetor++) {
                        matrizSaida[linhaMatrizSaida][colunaMatrizSaida] += matriz1[linhaMatrizSaida][elementoVetor]*matriz2[elementoVetor][colunaMatrizSaida];    
                    }
                }
            }
            return matrizSaida;
            
        }
        else{
            
            for (int i = 0; i < matrizSaida.length; i++) {
                for (int j = 0; j < matrizSaida[i].length; j++) {
                    matrizSaida[i][j] = -1;
                }             
            }
            return matrizSaida;
            
        }
    }
    
    
    
}
