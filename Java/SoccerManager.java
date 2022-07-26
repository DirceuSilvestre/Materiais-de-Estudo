import java.util.Calendar;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

enum PosicaoAtuacao
{
	ATACANTE(0.1), ZAGUEIRO(0.1), GOLEIRO(0.1), LATERAL(0.1), VOLANTE(0.1);

	private Double aumento;

	PosicaoAtuacao(Double aumento)
	{
		this.aumento = aumento;
	}

	public Double getAumento()
	{
		return this.aumento;
	}
}

//Classes  -  Gerente(SoccerManager), time, jogador, técnico, preparador físico, funcionario, estadio, jogo

abstract class Funcionario
{
	//atributos
	private String nome;
	private int idade;
	private int cpf;
	private double salario;
	private Calendar contratacao = Calendar.getInstance();

	//metodos
	public String getNome()
	{
		return this.nome;
	}

	public int getIdade()
	{
		return this.idade;
	}

	public int getCPF()
	{
		return this.cpf;
	}

	public Double getSalario()
	{
		return this.salario;
	}

	public Calendar getContratacao()
	{
		return this.contratacao.getTime();
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public void setCPF(int cpf)
	{
		this.cpf = cpf;
	}

	public void setSalario(Double salario)
	{
		this.salario = salario;
	}

	public void setContratacao(Calendar contratacao)
	{
		this.contratacao = contratacao;
	}

	public abstract Double bonus();

	//construtores
	public Funcionario(){}

	public Funcionario(String nome, Double salario)
	{
		super();
		this.nome = nome;
		this.salario = salario;
	}

}

class Jogador extends Funcionario
{
	//atributos
	private PosicaoAtuacao posicao;
	private int golsFeitos;
	private int passes;
	private int roubadasDeBola;
	private Double precoPasse;

	//metodos



	@Override
	public Double bonus()
	{
		if (posicao == PosicaoAtuacao.ATACANTE) {
			this.precoPasse += this.precoPasse * (0.1 * (Double)golsFeitos);
		}
		else if (posicao == PosicaoAtuacao.ZAGUEIRO) {
			if ((this.roubadasDeBola % 10) == 0) {
				
			}
		}
		return 
	}
}



class PreparadorFisico extends Funcionario
{

}



class Estadio
{
	//atributos
	private String localizacao;
	private int capacidade_maxima;
	private Double taxa_entrada;

	//metodos
}



class Time
{
	//atributos
	private Estadio maracana;
	private List<Jogador> contratados = new ArrayList<Jogador>();
	private SoccerManager tecnico;
	private PreparadorFisico massagista;
	private List<Jogo> jogados = new ArrayList<Jogo>();
	private String estiloJogo;
	private Double caixa;

}



class Jogo
{	
	//atributos
	private Time[] versus = new Time[2];
	private Estadio local;
	private String placar;
}


public class SoccerManager extends Funcionario //tecnico
{
	//atributos


	//metodos (get, set) (contratar, demitir, definir estilo, escalar o principal, escalar o reserva)


	//construtores


	//main
	public static void main(String[] args) {
		/*Funcionario fulano = new Funcionario();
		System.out.println(fulano.contratacao.getTime());*/
		Scanner scan = new Scanner(System.in);
		int cpf = scan.nextInt
	}
}