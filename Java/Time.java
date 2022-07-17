import java.util.ArrayList;

enum PosicaoTatica {
    // numerados
    Goleiro(1), Zagueiro(2), Lateral(3), Meia(4), Atacante(5);

    // atributos
    private int posicao;

    // construtor
    PosicaoTatica(int posicao) {
        this.posicao = posicao;
    }

    // metodos
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}

class Jogador {
    // atributos
    private String nome;
    private PosicaoTatica localDeJogo;

    // construtor
    Jogador(String nome, PosicaoTatica posicao) {
        this.nome = nome;
        this.localDeJogo = posicao;
    }

    // metodos
    public PosicaoTatica getPosicaoTatica() {
        return this.localDeJogo;
    }

    public void setPosicaoTatica(PosicaoTatica posicao) {
        this.localDeJogo = posicao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

public class Time {
    // atributos
    private String nome;
    private ArrayList<Jogador> boludos = new ArrayList<>();
    private PosicaoTatica[] posicoesDosJogadores = new PosicaoTatica[5];
    private int[] quantidadePosicoesTaticas = new int[5];

    // construtor
    Time(String nome) {
        this.nome = nome;
    }

    // metodos
    public String getNomeTime() {
        return this.nome;
    }

    public void setNome(String nomeTime) {
        this.nome = nomeTime;
    }

    public ArrayList<Jogador> getJogadores() {
        return boludos;
    }

    public void setJogador(Jogador contratado, PosicaoTatica posicao) {
        if (this.quantidadePosicoesTaticas[posicao.getPosicao() - 1] > 0) {
            this.boludos.add(contratado);
            this.quantidadePosicoesTaticas[posicao.getPosicao() - 1]--;
        } else {
            System.out.println(
                    contratado.getNome() + " não foi contratado porque excedeu o limite de jogadores na posição "
                            + contratado.getPosicaoTatica());
        }

    }

    public int[] getQuantidadeNaPosicaoTatica() {
        return this.quantidadePosicoesTaticas;
    }

    public void setQuantidadeNaPosicao(int quantidade, PosicaoTatica posicao) {
        this.posicoesDosJogadores[posicao.getPosicao() - 1] = posicao;
        this.quantidadePosicoesTaticas[posicao.getPosicao() - 1] = quantidade;
    }

    // main
    public static void main(String[] args) {
        Time botafogo = new Time("Botafogo");
        Time fluminense = new Time("Fluminense");
        botafogo.setQuantidadeNaPosicao(2, PosicaoTatica.Goleiro);
        botafogo.setQuantidadeNaPosicao(2, PosicaoTatica.Lateral);
        botafogo.setQuantidadeNaPosicao(4, PosicaoTatica.Zagueiro);
        botafogo.setQuantidadeNaPosicao(4, PosicaoTatica.Meia);
        botafogo.setQuantidadeNaPosicao(2, PosicaoTatica.Atacante);
        fluminense.setQuantidadeNaPosicao(1, PosicaoTatica.Goleiro);
        fluminense.setQuantidadeNaPosicao(4, PosicaoTatica.Lateral);
        fluminense.setQuantidadeNaPosicao(2, PosicaoTatica.Zagueiro);
        fluminense.setQuantidadeNaPosicao(3, PosicaoTatica.Meia);
        fluminense.setQuantidadeNaPosicao(4, PosicaoTatica.Atacante);
        Jogador fred = new Jogador("Fred", PosicaoTatica.Goleiro);
        Jogador cassio = new Jogador("Cassio", PosicaoTatica.Goleiro);
        fluminense.setJogador(cassio, PosicaoTatica.Goleiro);
        fluminense.setJogador(fred, PosicaoTatica.Goleiro);

    }

}
