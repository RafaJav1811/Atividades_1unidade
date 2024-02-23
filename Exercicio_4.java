/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4;

import java.util.Scanner;

        
public class Exercicio_4 
{
    public static void main(String[] args) 
    {
        int x;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro maior ou igual a zero");
        
        x = entrada.nextInt();
       
        if(x<0)
        {
            while(x<0)
            {
                System.out.println("O número digitado não segue os critérios acima, digite novamente");
                x = entrada.nextInt();
            }
        }
        
        String s = Integer.toString(x);
        
        
        System.out.println("A quantidade de digitos do número "+x+" é "+s.length());
    }
}
