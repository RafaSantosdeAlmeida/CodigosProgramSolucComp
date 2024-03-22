/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosParametrosEModificadores;

/**
 *
 * @author Dinopc
 */
public class MetodosParametrosEModificadores {
    /*
        METODOS PARAMETROS E MODIFICADORES
        
        Quando se fala de programação OO
        não se pode deixar de falar de
        metodos, nada mais é doque um
        conjunto de instruções, que podem
        ser executados em diferentes locais
        do projeto apenas chamando o comando
        desse metodo.
    */
    
    public static void main(String[] args){
        calcularRaizes2Grau(1.0f,-1.0f,-12.0f);     //Por ser um metodo void não retorna nehum valor, apenas executa uma ações
    }
    
    /*
        Todo metodo possui um modificador, retorno e nome_do_metodo
        private(modificador), void(retorno), e calcularRaizes2Grau(nome_do_metodo)
        static é um caso a parte e define que o metodo não precisa ser instanciado
        caso queira saber mais sobre os modificadores e retornos recomendo o site: https://www.devmedia.com.br/metodos/7348
    */
    private static void calcularRaizes2Grau(float a,float b,float c){
        /*
            Esse metodo calcula o Basckhara(raizes) de uma equação de segundo grau
        */
        
        //Titulo do metodo
        System.out.println("\n_______________________________\n\nMetodo para calcular equacao de 2 grau\n_______________________________\n");
        
        //Declarar variaveis
        float delta;
        float raiz1;
        float raiz2;
        
        //Calcular delta
        delta = (float)Math.pow(b,2) - 4 * a * c;
        System.out.println("Valor de delta: "+delta);
        
        //Condicional raizes reais ou não reais
        if(a==0){
            System.out.println("Isso nao e uma equacao de segundo grau");
        }
        else if (delta<0){
            System.out.println("Essa equacao nao possui raizes reais");
        }
        else if (delta==0) {
            System.out.println("Essa equacao possui raizes reais e iguais");
            raiz1 = (-b + (float)Math.sqrt(delta)) / (2 * a);                   //Formula de bhaskhara
            System.out.println("O valor das raizes e: "+raiz1);
        }
        else{
            System.out.println("Essa equacao possui raizes reais e diferente");
            raiz1 = (-b + (float)Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - (float)Math.sqrt(delta)) / (2 * a);
            System.out.println("O valor da raiz1 e: "+raiz1+"\nO valor da raiz2 e: "+raiz2);
        }
        
        
    }
    
}
