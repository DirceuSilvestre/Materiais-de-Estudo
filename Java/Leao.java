import java.util.Scanner;

abstract class Contribuinte {
	// atributos
	private String nome_contribuinte;
	private Double anualIncome; // renda anual

	// metodos (gets, sets, outros)
	public String getNome() {
		return this.nome_contribuinte;
	}

	public Double getAnualIncome() {
		return this.anualIncome;
	}

	public void setNome(String nome) {
		this.nome_contribuinte = nome;
	}

	public void setAnualIncome(Double anual_income) {
		this.anualIncome = anual_income;
	}

	// metodo ainda nao implementado
	// sera implementado na subclasse
	// por conta da regra específica
	// para cada subclasse
	// pessoa física tem um calculo de imposto
	// pessoa juridica tem outro calculo
	public abstract Double taxar();

	// construtores
	public Contribuinte() {

	}

	public Contribuinte(String nome, Double anual_income) {
		super();
		this.nome_contribuinte = nome;
		this.anualIncome = anual_income;
	}
}

class PessoaFisica extends Contribuinte {
	// atributos
	private Double healthExpenditures; // gastos com saude

	// metodos
	public Double gastosMedicos() {
		return this.healthExpenditures;
	}

	public void setGastosMedicos(Double gasteiNoMedico) {
		this.healthExpenditures = gasteiNoMedico;
	}

	// dessa forma que fazemos a implementação
	// especifica de cada subclasse
	// de um metodo declarado na superclasse
	// usando o @override
	@Override
	public Double taxar() {
		return 0.0;
	}

	// construtor

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double anual_income, Double gastosMedicos) {
		super(nome, anual_income);
		this.healthExpenditures = gastosMedicos;
	}
}

class PessoaJuridica extends Contribuinte {
	// atributos
	private int numberOfEmployees;

	// metodos

	// construtor
}

public class Leao {

	// main
	public static void main(String[] args) {
		// leitura de N contribuintes
		Scanner scan = new Scanner();
	}
}