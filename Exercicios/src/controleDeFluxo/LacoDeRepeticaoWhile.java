/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeFluxo;

/**
 *
 * @author Dinopc
 */
public class LacoDeRepeticaoWhile {
    public static void main(String[] args) {
        /*
        O while executa um bloco de codigo
        repetidas vezes até que a condição
        dentro dele seja falsa
        */
        
        //Declarar variaveis
        int x;
        char y;
        
        //Atribuir valores as variaveis
        y=97;
        x=1;
        
        //1° Laço de repetição
        while (x<=10){
            y=97;
            while (y<100){  //2° Laço de repetição
                System.out.println(x+" | "+y);
                y++;
            }
            System.out.println("------");
            x++;
        }
    }
}
