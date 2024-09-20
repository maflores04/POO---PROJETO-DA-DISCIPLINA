public class Automovel {

    private String marca;
    private String modelo;
    private int ano;

    Automovel() {
        marca = "Fiat";
        modelo = "Uno";
        ano = 2020;
    }

    Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    String getMarca() {
        return marca;
    }

    int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel("Chevrolet", "Onix", 2021);

        System.out.println("O automóvel a1 é produzido pela marca " + a1.getMarca());
        System.out.println("O automóvel a2 é modelo do ano " + a2.getAno());
    }
}