package org.example;

public class Presidente extends Funcionario {

    private final double ACOES;

    public Presidente(int codigo, String nome, double ACOES) {
        super(codigo, nome);
        this.ACOES = ACOES;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + ACOES;
    }

    @Override
    public String getInformacoes() {
        return "\nCogido: " + getCodigo() + "\nNome: " + getNome() + "\nSalario mais as acoes da empresa R$ " + calcularSalario();

    }

    public double getACOES() {
        return ACOES;
    }


}
