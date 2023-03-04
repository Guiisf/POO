package org.example;

// classe abstrata Funcionario
public abstract class Funcionario {
    private int codigo;
    private String nome;
    private double salarioBase;

    public Funcionario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = 0.0;
    }

    public abstract double calcularSalario();

    // getters e setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}