/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeFluxo;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Switch case
        
        //titulo do programa
        System.out.println("\n\n___________________________________\n\nPrograma para ver qual mes estamos\n___________________________________");
        
        //instanciar a classe Scanner
        Scanner teclado = new Scanner(System.in);
        
        //declarar variavel
        int numeroDoMes;
        String mes = "Indefinido";
        
        //atribuir valor a variavel numeroDoMes
        System.out.print("Digite o numero do mes atual: ");
        numeroDoMes = teclado.nextInt();
        
        //Switch case
        switch (numeroDoMes){   //Escolher o caso dependendo do valor da variavel numeroDoMes
            case 1: mes = "Janeiro";
                    break;
            case 2: mes = "Fevereito";
                    break;
            case 3: mes = "Marco";
                    break;
            case 4: mes = "Abril";
                    break;
            case 5: mes = "Maio";
                    break;
            case 6: mes = "Junho";
                    break;
            case 7: mes = "Julho";
                    break;
            case 8: mes = "Agosto";
                    break;
            case 9: mes = "Setembro";
                    break;
            case 10: mes = "Outubro";
                    break;
            case 11: mes = "Novembro";
                    break;
            case 12: mes = "Dezembro";
                    break;
        }
        
        //Imprimir resultado
        System.out.println("O mes atual e: "+mes);
    }
}
