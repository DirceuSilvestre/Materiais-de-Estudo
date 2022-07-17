enum TipoMonetario {
    REAL(1.0), DOLAR(1.82), EURO(2.39);

    private double valor;

    TipoMonetario(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class Moeda {
    TipoMonetario trocado;
    private double valor;

    public void setValor(Double valor) {
        this.valor = valor * trocado.getValor();
    }

    public void setValor1(Double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}

class ConversorMonetario {
    public static Moeda converter(Moeda plata, TipoMonetario tipo) {

        plata.setValor1((plata.getValor() / plata.trocado.getValor()));
        plata.setValor1(plata.getValor() * tipo.getValor());
        plata.trocado = tipo;

        return plata;
    }
}

public class Monetario {

    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        moeda.trocado = TipoMonetario.EURO;
        moeda.setValor(3.00);
        System.out.println(moeda.getValor());
        moeda = ConversorMonetario.converter(moeda, TipoMonetario.DOLAR);
        System.out.println(moeda.getValor());
    }
}
