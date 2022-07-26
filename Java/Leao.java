import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
		Double taxa = (this.getAnualIncome() < 20000.00) ? this.getAnualIncome() * 0.15 : this.getAnualIncome() * 0.25;
		taxa -= (this.healthExpenditures / 2.00);
		return taxa;
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
	public int getEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(int funcionarios) {
		this.numberOfEmployees = funcionarios;
	}

	public Double taxar() {
		Double taxa = (this.numberOfEmployees() < 10) ? this.getAnualIncome() * 0.16 : this.getAnualIncome() * 0.14;
		return taxa;
	}

	// construtor

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, Double anualIncome, int numeroFuncionarios) {
		super(nome, anualIncome);
		this.numberOfEmployees = numeroFuncionarios;
	}
}

public class Leao {

	// main
	public static void main(String[] args) {
		// macete pra formatação ou leitura de dados
		Locale.setDefault(Locale.US);

		// leitura de N contribuintes
		// System.in faz a leitura do terminal
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of taxpayers: ");
		int number = scan.nextInt();

		// 'upcoming' e 'é um'
		// Contribuinte fulano = new PessoaFisica();
		// so podemos fazer isso porque
		// PessoaFisica é um Contribuinte
		// entao quando usamos o generico para declarar
		// ele aceita todos os outros tipos especificos
		List<Contribuinte> lista = new ArrayList<Contribuinte>();

		for (int i = 0; i < number; i++) {
			System.out.println("Contribuinte #" + i + " data:");
			System.out.println("Fisica ou Juridica (f/j)? ");

			// ele escaneia a proxima linha
			// e nela pega a letra do indice 0 na palavra escrita
			char letra = scan.next().charAt(0);
			System.out.println("Nome: ");
			String nome = scan.next();
			System.out.println("Renda anual: ");
			Double anualIncome = scan.nextDouble();
			if (letra == 'f') {
				System.out.println("Gastos com saúde: ");
				Double healthExpenditures = scan.nextDouble();
				PessoaFisica ciclano = new PessoaFisica(nome, anualIncome, healthExpenditures);
				lista.add(ciclano);
			} else {
				System.out.println("Numero de funcionaros: ");
				Integer numeroFuncionarios = scan.nextInt();
				PessoaJuridica empresa = new PessoaJuridica(nome, anualIncome, numeroFuncionarios);
				lista.add(empresa);
			}

		}

		System.out.println();

		System.out.println("Taxes paid: ");
		Double soma = 0.00;
		for (Contribuinte contribuinte : lista) {
			System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.taxar()));
			soma += contribuinte.taxar();
		}

		System.out.println("Total de impostos a pagar: $ " + String.format("%.2f", soma));

		scan.close();
	}
}