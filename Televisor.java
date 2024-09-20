public class Televisor {
	
	private int canal;
	private String tamanho;
	private String modelo;
	
	// Construtor padrão
	Televisor() {
		this.canal = 4;
	    this.tamanho = "15 polegadas";
	    this.modelo = "Brastenp";
	}
	
	Televisor(int canal, String tamanho, String modelo) {
		this.canal = canal;
		this.tamanho = tamanho;
		this.modelo = modelo;
	}
	
	String getModelo() {
		return this.modelo;
	}
	
	String getTamanho()  {
		return this.tamanho;
	}
	
	public static void main(String[] args) {
		Televisor tv1 = new Televisor();
		Televisor tv2 = new Televisor(10, "10 polegadas", "Gradiente");
		Televisor tv3 = new Televisor(10, "18 polegadas", "Tramontina");
		 
		System.out.println("O modelo do objeto tv1 é: " + tv1.getModelo());
		System.out.println("O modelo do objeto tv2 é: " + tv2.getModelo());
		System.out.println("O tamanho do objeto tv3 é: " + tv3.getTamanho());
	}
}
