public class Telefone {

	private int codigo;
	private String numSerie, modelo;
	private float peso;
	private Dimensao dim;


	public Telefone(int c, String s, String m, float p, Dimensao d){
		
		this.codigo = c;
		this.numSerie = s;
		this.modelo = m;
		this.peso = p;
		this.dimensao = d;
	}


	public void imprimirDados(){
		
		System.out.println("Código: " + this.codigo);
		System.out.println("Número de Série: " + this.numSerie);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Peso: " + this.peso);
		//System.out.println("Dimenão: " + this.dimensao);
		
	}
	

}


