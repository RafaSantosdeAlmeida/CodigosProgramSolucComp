/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeFluxo;

/**
 *
 * @author Dinopc
 */
public class LacoDeRepeticaoFor {
    public static void main(String[] args) {
        /*
        For
        
        O for é um laço de repetição assim
        como o while, porém diferente do while
        ele possui o indice da iteracao declarado
        dentro dele
        */
        
        //Loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracao numero "+(i+1));
        }
        
        /*
        Com o for podemos realizar um bloco de
        codigo determinadas quantidades de vezes,
        podemos percorrer um array(arranjo)
        e muitas outras coisas
        */
        
        System.out.println("\n");
        
        //Tabuada do 9
        double[] vetor = new double[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i*9;
            System.out.println(i+" x "+9+" = "+vetor[i]);
        }
        //Agora o vetor possui a tabuada do 9 dentro dele
        System.out.print("\n[");
        for (double saida: vetor){
            System.out.print((int)saida+", ");
        }
        System.out.println("]");
        
    }
}
