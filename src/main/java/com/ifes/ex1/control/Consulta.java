/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.ex1.control;

import com.ifes.ex1.modelo.Medico;
import com.ifes.ex1.modelo.Medico;
import com.ifes.ex1.modelo.Paciente;
import com.ifes.ex1.modelo.Paciente;
import com.ifes.ex1.modelo.Plano;
import com.ifes.ex1.modelo.Plano;
import java.util.Calendar;

/**
 *
 * @author 20122BSI0387
 */
public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private Calendar data;
    private Calendar hora;
    private Plano plano;
    
    private int tempo;
    private String observacaoQueixas;
    private String observacaoPrescricao;
    private String observacaoResultados;

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Calendar getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    /**
     * @return the plano
     */
    public Plano getPlano() {
        return plano;
    }

    /**
     * @param plano the plano to set
     */
    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the observacaoQueixas
     */
    public String getObservacaoQueixas() {
        return observacaoQueixas;
    }

    /**
     * @param observacaoQueixas the observacaoQueixas to set
     */
    public void setObservacaoQueixas(String observacaoQueixas) {
        this.observacaoQueixas = observacaoQueixas;
    }

    /**
     * @return the observacaoPrescricao
     */
    public String getObservacaoPrescricao() {
        return observacaoPrescricao;
    }

    /**
     * @param observacaoPrescricao the observacaoPrescricao to set
     */
    public void setObservacaoPrescricao(String observacaoPrescricao) {
        this.observacaoPrescricao = observacaoPrescricao;
    }

    /**
     * @return the observacaoResultados
     */
    public String getObservacaoResultados() {
        return observacaoResultados;
    }

    /**
     * @param observacaoResultados the observacaoResultados to set
     */
    public void setObservacaoResultados(String observacaoResultados) {
        this.observacaoResultados = observacaoResultados;
    }
    
    
}
