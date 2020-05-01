package br.com.prettyme.model.servico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.prettyme.model.usuario.Usuario;

@Entity
@Table(name ="T_PM_ANAMNESE")
public class Anamnese {

	@Id
	private int idAnamnese;
	
	@OneToOne
	private Usuario usuario;
	
	@Column(name="tem_cirurgia")
	private boolean fezCirurgia;
	
	@Column(name="decricao_cirurgia")
	private String descricaoCirurgias;
	
	@Column(name="pratica_esporte")
	private boolean praticaEsporte;
	
	@Column(name="quais_esportes")
	private String descricaoEsportes;
	
	@Column(name="usa_medicamento")
	private boolean usaMedicamento;
	
	@Column(name="quais_medicamentos")
	private String descricaoMedicamentos;
	
	@Column(name = "sensibilidade_usuario")
	private Sensibilidade sensibilidade;

	@Column(name="is_gestante")
	private boolean isGestante;
	
	@Column(name="tempo_gestacao")
	private boolean tempoGestante;
	
	@Column(name="is_alergico")
	private boolean alergico;
	
	@Column(name="quais_alergias")
	private String descricaoAlergias;
	
	@Column(name="tem_herpes")
	private boolean isHerpes;
	
	@Column(name="is_cardiaco")
	private boolean isCardiaco;
	
	@Column(name="tem_problema_circulatorio")
	private boolean temProblemasCirculatorios;
	
	@Column(name="tem_hipertensao")
	private boolean isHipertenso;
	
	@Column(name="is_diabetico")
	private boolean isDiabetico;
	
	@Column(name="tem_doenca_tireoide")
	private boolean doencaTireoide;
	
	@Column(name="tem_doenca_renal")
	private boolean doencaRenal;
	
	@Column(name="is_depressivo")
	private boolean isDepressivo;
	
	@Column(name="tem_pinos")
	private boolean temPinos;
	
	@Column(name="tem_convulsao")
	private boolean temConvulsao;
	
	@Column(name="tem_estresse")
	private boolean temEstresse;
	
	@Column(name="is_alcoolatra")
	private boolean isAlcoolatra;
	
	@Column(name="is_fumante")
	private boolean isFumante;
	
	@Column(name="is_lactante")
	private boolean isLactante;
	
	@Column(name="is_epiletico")
	private boolean isEpiletico;
	
	@Column(name="fez_cirurgia_ocular")
	private boolean cirugiaOcular;
	
	@Column(name="tem_glaucoma")
	private boolean temGlaucoma;
	
	@Column(name="is_lacrimejante")
	private boolean lacrimeja;
	
	@Column(name="trata_oncologia")
	private boolean trataOncologia;
	
	@Column(name="alopecia_areata")
	private boolean alopeciaAreata;
	
	@Column(name="usa_lente")
	private boolean usaLente;

	@Column(name="usa_acido")
	private boolean usaAcidos;

	@Column(name="tem_marca_expressao")
	private boolean marcaExpressao;
	
	@Column(name="tratamentos_usuario")
	private String descricaoTratamento;
	
}
