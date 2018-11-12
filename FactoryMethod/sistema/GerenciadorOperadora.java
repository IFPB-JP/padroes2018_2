package sistema;

import operadoras.*;

public class GerenciadorOperadora {
	
	
	public GerenciadorOperadora() {}
	
	public Operadora criarClaro() {
		return new Claro();
	}
	
	public Operadora criarTIM() {
		return new TIM();
	}
	
	public Operadora criarOi() {
		return new Oi();
	}
	
	public Operadora criarVivo() {
		return new Vivo();
	}
	
	public Operadora criaOperadoraContato(String o) throws Exception {
		if (o == TipoOperadora.CLARO.toString()) return criarClaro();
		else if (o == TipoOperadora.VIVO.toString()) return criarVivo();
		else if (o == TipoOperadora.TIM.toString()) return criarTIM();
		else if (o == TipoOperadora.OI.toString()) return criarOi();
		throw new Exception("Operadora não encontrada");
	}

}
