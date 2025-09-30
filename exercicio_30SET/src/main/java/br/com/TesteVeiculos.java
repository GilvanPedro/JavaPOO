package br.com;

import br.com.TiposVeiculos.Carro;
import br.com.TiposVeiculos.Moto;

public class TesteVeiculos {
    public static void main(String[] args) {
        TiposVeiculos veiculos =  new TiposVeiculos();

        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true),
                new Carro("FIAT", "Fiat Uno", 2010, 4, false)
        };

        int i = frota.length;

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);

            if (veiculo instanceof Moto) {
                ((Moto) veiculo).empinar();
            }
       
            System.out.println("---");
        }  
    }
}