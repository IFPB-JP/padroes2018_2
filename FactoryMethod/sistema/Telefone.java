package sistema;

import java.util.*;
import operadoras.*;

public class Telefone {
	
	private String numero;
	private Operadora operadora;
	private List<Telefone> contatos;
	
	public Telefone(String numero, Operadora operadora) {
		this.numero = numero;
		this.operadora = operadora;
		contatos = new ArrayList<Telefone>();
	}
	
	public void adicionaContato(Telefone t) {
		contatos.add(t);
	}
	
	public Operadora getOperadora() {
		return this.operadora;
	}
	
	public void ligarPraTodoMundo(GerenciadorOperadora go) throws Exception {
		
		for (Telefone t:contatos) {
			go.criaOperadoraContato(t.getOperadora().label()).ligar();
		}
		
	}
		
}
