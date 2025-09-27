package com.br.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Final: R$" + calcularSalario());
    }

}
