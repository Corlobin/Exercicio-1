/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.ex1.modelo;

import java.util.Calendar;

/**
 *
 * @author 20122BSI0387
 */
public class Paciente extends Pessoa {
   
    private Calendar dataNascimento;
    private String profissao;

    /**
     * @return the nome
     */
   

    /**
     * @return the telefone
     */
    
    /**
     * @return the dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the endereco
     */
    

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
}
