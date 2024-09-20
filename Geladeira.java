public class Geladeira {

    private String marca;
    private String capacidade;
    private String modelo;

    Geladeira() {
        marca = "Consul";
        capacidade = "300 litros";
        modelo = "Frost Free";
    }

    Geladeira(String marca, String capacidade, String modelo) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.modelo = modelo;
    }

    String getMarca() {
        return marca;
    }

    String getCapacidade() {
        return capacidade;
    }

    public static void main(String[] args) {
        Geladeira g1 = new Geladeira();
        Geladeira g2 = new Geladeira("Brastemp", "400 litros", "Duplex");

        System.out.println("A geladeira g1 é da marca " + g1.getMarca());
        System.out.println("A geladeira g2 tem capacidade de " + g2.getCapacidade());
    }
}
