public class Pessoa{

	private String nome;
	private String sobrenome;
	private LocalDate dataNasc;
	public Telefone telefone;
	public Email email;


	public Pessoa(String n, String s, LocalDate dN){
		this.nome = n;
		this.sobrenome = s;
		this.dataNasc = dN;
	}
	
	public Pessoa(String n, String s){
		this.nome = n;
		this.sobrenome = s;
	}

	public boolean addTelefone(String r, String n){
		
	}

	public boolean addEmail(String r, String e){

	}

	public boolean removeTelefone(String r){

	}

	public boolean removeEmail(String r){

	}

	public boolean updateTelefone(Strin r, String n){

	}

	public boolean updateEmail(String r, String e){

	}

	public void toString(String){
		
	}
}
