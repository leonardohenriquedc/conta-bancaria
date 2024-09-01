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
