package operadoras;

import sistema.TipoOperadora;

public class TIM implements Operadora {
	

	
	public TIM() {
	}
	
	public String label() {
		return TipoOperadora.TIM.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela TIM");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela TIM");
		
	}

}