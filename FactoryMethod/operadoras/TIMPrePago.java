package operadoras;

import sistema.TipoOperadora;

public class TIMPrePago extends TIM {
	
	public TIMPrePago() {
	}
	
	public String label() {
		return TipoOperadora.TIM.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Tim, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Tim, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

}
