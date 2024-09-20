public class Fogao {

    private int numeroBocas;
    private String modelo;
    private String cor;

    Fogao() {
        numeroBocas = 4;
        modelo = "Atlas";
        cor = "Branco";
    }

    Fogao(int numeroBocas, String modelo, String cor) {
        this.numeroBocas = numeroBocas;
        this.modelo = modelo;
        this.cor = cor;
    }

    int getNumeroBocas() {
        return numeroBocas;
    }

    String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        Fogao f1 = new Fogao();
        Fogao f2 = new Fogao(6, "Electrolux", "Inox");

        System.out.println("O fogao f1 tem " + f1.getNumeroBocas() + " bocas");
        System.out.println("O fogao f2 é do modelo " + f2.getModelo());
    }
}
