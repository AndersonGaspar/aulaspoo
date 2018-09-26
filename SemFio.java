public class Semfio extends Telefone {

	private float frequencia, distancia;
	private int canais;


	public SemFio(int c, String s, String m, float p, Dimensao d, int ca, float f, float dis){
		
		super(c, s, m, p, d);
		this.frequencia = f;
		this.distancia = dis;
		this.canais = ca;
	}


	public void imprimirDados(){
		
		super.imprimirDados();
		System.out.println("Frequência: " + this.frequencia);
		System.out.println("Distância: " + this.distancia);
		System.out.println("Canais: " + this.canais);	
	}

	

}
