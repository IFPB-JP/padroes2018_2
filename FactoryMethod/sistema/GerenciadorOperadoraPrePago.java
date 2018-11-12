package sistema;

import operadoras.*;

public class GerenciadorOperadoraPrePago extends GerenciadorOperadora {
	
	
	public GerenciadorOperadoraPrePago() {
	}
	
	public Operadora criarClaro() {
		return new ClaroPrePago();
	}
	
	public Operadora criarOi() {
		return new OiPrePago();
	}
	
	public Operadora criarVivo() {
		return new VivoPrePago();
	}
	
	public Operadora criarTIM() {
		return new TIMPrePago();
	}

}
