package com.br.domain;

import com.br.domain.Funcionario;

import javax.sound.midi.Soundbank;

public class SistemaRh {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor("Ana", "DEV001", 5000, 50.00, 145);
        dev.registrarHorasExtras(10);
        funcionario[0] = dev;

        Gerente gerente = new Gerente("Carlos", "GER001", 8000);
        gerente.setBonusPerformance(1000);
        gerente.setComissao(500);
        funcionario[1] = gerente;

        Estagiario estagiario = new Estagiario("Pedro", "EST001", 15);
        estagiario.registrarHoras(35);
        funcionario[2] = estagiario;

        System.out.println("===== Folha de Pagamento =====");
        double totalFolha = 0;

        for(Funcionario func : funcionario){
            func.exibirDados();
            totalFolha += func.calcularSalario();
            System.out.println("-----------------------------");
        }

        System.out.println("Total da Folha: R$" + totalFolha);

        System.out.println("\n===== Demonstração de Polimorfismo =====");
        for(Funcionario func : funcionario){
            System.out.println(func.calcularSalario());
        }
    }
}
