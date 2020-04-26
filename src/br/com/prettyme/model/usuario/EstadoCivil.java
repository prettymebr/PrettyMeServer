package br.com.prettyme.model.usuario;

public enum EstadoCivil {
	
	SOLTEIRO("Solteiro(a)"),CASADO("Casado(a)"),DIVORCIADO("Divorciado(a)"),VIUVO("Viúvo(a)");
	
	private final String label;
	
	private EstadoCivil(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}
