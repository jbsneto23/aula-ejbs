package br.edu.aula.entidades;

import java.io.Serializable;
import java.util.Set;

public class Cliente implements Serializable {
    
    private String nome;
    private Set<Contrato> contratos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(Set<Contrato> contratos) {
        this.contratos = contratos;
    }
}
