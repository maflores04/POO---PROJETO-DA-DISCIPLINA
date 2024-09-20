public class TelevisorComDVD extends Televisor {
    
    private boolean dvdIncorporado;

    TelevisorComDVD() {
        super(); // Chama o construtor da classe Televisor
        dvdIncorporado = true; // Valor padrão
    }

    TelevisorComDVD(int c, String t, String m, boolean dvdIncorporado) {
        super(c, t, m); // Chama o construtor de Televisor com parâmetros
        this.dvdIncorporado = dvdIncorporado;
    }

    boolean hasDvdIncorporado() {
        return dvdIncorporado;
    }

    public static void main(String[] args) {
        TelevisorComDVD tv1 = new TelevisorComDVD();
        TelevisorComDVD tv2 = new TelevisorComDVD(10, "18 polegadas", "LG", false);

        System.out.println("O Televisor tv1 é do modelo " + tv1.getModelo() + " e tem DVD incorporado? " + tv1.hasDvdIncorporado());
        System.out.println("O Televisor tv2 é do modelo " + tv2.getModelo() + " com tamanho de " + tv2.getTamanho() + " e tem DVD incorporado? " + tv2.hasDvdIncorporado());
    }
}
