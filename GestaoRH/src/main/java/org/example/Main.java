package org.example;

public class Main {
    public static void main(String[] args) {

        Engenheiro engenheiro = new Engenheiro(12345, "Guilherme", "Projetos", "374473785");
        Gerente gerente = new Gerente(54321, "Stuart", "Vendas", 500);
        Presidente presidente = new Presidente(56789, "Pedro Sobral", 5000);

        engenheiro.setSalarioBase(5000);
        gerente.setSalarioBase(8000);
        presidente.setSalarioBase(17000);

        System.out.println(engenheiro.getInformacoes());
        System.out.println("-------------------------------------");
        System.out.println(gerente.getInformacoes());
        System.out.println("-------------------------------------");
        System.out.println(presidente.getInformacoes());
    }
}