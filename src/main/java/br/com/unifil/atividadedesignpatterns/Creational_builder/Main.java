package br.com.unifil.atividadedesignpatterns.Creational_builder;

public class Main {
    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .setProcessador("Intel Core i5")
                .setMemoriaRam("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .setProcessador("Intel Core i9")
                .setMemoriaRam("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        basico.exibirEspecificacoes("Computador Básico");
        gamer.exibirEspecificacoes("Computador Gamer");
    }
}