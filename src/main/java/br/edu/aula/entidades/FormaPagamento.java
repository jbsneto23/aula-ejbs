/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.aula.entidades;

public enum FormaPagamento {
    
    VISTA(30), ATE_6_VEZES(20), MAIS_6_VEZES(10);
	
    private double desconto;
	
    FormaPagamento(double percentual) {
        this.desconto = percentual / 100;
    }

    public double getDesconto() {
        return desconto;
    }
}
