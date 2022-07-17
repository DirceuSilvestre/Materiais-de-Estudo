class Aluno {
    // atributos
    private int[] notas = new int[3];

    // metodos
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        for (int i = 0; i < this.notas.length; i++) {
            this.notas[i] = notas[i];
        }
    }

    public int getMedia() {
        int media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media += notas[i];
        }
        media /= this.notas.length;
        return media;
    }
}

public class Media {

    public static void main(String[] args) {
        Aluno fulano = new Aluno();
        int[] notas = { 5, 5, 10 };
        fulano.setNotas(notas);
        System.out.println(fulano.getMedia());
    }
}
