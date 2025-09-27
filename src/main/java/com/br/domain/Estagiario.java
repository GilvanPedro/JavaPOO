package com.br.domain;

public class Estagiario  extends Funcionario{
    private int horasTrabalhadas;
    private Double valorHoraTrabalhada;

    public Estagiario(String nome, String matricula, double valorHoraTrabalhada) {
        super(nome, matricula, valorHoraTrabalhada);
        this.horasTrabalhadas = 0;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public void registrarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada;
    }
}
