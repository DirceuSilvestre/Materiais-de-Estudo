import java.util.List;
import java.util.ArrayList;

/*
 * class Aluno
 * {
 *      //atributos
 *      private final String NOME = Dirceu Silvestre dos Santos Neto;
 *      private final int MATRICULA = 20190017408;
 * }
 */

enum Sexo {
    MASCULINO(1), FEMININO(2);

    private int valor;

    Sexo(int sex) {
        this.valor = sex;
    }

    public int getValor() {
        return this.valor;
    }
}

enum EstadoJogo {
    ATIVO(1), PAUSADO(2), GAMEOVER(3);

    private int valor;

    EstadoJogo(int estado) {
        this.valor = estado;
    }

    public int getValor() {
        return this.valor;
    }
}

abstract class Item {
    // Os itens desse jogo possuem os seguintes atributos: nome, força, inteligência
    // e
    // vida.

    // atributos
    private final String NOME;
    private final int FORCA;
    private final int INTELIGENCIA;
    private final int VIDA;

    // metodos
    // gets

    public String getNome() {
        return this.NOME;
    }

    public int getForca() {
        return this.FORCA;
    }

    public int getInteligencia() {
        return this.INTELIGENCIA;
    }

    public int getVida() {
        return this.VIDA;
    }

    // não tem set porque se tratam de valores que não podem ser modificados

    // Esses valores são definidos no momento da criação do item e não podem
    // ser modificados. A classe item não gera instâncias apenas suas
    // especializações.

    // construtor

    Item(String nome, int forca, int inteligencia, int vida) {
        this.NOME = nome;
        this.FORCA = forca;
        this.INTELIGENCIA = inteligencia;
        this.VIDA = vida;
    }

}

abstract class Personagem {

    // Um personagem não gera instâncias(apenas suas especializaçõeso farão).

    // Ele possui um nome (o qual não pode ser modificado), uma pontuação, uma
    // quantidade de força, de inteligência e de vida, além de possuir um sexo (o
    // qual pode apenas assumir os valores MASCULINO ou FEMININO). Finalmente, o
    // personagem possui uma lista de itens que ele carrega.

    // atributos
    private final String NOME;
    private int pontuacao;
    private int forca;
    private int inteligencia;
    private int vida;
    private Sexo sex;
    private List<Item> itens = new ArrayList<Item>();

    // metodos
    // gets

    public String getNome() {
        return this.NOME;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public int getForca() {
        return this.forca;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public int getVida() {
        return this.vida;
    }

    public Sexo getSexo() {
        return this.sex;
    }

    public Item getItem(int index) {
        return itens.get(index);
    }

    // sets

    public void setPontuacao(int pontos) {
        this.pontuacao = pontos;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setItem(Item item) {
        this.itens.add(item);
    }

    // Um personagem possui diversos atributos, os quais são definidos no momento de
    // sua criação.

    // Se o personagem for do sexo masculino, sua força incial será 10 e sua
    // inteligência será 5. Caso seja do sexo feminino, sua força inicial é 5 e sua
    // inteligência será 10.Todo personagem começacom 100 de vida.

    // construtor
    Personagem(String nome, int pontuacao, Sexo sechu, Item item) {
        this.NOME = nome;
        this.pontuacao = pontuacao;
        if (sechu == Sexo.MASCULINO) {
            this.forca = 10;
            this.inteligencia = 5;
        } else {
            this.forca = 5;
            this.inteligencia = 10;
        }
        this.vida = 100;
        this.sex = sechu;
        this.itens.add(item);
    }

}

class Guerreiro extends Personagem {
    // Um guerreiro é um personagem que possui o atributo estamina(que é um valor
    // inteiro)que será utilizado em suas habilidades.

    // atributos
    private int estamina;

    // Neste jogo, o guerreiro possui a habilidade Ataque Poderoso, que só pode
    // ser utilizado se o guerreiro possuir estamina e retorna um valor de dano
    // causado (int)que pode ser calculado da seguinte forma: estamina * força.

    // metodos

    public int AtaquePoderoso() {
        int ataquePoderoso = 0;
        if (estamina < 0) {
            int forca = this.getForca();
            ataquePoderoso += (estamina * forca);
        }
        return ataquePoderoso;
    }

    // gets
    public int getEstamina() {
        return this.estamina;
    }

    // sets
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    // construtor
    Guerreiro(String nome, int pontuacao, Sexo sexo, Item item) {
        super(nome, pontuacao, sexo, item);
    }

}

class Mago extends Personagem {
    // Um mago é um personagem que possui o atributo mana(que é um valor inteiro)que
    // será utilizado em suas habilidades.

    // atributos
    private int mana;

    // Neste jogo, o magopossui a habilidade Lançar Magia, que só pode ser utilizado
    // se o magopossuir manae retorna um valor de dano causado (int)que pode ser
    // calculado da seguinte forma: mana* inteligência.

    // metodos
    // poderia ter feito usando override, mas nao lembrei quando construi a classe
    // personagem e agora falta pouco tempo pra enviar a prova
    public int LancarMagia() {
        int lancarMagia = 0;
        if (mana > 0) {
            int inteligencia = this.getInteligencia();
            lancarMagia += (mana * inteligencia);
        }
        return lancarMagia;
    }

    // get

    public int getMana() {
        return this.mana;
    }

    // set

    public void setMana(int mana) {
        this.mana = mana;
    }

    // construtor
    Mago(String nome, int pontuacao, Sexo sexo, Item item) {
        super(nome, pontuacao, sexo, item);
    }

}

class Fase {
    // Uma fase possui um nome do tipo String que não pode ser modificado depois de
    // definido
    // Uma dificuldade (que pode variar de 1 até 5)
    // e o número de personagens, o qual é compartilhado por todas as fases.

    // atributos
    private final String NOME;
    private int dificuldade;

    private static int numeroPersonagens; // (acessa Classe.atributo);

    // A dificuldade da fase é definida em um método de acordo com o número de
    // personagens, por exemplo, se existirem três personagensa dificuldade da fase
    // será: 1+3(número de personagens)= 4

    // metodos
    public void definirDificuldade() {
        this.dificuldade = 1 + Fase.numeroPersonagens;

        if (this.dificuldade > 5) {
            this.dificuldade = 5;
        }
    }

    // sets
    public String getNome() {
        return this.NOME;
    }

    public int getDificuldade() {
        return this.dificuldade;
    }

    public int getNumeroPersonagens() {
        return Fase.numeroPersonagens;
    }

    // sets

    public void setNumeroPersonagens(int numero) {
        Fase.numeroPersonagens = numero;
    }

    Fase(String nome) {
        this.NOME = nome;
    }
}

public class Jogo {

    // Um jogo possui três atributos, uma lista de fases, uma lista de personagense
    // um estado.

    // atributos
    private List<Fase> fases = new ArrayList<Fase>();
    private List<Personagem> personagens = new ArrayList<Personagem>();
    private EstadoJogo estado;

    // metodos
    // gets

    public Fase getFase(int index) {
        return this.fases.get(index);
    }

    public Personagem getPersonagem(int index) {
        return this.personagens.get(index);
    }

    public EstadoJogo getEstadoJogo() {
        return this.estado;
    }

    // sets
    public void setFase(Fase fase) {
        this.fases.add(fase);
    }

    public void setPersonagem(Personagem persona) {
        this.personagens.add(persona);
    }

    public void setEstadoJogo(EstadoJogo estado) {
        this.estado = estado;
    }

    // main
    public static void main(String[] args) {
        System.out.println("Funcionando sem erros!!! \nPara - béns!!! \\o/");
    }
}