/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeFluxo;

import java.util.Scanner;

/**
 *
 * @author Dinopc
 */

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        /*
        Ternario

        O ternario é uma maneira resumida de
        ultilizar o if else, é mais comunmente
        usado para atribuir valores as variaveis
        */
        
        //Titulo do programa
        System.out.println("\n___________________________\n\nVerificar situacao de votacao\n___________________________");
        
        //Instanciar classe
        Scanner teclado = new Scanner(System.in);
        
        //Declarar variaveis
        int idade;
        String situacaoVoto;
        
        //Atribuir valores as variaveis
        System.out.print("\nDigite sua idade: ");
        idade = teclado.nextInt();
        
        //Atribuir situacao do voto
        situacaoVoto = ((idade<18 & idade>=16) || idade>=70)? "Voto nao obrigatorio" : "Obrigatorio";
        situacaoVoto = (idade<16 & idade>0)? "Nao pode votar" : situacaoVoto ;
        situacaoVoto = (idade<0 || idade>120)? "Invalido" : situacaoVoto ;
        
        //Imprime situacao
        System.out.println(situacaoVoto);
        
    }
}
