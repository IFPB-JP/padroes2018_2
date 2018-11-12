package operadoras;

import sistema.TipoOperadora;

public class Oi implements Operadora {
	

	
	public Oi() {
	}
	
	public String label() {
		return TipoOperadora.OI.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Oi");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Oi");
		
	}

}