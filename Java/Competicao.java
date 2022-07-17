import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Carro implements Comparable<Carro> {
	// atributos
	private int velocidade;
	private int colocacao;
	private int trajeto;

	// metodos
	public void aumentarVelocidade(int incremento) {
		this.velocidade = this.velocidade + incremento;
	}

	public void diminuirVelocidade(int decremento) {
		this.velocidade = this.velocidade - decremento;
	}

	public void percorrer(int tempo) {
		trajeto = this.velocidade * tempo;
	}

	public int percorrido() {
		return trajeto;
	}

	public void setColocacao(int numero) {
		this.colocacao = numero;
	}

	public int getColocacao() {
		return colocacao;
	}

	public int compareTo(Carro carro) {
		if (this.trajeto < carro.percorrido()) {
			return 1;
		}
		if (this.trajeto > carro.percorrido()) {
			return -1;
		}
		return 0;
	}

}

public class Competicao {
	// atributos
	private ArrayList<Carro> competidores = new ArrayList<>();

	// metodos
	public void incluirCompetidor() {
		Carro veiculo = new Carro();
		competidores.add(veiculo);
	}

	public void iniciarCorrida(int tempo) {
		int tamanho = competidores.size();
		for (int i = 0; i < tamanho; i++) {
			competidores.get(i).percorrer(tempo);
		}
	}

	public void acelerar() {
		int tamanho = competidores.size();
		Random aleatorio = new Random();
		for (int i = 0; i < tamanho; i++) {
			competidores.get(i).aumentarVelocidade(aleatorio.nextInt(21));
		}
	}

	public void podio() {
		Collections.sort(competidores);
		for (int i = 0; i < competidores.size(); i++) {
			competidores.get(i).setColocacao(i + 1);
			System.out.println(competidores.get(i).getColocacao());
		}

	}

	// main
	public static void main(String[] args) {
		Competicao formula1 = new Competicao();
		for (int i = 0; i < 5; i++) {
			formula1.incluirCompetidor();
		}
		formula1.acelerar();
		formula1.iniciarCorrida(30);
		formula1.podio();

	}

}