/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

import java.util.Scanner;
        
public class Exercicio_1 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        float prova1,prova2,prova3,media,recuperacao,Final;
        
        System.out.println("Digite suas três notas da disciplina: ");
        
        prova1 = entrada.nextFloat();
        prova2 = entrada.nextFloat();
        prova3 = entrada.nextFloat();
         
        while(prova1>10 | prova1<0 | prova2>10 | prova2<0 | prova3>10 | prova3<0)
        {
            System.out.println("Valores inválidos, digite novamente as notas a seguir: ");
            
            prova1 = entrada.nextFloat();
            prova2 = entrada.nextFloat();
            prova3 = entrada.nextFloat();
        }
    
        media = (prova1+prova2+prova3)/3;
        
        System.out.println("A média das notas obtidas acima foi de "+media);
        
        if(media>=7)
        {
            System.out.println("O aluno foi aprovado.");
        }
        else
        {
            System.out.println("O aluno foi reprovado, é necessário realizar uma recuperação.");
            System.out.println("Qual foi a nota obtida pela recuperação?");
            
            recuperacao = entrada.nextFloat();
            
            Final = (media+recuperacao)/2;
                    
            if(Final>=5)
            {
                System.out.println("O aluno obteve na média final "+Final+", passou de ano.");
            }
            else
            {
                System.out.println("O aluno obteve na média final "+Final+", repetiu de ano.");
            }
        }
    
    }
}
