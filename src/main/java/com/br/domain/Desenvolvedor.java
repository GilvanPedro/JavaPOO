package com.br.domain;

public class Desenvolvedor extends Funcionario{

    private int horasExtras;
    private double valorHoraExtra;
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public Desenvolvedor(String nome, String matricula, double salarioBase, double valorHoraExtra, int horasExtras) {
        super(nome, matricula, salarioBase);
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = horasExtras;
    }

    public void registrarHorasExtras(int horasExtras){
        this.horasExtras += horas;
    }

    @Override
    public double calcularSalario() {
        return (horasExtras * valorHoraExtra) + salarioBase;
    }
}
