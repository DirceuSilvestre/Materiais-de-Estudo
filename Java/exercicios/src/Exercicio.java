abstract class Poligono {
    // atributo

    // metodo
    public void areaDoObjeto() {
    }

}

class Circulo extends Poligono {
    // atributo
    private double raio;
    private double area;

    // metodo
    @Override
    public void areaDoObjeto() {
        this.area = 3.14 * (this.raio * this.raio);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return this.area;
    }
}

class Retangulo extends Poligono {
    // atributo
    private int altura;
    private int largura;
    private int area;

    // metodos
    @Override
    public void areaDoObjeto() {
        this.area = this.altura * this.largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getArea() {
        return this.area;
    }

}

class Triangulo extends Poligono {
    // atributo
    private int base;
    private int altura;
    private int area;

    // metodo
    @Override
    public void areaDoObjeto() {
        this.area = this.base * this.altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return this.area;
    }

}

public class Exercicio {
    public static void main(String[] args) {
        Circulo redondo = new Circulo();
        redondo.setRaio(3);
        redondo.areaDoObjeto();
        System.out.println(redondo.getArea());
        Retangulo bola_quadrada = new Retangulo();
        bola_quadrada.setAltura(2);
        bola_quadrada.setLargura(3);
        bola_quadrada.areaDoObjeto();
        System.out.println(bola_quadrada.getArea());
        Triangulo piramide = new Triangulo();
        piramide.setBase(2);
        piramide.setAltura(2);
        piramide.areaDoObjeto();
        System.out.println(piramide.getArea());
    }
}