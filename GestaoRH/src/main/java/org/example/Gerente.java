package org.example;

public class Gerente extends Funcionario {

    private String area;
    private double bonus;

    public Gerente(int codigo, String nome, String area, double bonus) {
        super(codigo, nome);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String getInformacoes() {
        return "\nCogido: " + getCodigo() + "\nNome: " + getNome() + "\nArea: " + getArea() + "\nSalario mais o bonus sobre a venda R$ " + calcularSalario();

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
