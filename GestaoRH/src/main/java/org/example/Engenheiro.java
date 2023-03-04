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
        return salarioBase * 0.5;
        ;
    }


}
