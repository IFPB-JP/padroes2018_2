package operadoras;

import sistema.TipoOperadora;

public class OiPrePago extends Oi {
	
	public OiPrePago() {
	}
	
	public String label() {
		return TipoOperadora.OI.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Oi, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Oi, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

}
