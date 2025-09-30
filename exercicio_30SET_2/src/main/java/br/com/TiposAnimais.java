package br.com;

public class TiposAnimais {
    public static class Cachorro extends Animal {
        private String raca;

        public Cachorro(String nome, int idade, String raca) {
            super(nome, idade);
            this.raca = raca;
        }

        @Override
        public void emitirSom() {
            System.out.println(nome + " diz: Au Au!");
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Raça: " + raca);
        }

        public void abanarRabo() {
            System.out.println(nome + " está abanando o rabo!");
        }
    }

    public static class Gato extends Animal {
        private boolean temPeloLongo;

        public Gato(String nome, int idade, boolean temPeloLongo) {
            super(nome, idade);
            this.temPeloLongo = temPeloLongo;
        }

        @Override
        public void emitirSom() {
            System.out.println(nome + " diz: Miau!");
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Pelo longo: " + (temPeloLongo ? "Sim" : "Não"));
        }
    }

    public static class Passaro extends Animal {
        private double envergaduraAsas;

        public Passaro(String nome, int idade, double envergaduraAsas) {
            super(nome, idade);
            this.envergaduraAsas = envergaduraAsas;
        }

        @Override
        public void emitirSom() {
            System.out.println(nome + " diz: Piu Piu!");
        }

        @Override
        public void mover() {
            System.out.println(nome + " está voando!");
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Envergadura: " + envergaduraAsas + "cm");
        }
    }
}
