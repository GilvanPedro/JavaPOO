package br.com;

public class TiposVeiculos {
    public static class Carro extends Veiculo {
        private int numeroPortas;
        private boolean arCondicionado;

        public Carro(String marca, String modelo, int ano,
                     int numeroPortas, boolean arCondicionado) {
            super(marca, modelo, ano);
            this.numeroPortas = numeroPortas;
            this.arCondicionado = arCondicionado;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Portas: " + numeroPortas);
            System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
        }

        public void abrirPortaMalas() {
            System.out.println("Porta-malas aberto!");
        }
    }

    public static class Moto extends Veiculo {
        private int cilindradas;
        private boolean partidaEletrica;

        public Moto(String marca, String modelo, int ano,
                    int cilindradas, boolean partidaEletrica) {
            super(marca, modelo, ano);
            this.cilindradas = cilindradas;
            this.partidaEletrica = partidaEletrica;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Cilindradas: " + cilindradas + "cc");
            System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
        }

        public void empinar() {
            System.out.println("Moto empinando!");
        }
    }
}