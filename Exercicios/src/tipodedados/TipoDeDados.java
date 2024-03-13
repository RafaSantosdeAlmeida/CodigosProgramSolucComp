/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipodedados;

/**
 *
 * @author Dinopc
 */
public class TipoDeDados {
    public static void main(String[] args) {
        /*
            Tipos de dados do Java
        
            Sao divididos em dois sub tipos,
        
            primitivos, representam apenas
            valores basicos de dados como,
            numeros(inteiros e flutuantes);
            boleano(True ou False);
            caracter(int ou unicode);
        
            nao primitivos, representam
            classe, interface ou array
        */
        
        
        //Primitivos
        
            //Numericos
            
                //Inteiros
                
                    /*
                    byte
                    O tipo byte pode receber numeros inteiros, 
                    porém aloca apenas 8 bits da memoria oque equivale
                    a no maximo 256 valores possiveis, dividindo por 2
                    chegamos ao valor maximo permitido entre -128 e 127
                    */
                    byte num1 = 127;
                    //num1 = 128;   //apague a "//" da esquerda e veja o aviso que aparece 

                    /*
                    short
                    Pode receber numeros inteiros,
                    aloca 16 bits na memoria, equivalente
                    a 65536 valores possiveis, e valor
                    maximo permitido entre -32768‬ e 327687
                    */
                    short num2 = -32768;
                    //num2 = -32769;    //apague a "//" da esquerda e veja o aviso que aparece

                    /*
                    int
                    Recebe valores inteiro ate 32 bits,
                    pode variar entre -2.147.483.648 e 2.147.483.647
                    */
                    int num3 = 2147483647;
                    //int num3 = 2147483648;    //essa declaracao resulta em erro por conta de exeder a memoria alocada para a variavel

                    /*
                    long
                    inteiro de 64 bits, entre
                    -9.223.372.036.854.770.000 e 9.223.372.036.854.770.000
                    */
                    long num4 = 9223372036854770000L;
                    
                    
                //Flutuantes
                
                    /*
                    float
                    O float pode receber numeros flutuantes,
                    ex, 0.32, 5.12, 187.54 ...
                    aloca 32bits na memoria
                    */
                    float num5 = 19.03F;
                    
                    /*
                    double
                    recebe flutuantes ate 64bits
                    */
                    double num6 = 19.03;    //Observe que estou atribuindo o mesmo valor(19.03) para a variavel num5(float) e num6(double), porem double ocupa mais memoria isso e vazamento de memoria
                
                
            //Caractere
                /*
                char
                pode receber int ou unicode
                ate 16 bits
                */
                char carac1 = 193;
                char carac2 = 'r';
        
                
                
        //Nao Primitivos
            
            //String
                /*
                Recebe qualquer frase, palavra ou caracter desejado e por ser
                nao primitiva possui metodos embutidos nela como lengyh() etc
                */
                String nome = "rafael";
                System.out.println(nome.length());  //length e um metodo da classe String, esse metodo retorna o tamanho da variavel String
    }
}
