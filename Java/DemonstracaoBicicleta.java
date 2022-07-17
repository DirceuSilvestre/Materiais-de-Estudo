class Bicicleta
{
	//atributos
	private int velocidade = 0;
	private int marcha = 0;
	private int velocidadeMaxima;

	public Bicicleta(int velMax)
	{
		this.velocidadeMaxima = velMax;
	}

	//metodos
	public void mudarMarcha(int novaMarcha)
	{
		this.marcha = novaMarcha;
	}

	public void acelerar(int incremento)
	{
		if ((this.velocidade + incremento)<= this.velocidadeMaxima) {
			this.velocidade = this.velocidade + incremento;
		}
		else
		{
			System.out.println("Não pode ultrapassar o limite de velocidade que é de "+this.velocidadeMaxima);
		}
		
	}

	public void freiar(int decremento)
	{
		this.velocidade = this.velocidade - decremento;
	}

	public void estadoAtual()
	{
		System.out.println(this.velocidade);
		System.out.println(this.marcha);
		System.out.println(this.velocidadeMaxima);
	}
}

public class DemonstracaoBicicleta
{
	public static void main(String[] args) {
		Bicicleta bike1 = new Bicicleta(25);
		Bicicleta bike2 = new  Bicicleta(10);

		bike1.mudarMarcha(5);
		bike1.acelerar(10);
		bike1.estadoAtual();
		bike2.mudarMarcha(2);
		bike2.acelerar(4);
		bike2.estadoAtual();

	}
}