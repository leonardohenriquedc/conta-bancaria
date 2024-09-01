import java.util.ArrayList;
import java.util.Random;

public class ContaBancaria{
	private int idConta;
	
	private Pessoa usuario;
	
	private double saldo;
	
	private ArrayList<Double> extrato = new ArrayList<>();
	
	public ContaBancaria(Pessoa usuario){
		setUsuario(usuario);
		
		Random random = new Random();
		
		int idContaRandom = random.nextInt(999);
		
		setIdConta(idContaRandom);
		
		setSaldo(0);
		
		System.out.println("Uma conta de usuario foi criada");
	}
	
	public void adicionarSaldo(double valor){
		if(valor > 0){
			setSaldo(getSaldo + saldo);
			
			setExtrato(saldo);
			
			System.out.println("Valor removido, saldo atual: " + getSaldo());
			
		}else{
		
			System.out.println("Não foi possivel adicionar valor devido ao valor ser negativo");
		}
	}
	
	public void removerValor(double valor){
		if(valor > getSaldo()){
		
			System.out.println("Não foi possivel retirar valor, pois o valor e maior que o saldo");
			
		}else{
			
			setSaldo(getSaldo() - valor);
			
			setExtrado(-valor);
				
			System.out.println("Valor removido, seu saldo atual e de: " + getSaldo()):
		
		}
	}
	
	//--------------------------------------------------
	public int getIdConta(){
		return this.idConta;
	}
	
	public void setIdConta(int idConta){
		this.idConta = idConta;
	}
	
	public Pessoa getUsuario(){
		return this.usuario;
	}
	
	public void setUsuario(Pessoa usuario){
		this.usuario = usuario;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public ArrayList<double> getExtrato(){
		return this.extrato;
	}
	
	public void setExtrato(double valor){
		this.extrato.add(valor);
	}
}
