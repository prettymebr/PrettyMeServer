package br.com.prettyme.model.servico;

public enum Sensibilidade {

	MUITA("Muita"),SUPORTAVEL("Suport�vel"),POUCA("Pouca"),NENHUMA("Nenhuma");
	
	private final String label;
	
	private Sensibilidade(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	 
	
}
