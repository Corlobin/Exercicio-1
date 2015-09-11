/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.ex1.modelo;

/**
 *
 * @author 20122BSI0387
 */
public class Horario {
    private String diaDaSemana;
    private int horarioInicio;
    private int horarioFim;

    public Horario() {
    }

    public Horario(String diaDaSemana, int horarioInicio, int horarioFim) {
        this.diaDaSemana = diaDaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    /**
     * @return the diaDaSemana
     */
    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    /**
     * @param diaDaSemana the diaDaSemana to set
     */
    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    /**
     * @return the horarioInicio
     */
    public int getHorarioInicio() {
        return horarioInicio;
    }

    /**
     * @param horarioInicio the horarioInicio to set
     */
    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    /**
     * @return the horarioFim
     */
    public int getHorarioFim() {
        return horarioFim;
    }

    /**
     * @param horarioFim the horarioFim to set
     */
    public void setHorarioFim(int horarioFim) {
        this.horarioFim = horarioFim;
    }
    
}
