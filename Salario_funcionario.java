package com.mycompany.salario_funcionario;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Salario_funcionario 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        try 
        {
            // Solicitar os dados do funcionário
            System.out.print("Digite o nome do funcionário: ");
            String nome = teclado.nextLine();

            System.out.print("Digite a data de admissão (dd/mm/aaaa): ");
            String dataAdmissao = teclado.nextLine();

            System.out.print("Digite o valor da hora trabalhada: ");
            float valorHora = teclado.nextFloat();

            System.out.print("Digite o número de horas trabalhadas: ");
            float horasTrabalhadas = teclado.nextFloat();

            // Criar o objeto Funcionario
            Funcionario funcionario = new Funcionario(nome, dataAdmissao, valorHora, horasTrabalhadas);

            // Exibir os resultados
            int tempoEmpresa = funcionario.calcularTempoEmpresa();
            float salario = funcionario.calcularSalario();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("\n--- Informações do Funcionário ---");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Data de Admissão: " + formato.format(funcionario.getDataAdmissao()));
            System.out.println("Tempo de Empresa: " + tempoEmpresa + " anos");
            System.out.printf("Salário: R$ %.2f\n", salario);

        } catch (Exception e) 
        {
            System.out.println("Erro: " + e.getMessage());
        } finally 
        {
            teclado.close();
        }
    }
}
