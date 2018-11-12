package operadoras;

import sistema.TipoOperadora;

public class ClaroPrePago extends Claro {
	
	public ClaroPrePago() {
	}
	
	public String label() {
		return TipoOperadora.CLARO.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Claro, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Claro, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

}
