/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioMatrizDesconto;

/**
 *
 * @author Dinopc
 */
public class DescontoComMatriz {
    public static void main(String[] args) {
        double[][] precos = {{75000},{},{},{}};
        double[][] desconto = {{},{},{},{}}; 
        
        
        calcularDesconto()
        
    }
    
    private static void calcularDesconto(double[][] precos,double[][] desconto){
        
        double[][] precoFinal = new double[precos.length][precos[0].length];
        
        for (int linha = 0; linha < precos.length; linha++) {
            for (int coluna = 0; coluna < precos[linha].length; coluna++) {
                precoFinal[linha][coluna] = precos[linha][coluna]*(1-desconto[linha][coluna]);
                System.out.println(precoFinal+"\t");
            }
        }
        
        
    }
 
}
