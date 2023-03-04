
package br.com.senac.joo.futebol;

/**
 * @author Guilherme Ferreira
 */
public class Jogador {

    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado = true;

    public Jogador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public Jogador(String nome, int xp, int hp, boolean envenenado) {
        this.nome = nome;
        this.xp = xp;
        this.hp = hp;
        this.envenenado = envenenado;
    }

    public boolean isEnvenenado(boolean envenenado) {

        return envenenado;
    }

    public void receberDado(int pontos) {

        this.hp = hp - pontos;
    }

    public void receberCura(int pontos) {

        this.hp = hp + pontos;
    }

    public void ganharExperiencia(int pontos) {

        this.xp = xp + pontos;
    }

    public void receberAntidoto(boolean antidoto) {

        // if (envenenado) {
        //    envenenado = false;
        // } else {
        //     envenenado = true;
        // }
        antidoto = !envenenado;
        this.envenenado = antidoto;
    }

}
