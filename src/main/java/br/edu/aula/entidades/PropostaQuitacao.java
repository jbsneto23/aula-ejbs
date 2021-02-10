package br.edu.aula.entidades;

import java.io.Serializable;
import java.util.Date;

public class PropostaQuitacao implements Serializable {

    private Date dataProposta;
    private Integer quantidadeContratos;
    private Double saldoOriginal;
    private Double valorProposto;
    private FormaPagamento formaPagamento;

    public PropostaQuitacao(Integer quantidadeContratos, Double saldoOriginal, Double valorProposto, FormaPagamento formaPagamento) {
        this.dataProposta = new Date();
        this.quantidadeContratos = quantidadeContratos;
        this.saldoOriginal = saldoOriginal;
        this.valorProposto = valorProposto;
        this.formaPagamento = formaPagamento;
    }

    public Date getDataProposta() {
        return dataProposta;
    }

    public void setDataProposta(Date dataProposta) {
        this.dataProposta = dataProposta;
    }

    public Integer getQuantidadeContratos() {
        return quantidadeContratos;
    }

    public void setQuantidadeContratos(Integer quantidadeContratos) {
        this.quantidadeContratos = quantidadeContratos;
    }

    public Double getSaldoOriginal() {
        return saldoOriginal;
    }

    public void setSaldoOriginal(Double saldoOriginal) {
        this.saldoOriginal = saldoOriginal;
    }

    public Double getValorProposto() {
        return valorProposto;
    }

    public void setValorProposto(Double valorProposto) {
        this.valorProposto = valorProposto;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "PropostaQuitacao [dataProposta=" + dataProposta
                + ", quantidadeContratos=" + quantidadeContratos
                + ", saldoOriginal=" + saldoOriginal + ", valorProposto="
                + valorProposto + ", formaPagamento=" + formaPagamento + "]";
    }
}
