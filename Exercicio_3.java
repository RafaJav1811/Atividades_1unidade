/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.util.Scanner;


public class Exercicio_3 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int Hi,Mi,Si,Hf,Mf,Sf,soma,sub,somaH, somaM,somaS, subH, subM, subS;
        
        System.out.println("Digite uma hora inicial");
        Hi = entrada.nextInt();
        
        while(Hi>24)
        {
        System.out.println("Digite uma hora inicial válida");
        Hi = entrada.nextInt();
        }
        
        System.out.println("Digite um minuto inicial");
        Mi = entrada.nextInt();
        
        while(Mi>60)
        {
        System.out.println("Digite um minuto inicial válido");
        Mi = entrada.nextInt();
        }
        
        System.out.println("Digite um segundo inicial");
        Si = entrada.nextInt();
        
        while(Si>60)
        {
        System.out.println("Digite um segundo inicial válido");
        Si = entrada.nextInt();
        }
        
        System.out.println("Digite uma hora final");
        Hf = entrada.nextInt();
        
         while(Hf>24)
        {
        System.out.println("Digite uma hora final válida");
        Hf = entrada.nextInt();
        }
        
        System.out.println("Digite um minuto final");
        Mf = entrada.nextInt();
        
        while(Mf>60)
        {
        System.out.println("Digite um minuto final válido");
        Mf = entrada.nextInt();
        }
        
        System.out.println("Digite um segundo final");
        Sf = entrada.nextInt();
        
        while(Sf>60)
        {
        System.out.println("Digite um segundo final válido");
        Sf = entrada.nextInt();
        }
        
        System.out.println("Horário inicial - "+Hi+" h "+Mi+" m "+Si+" s");
        System.out.println("Horário final - "+Hf+" h "+Mf+" m "+Sf+" s");
        
        soma = ((Hi + Hf)*3600) + ((Mi + Mf)*60) + Si+Sf;
        somaH = soma/3600;
        somaM = (soma%3600) / 60;
        somaS = Si+Sf;
        
        
        sub = ((Hf - Hi)*3600) + ((Mf - Mi)*60) + Sf-Si;
        subH = sub/3600;
        subM = (sub%3600) / 60;
        subS = Si-Sf;
       
        
        System.out.println("A soma das horas foi de "+somaH+" h "+somaM+" m "+somaS+" s");
        System.out.println("A subtração das horas foi de "+subH+" h "+subM+" m "+subS+" s");
    }
}
