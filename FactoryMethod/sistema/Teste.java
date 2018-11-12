package sistema;

import operadoras.*;

public class Teste {

	public static void main(String[] args) {
		
		Telefone t1 = new Telefone("83 99620000", new TIM());
		Telefone t2 = new Telefone("83 91110000", new Claro());
		Telefone t3 = new Telefone("83 99654534", new Oi());
		Telefone t4 = new Telefone("83 98888999", new Oi());
		Telefone t5 = new Telefone("83 99875423", new Vivo());
		Telefone t6 = new Telefone("83 99110010", new Claro());
		Telefone t7 = new Telefone("83 99555010", new ClaroPrePago());
		
		t1.adicionaContato(t2);
		t1.adicionaContato(t3);
		t1.adicionaContato(t4);
		t1.adicionaContato(t5);
		t1.adicionaContato(t6);
		t1.adicionaContato(t7);
		
		GerenciadorOperadora g1 = new GerenciadorOperadoraPrePago();
		
		try {
			t1.ligarPraTodoMundo(g1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	

	}

}
