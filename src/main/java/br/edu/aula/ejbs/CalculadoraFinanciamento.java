/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.aula.ejbs;

import javax.ejb.Stateless;

@Stateless
public class CalculadoraFinanciamento {

    public double simulaFinanciamento(double valorEmprestimo, int meses) {
        double taxaJuros = 0.01; // 1% ao mês
        double totalJuros = meses * taxaJuros; // juros simples
        double valorDivida = valorEmprestimo * (1 + totalJuros);
        return valorDivida / meses;
    }
    
    public double simulaFinanciamentoTaxa(double valorEmprestimo, int meses, double taxa) {
        double taxaJuros = taxa / 100;
        double totalJuros = meses * taxaJuros;
        double valorDivida = valorEmprestimo * (1 + totalJuros);
        return valorDivida / meses;
    }

}

