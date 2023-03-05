package br.com.senac.joo.futebol;

/**
 * @author Guilherme Ferreira
 */
public class TesteJogador {

    public static void main(String[] args)   {

        Jogador jogador1 = new Jogador();

        jogador1.setNome("Guilherme");
        System.out.println(jogador1.getNome());

        jogador1.isEnvenenado();
        System.out.println(jogador1.isEnvenenado());

        jogador1.setXp(100);
        jogador1.ganharExperiencia(100);
        System.out.println("Meu jogador tem " + jogador1.getXp() + "de XP");

        jogador1.setHp(1000);
        jogador1.receberDado(500);
        System.out.println(jogador1.getHp());


    }

}
