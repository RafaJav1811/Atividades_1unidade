package com.mycompany.salario_funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataAdmissao;
    private float valorHora;
    private float horasTrabalhadas;

    // Construtor
    public Funcionario(String nome, String dataAdmissao, float valorHora, float horasTrabalhadas) throws ParseException {
        this.nome = nome;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataAdmissao = formato.parse(dataAdmissao);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método para calcular o tempo de empresa
    public int calcularTempoEmpresa() {
        Date hoje = new Date();
        long diferencaMilissegundos = hoje.getTime() - dataAdmissao.getTime();
        int anos = (int) (diferencaMilissegundos / (1000L * 60 * 60 * 24 * 365));
        return anos;
    }

    // Método para calcular o salário
    public float calcularSalario() {
        float salarioBase = valorHora * horasTrabalhadas;
        int tempoEmpresa = calcularTempoEmpresa();
        
        if (tempoEmpresa >= 10) {
            salarioBase += salarioBase * 0.10; // Acrescenta 10%
        } else if (tempoEmpresa >= 5) {
            salarioBase += salarioBase * 0.05; // Acrescenta 5%
        }
        return salarioBase;
    }

    // Getters para exibição
    public String getNome() {
        return nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }
}