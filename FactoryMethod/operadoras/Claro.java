package operadoras;

import sistema.TipoOperadora;

public class Claro implements Operadora {

	
	public Claro() {
	}
	
	public String label() {
		return TipoOperadora.CLARO.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Claro");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Claro");
		
	}

}
