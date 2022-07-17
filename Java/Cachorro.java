public class Cachorro 
{
	//atributos
	private String nome;

	//construtor

	//metodos
	public void late()
	{
		System.out.println("Au, auau");
		System.out.println(this.nome+" esta a latir");
	}

	public void /*setNome*/ nomear(String nomeDele)
	{
		this.nome = nomeDele;
	}

	public String getNome()
	{
		return this.nome;
	}

	//main
	public static void main(String[] args) {
		Cachorro asterix = new Cachorro();
		asterix.nomear("asterix");
		asterix.late();
		Cachorro caramelo = new Cachorro();
		caramelo.nomear("caramelo");
		caramelo.late();
	}
}