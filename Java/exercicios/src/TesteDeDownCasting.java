import java.lang.Math.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// todas as figuras são filhas de Forma, e não irão existir instâncias de Forma
abstract class Forma {
    // atributos
    protected double excentricidade;
    protected double perimetro;
    protected double area;

    // metodos

    // Toda Forma sabe calcular sua área, seu perímetro e ter um método para
    // imprirmir esses valores.

    // sets

    public void setLargura(int largura) {
    }

    public void setRaio(double raio) {
    }

    public void setEixoMaior(double eixoMaior) {
    }

    public void setEixoMenor(double eixoMenor) {
    }

    public void setComprimento(int comprimento) {
    }

    // gets

    public double getExcentricidade() {
        return this.excentricidade;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public void CalculaArea() {
    }

    public void CalculaPerimetro() {
    }

    public void ImprimeArea() {
    }

    public void ImprimePerimetro() {
    }

}

interface Excentricidade {

    // metodos

    public void CalcularExcentricidade();
}

class Elipse extends Forma implements Excentricidade {

    // atributos

    // Uma Elipse possui duas características, um eixo maior chamado ae um eixo
    // menor chamado b,
    private double maior_a;
    private double menor_b;
    private double perimetro;
    private double area;
    private double excentricidade;

    // metodos

    // sets
    @Override
    public void setEixoMaior(double eixoMaior) {
        this.maior_a = eixoMaior;
    }

    @Override
    public void setEixoMenor(double eixoMenor) {
        this.menor_b = eixoMenor;
    }

    // gets

    @Override
    public double getPerimetro() {
        return this.perimetro;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getExcentricidade() {
        return this.excentricidade;
    }

    // Perímetro: P = π sqrt 2(a2+ b2)-(a-b)2/2(Note, que se a= b = r, então P =
    // 2πr)
    @Override
    public void CalculaPerimetro() {
        this.perimetro = Math.PI * Math.sqrt(
                2 * ((maior_a * maior_a) + (menor_b * menor_b)) - (((maior_a - menor_b) * (maior_a - menor_b)) / 2));
    }

    // Área: A = πAB
    @Override
    public void CalculaArea() {
        this.area = Math.PI * maior_a * menor_b;
    }

    // Excentricidade: E= sqrt 1-b2/a2
    @Override
    public void CalcularExcentricidade() {
        this.excentricidade = Math.sqrt(1 - ((menor_b * menor_b) / (maior_a * maior_a)));
    }

    @Override
    public void ImprimeArea() {
        System.out.println(this.area);
    }

    @Override
    public void ImprimePerimetro() {
        System.out.println(this.perimetro);
    }

}

class Retangulo extends Forma {

    // atributos

    // Um Retângulo tem duas características, as quais são a largura e comprimento
    private int largura;
    private int comprimento;
    private int area;
    private int perimetro;

    // metodos

    // sets

    @Override
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    // gets

    @Override
    public double getPerimetro() {
        return this.perimetro;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    // Desta forma, sua área se dá pela multiplicação dos dois e,seu perímetro,pela
    // soma destes multiplicado por 2.
    @Override
    public void CalculaArea() {
        this.area = largura * comprimento;
    }

    @Override
    public void CalculaPerimetro() {
        this.perimetro = (largura + comprimento) * 2;
    }

    @Override
    public void ImprimeArea() {
        System.out.println(this.area);
    }

    @Override
    public void ImprimePerimetro() {
        System.out.println(this.perimetro);
    }
}

class Circulo extends Elipse {
    // atributos
    private double raio;
    private double area;
    private double perimetro;

    // metrodos

    // sets

    @Override
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // gets

    @Override
    public double getPerimetro() {
        return this.perimetro;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void CalculaArea() {
        this.area = Math.PI * (raio * raio);
    }

    @Override
    public void CalculaPerimetro() {
        this.perimetro = 2 * Math.PI * raio;
    }

    @Override
    public void ImprimeArea() {
        System.out.println(this.area);
    }

    @Override
    public void ImprimePerimetro() {
        System.out.println(this.perimetro);
    }

}

class Quadrado extends Retangulo {
    // atributos

    // Um Quadrado é um caso particular de Retângulo onde a largura e comprimento
    // são
    // iguais.
    private int largura;
    private int area;
    private int perimetro;

    // metodos

    // sets
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
    }

    // gets

    @Override
    public double getPerimetro() {
        return this.perimetro;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void CalculaArea() {
        this.area = largura * largura;
    }

    @Override
    public void CalculaPerimetro() {
        this.perimetro = largura * 4;
    }

    @Override
    public void ImprimeArea() {
        System.out.println(this.area);
    }

    @Override
    public void ImprimePerimetro() {
        System.out.println(this.perimetro);
    }

}

class TestaFormas {
    // metodos

    public static List<Forma> criaFormas(int quantidade) {
        List<Forma> lista = new ArrayList<>();
        Random rand = new Random();
        double aleatorio_double = rand.nextDouble(3.0);
        for (int i = 0; i < quantidade; i++) {
            int aleatorio_inteiro = rand.nextInt(3);
            switch (aleatorio_inteiro) {

                case 0:

                    Circulo circ = new Circulo();
                    circ.setRaio(aleatorio_double);
                    lista.add(circ);
                    break;

                case 1:

                    Elipse eli = new Elipse();
                    double aleatorio_double2 = rand.nextDouble(3.0);
                    if (aleatorio_double > aleatorio_double2) {
                        eli.setEixoMaior(aleatorio_double);
                        eli.setEixoMenor(aleatorio_double2);
                    } else {
                        eli.setEixoMaior(aleatorio_double2);
                        eli.setEixoMenor(aleatorio_double);
                    }
                    lista.add(eli);
                    break;

                case 2:

                    Quadrado quad = new Quadrado();
                    quad.setLargura(aleatorio_inteiro);
                    lista.add(quad);
                    break;

                case 3:

                    Retangulo ret = new Retangulo();
                    int aleatorio_inteiro2 = rand.nextInt();
                    ret.setComprimento(aleatorio_inteiro);
                    ret.setLargura(aleatorio_inteiro2);
                    lista.add(ret);
                    break;
            }
        }
        return lista;
    }
}

public class TesteDeDownCasting {
    public static void main(String[] args) {
        List<Forma> Lita = new ArrayList<>();
        Lita = TestaFormas.criaFormas(5);
        for (int i = 0; i < Lita.size(); i++) {
            Lita.get(i).ImprimeArea();
            Lita.get(i).ImprimePerimetro();
        }
    }
}