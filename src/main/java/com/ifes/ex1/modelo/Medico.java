/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.ex1.modelo;

import java.util.ArrayList;

/**
 *
 * @author 20122BSI0387
 */
public class Medico extends Pessoa {

    private int CRM;
    private ArrayList<Horario> horarios;
    private ArrayList<Especialidade> especialidade;
    private ArrayList<Plano> planos;

    /**
     * @return the CRM
     */
    public int getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the endereco
     */
   

    /**
     * @return the horarios
     */
    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    /**
     * @param horarios the horarios to set
     */
    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    /**
     * @return the especialidade
     */
    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the planos
     */
    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    /**
     * @param planos the planos to set
     */
    public void setPlanos(ArrayList<Plano> planos) {
        this.planos = planos;
    }

}
