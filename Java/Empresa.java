import java.util.ArrayList;

class Venda {
	// atributos
	private int mes;
	private double valor;

	// construtor
	public Venda(int mes, double valor) {
		this.mes = mes;
		this.valor = valor;
	}

	// metodos
	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

class Vendedor {
	// atributos
	private String nome;
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	private double comissao;

	// construtor
	public Vendedor(String nome) {
		this.nome = nome;
	}

	// metodos
	public double calcularComissao() {
		int tamanho = vendas.size();
		double vendaTotal = 0;
		for (int i = 0; i < tamanho; i++) {
			vendaTotal += vendas.get(i).getValor();
		}
		if (vendaTotal > 2000) {
			comissao = (vendaTotal / 10);
		} else {
			comissao = (vendaTotal / 100) * 5;
		}
		return comissao;
	}

	public void adicionarVenda(Venda vendaFeita) {
		vendas.add(vendaFeita);
	}

}

class Comercio {
	// atributos
	private String razaoSocial;
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	// construtor
	public Comercio(String nome) {
		this.razaoSocial = nome;
	}

	public void adicionaVendedor(Vendedor funcionario) {
		vendedores.add(funcionario);
	}

	public void adicionaVendas(Venda vendaFeita, int posicao) {
		vendedores.get(posicao).adicionarVenda(vendaFeita);
	}

	public void calculoComissao() {
		int tamanho = vendedores.size();
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vendedores.get(i).calcularComissao());
		}
	}
}

public class Empresa {
	public static void main(String[] args) {
		Comercio comerEBeber = new Comercio("Comer&Beber");
		Vendedor joseane = new Vendedor("Joseane");
		// Vendedor dirceu = new Vendedor("Dirceu");
		comerEBeber.adicionaVendedor(joseane);
		// comerEBeber.adicionaVendedor(dirceu);
		Venda cafe = new Venda(3, 2.00);
		Venda kitkat = new Venda(3, 3.50);
		comerEBeber.adicionaVendas(cafe, 0);
		comerEBeber.adicionaVendas(kitkat, 0);
		Venda compraGrande = new Venda(4, 10.00);
		Venda kitkato = new Venda(4, 7.00);
		// comerEBeber.adicionaVendas(compraGrande, 1);
		// comerEBeber.adicionaVendas(kitkato, 1);
		comerEBeber.calculoComissao();

	}
}