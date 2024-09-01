public class Pessoa {
	private String nome;
	
	private int idade;
	
	private int cpf;
	
	public Pessoa(String nome, int idade, int cpf){
		setNome(nome);
		
		setIdade(idade);
		
		setCpf(cpf);
		
		System.out.println("Uma pessoa foi cadastrada");
	}
	
	//------------------------
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getCpf(){
		return this.cpf;
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
}
