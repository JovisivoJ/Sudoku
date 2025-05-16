package modelo;
import java.util.*;


import static modelo.EnumJogo.NAO_INICIADO;
import static modelo.EnumJogo.INCOMPLETO;
import static modelo.EnumJogo.COMPLETO;


import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;



public class Board {
	
	private final List<List<Espaço>> espaços;
	public Board(final List<List<Espaço>> espaços) {
		this.espaços = espaços;
	}
	
	
	public List<List<Espaço>> getEspaços(){
		return espaços;
	}
	
	
	public EnumJogo getStatus() {
		if(espaços.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixado() && nonNull(s.getAtual()))) {
			return NAO_INICIADO;
		}
		
		return espaços.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getAtual())) ? INCOMPLETO : COMPLETO; }
	
	public boolean temErros() {
		if(getStatus() == NAO_INICIADO) {
			return false;
		}
		
		return espaços.stream().flatMap(Collection::stream).anyMatch(s -> nonNull(s.getAtual()) && !s.getAtual().equals(s.getEsperado()));		
	}
	
	public boolean mudarValor(final int coluna, final int linha, final int valor) {
		var espaço = espaços.get(coluna).get(linha);
		if(espaço.isFixado()) {
			return false;
		}
		
		espaço.setAtual(valor);
		return true;
	}
	
	public boolean limparValor(final int coluna, final int linha) {
		var espaço = espaços.get(coluna).get(linha);
		if(espaço.isFixado()) {
			return false;
		}
		
		espaço.limparEspaço();
		return true;
	}
	
	
	public void resetar() {
		espaços.forEach(s -> s.forEach(Espaço::limparEspaço));
	}
	
	public boolean jogoFinalizado() {
		return !temErros() && getStatus().equals(COMPLETO);
	}
}

