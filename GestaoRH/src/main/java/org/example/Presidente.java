package org.example;

public class Presidente extends Funcionario {

    private double acoes;

    public Presidente(int codigo, String nome, double acoes) {
        super(codigo, nome);
        this.acoes = acoes;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + acoes;
    }

    @Override
    public String getInformacoes() {
        return "\nCogido: " + getCodigo() + "\nNome: " + getNome() + "\nSalario mais as acoes da empresa R$ " + calcularSalario();

    }

    public double getAcoes() {
        return acoes;
    }

    public void setAcoes(double acoes) {
        this.acoes = acoes;
    }
}
