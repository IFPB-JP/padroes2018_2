package operadoras;

import sistema.TipoOperadora;

public class VivoPrePago extends Vivo {
	
	public VivoPrePago() {
	}
	
	public String label() {
		return TipoOperadora.VIVO.toString();
	}
	
	public void ligar() {
		System.out.println("Ligou pela Vivo, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

	public void enviarSMS() {
		System.out.println("Enviou mensagem pela Vivo, pagará uma taxa extra, pois se trata de um claro pré pago");
	}

}
