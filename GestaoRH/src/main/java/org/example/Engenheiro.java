package org.example;

public class Engenheiro extends Funcionario {

    private String departamento;
    private String crea;

    public Engenheiro(int codigo, String nome, String departamento, String crea) {
        super(codigo, nome);
        this.departamento = departamento;
        this.crea = crea;

    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.5;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String getInformacoes() {
        return "\nCogido: " + getCodigo() + "\nNome: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nCrea: " + getCrea() + "\nSalario R$ " + calcularSalario();
    }
}
