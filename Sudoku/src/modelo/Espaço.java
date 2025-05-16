package modelo;

public class Espaço {

	private Integer atual;
	private final int esperado;
	private final boolean fixado;

	public Espaço(final int esperado, final boolean fixado) {
		this.esperado = esperado;
		this.fixado = fixado;
		if(fixado) {
			atual = esperado;
		}
	}

	public Integer getAtual() {
		return atual;
	}

	public void setAtual(Integer atual) {
		if(fixado) return;
		this.atual = atual;
	}
	
	public void limparEspaço() {
		setAtual(null);
	}
	
	public int getEsperado() {
		return esperado;
	}

	public boolean isFixado() {
		return fixado;
	}
}
