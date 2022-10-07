
class Caneta {
    private final String modelo;
    public String cor;
    private static int numeroPersonagens;
    // private boolean tampa;
    // private int carga;
    // private double ponta;

    /*
     * public void setModelo(String m) {
     * this.modelo = m;
     * }
     */

    public String getModelo() {
        return this.modelo;
    }

    public int getNumero() {
        return Caneta.numeroPersonagens;
    }

    Caneta(String modelo, int numero) {
        this.modelo = modelo;
        Caneta.numeroPersonagens = numero;
    }

}

public class Bic {
    public static void main(String[] args) throws Exception {
        Caneta c1;
        c1 = new Caneta("Bic Cristal", 3);
        // c1.setModelo("Bic Cristal");
        System.out.println(c1.getModelo());
        System.out.println(c1.getNumero());
    }
}