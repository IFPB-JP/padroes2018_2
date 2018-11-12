package operadoras;

import sistema.TipoOperadora;

public class Vivo implements Operadora {
	
	public Vivo() {
	}
	
	public String label() {
		return TipoOperadora.VIVO.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Vivo");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Vivo");
		
	}

}
