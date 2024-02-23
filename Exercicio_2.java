/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;


import java.util.Scanner;

public class Exercicio_2 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int livros;
        float a,b;
        
        System.out.println("Na compra dos livros, você poderá escolher como vai ser o desconto:");
        System.out.println("A - R$ 0,25 por livro + R$ 7,50 fixo.");
        System.out.println("B - R$ 0,50 por livro + R$ 2,50 fixo.");
        
        System.out.println("Digite a quantidade de livros que quer comprar");      
        
        livros = entrada.nextInt();
        
        while(livros<0)
        {
            System.out.println("Valor inválido, insira o número correto: ");
            livros = entrada.nextInt();
        }
        
        a = (0.25f*livros)+7.5f;
        b = (0.5f*livros)+2.5f;
        
        
        if(a>b)
        {
            System.out.println("A quantidade inserida de "+livros+" livros faz com que a opção B fique mais barato com o valor de R$ "+b);
        }
        else if (b>a)
        {
             System.out.println("A quantidade inserida de "+livros+" livros faz com que a opção A fique mais barato com o valor de R$ "+a);
        }
        else
        {
             System.out.println("A quantidade inserida de "+livros+" livros faz com que a opção A e B fiquem o mesmo valor de R$ "+b);
        }
    
    }
}
