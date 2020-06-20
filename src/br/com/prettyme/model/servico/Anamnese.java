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
	
	

	public Anamnese() {
		super();
	}

	public Anamnese(int idAnamnese, Usuario usuario, boolean fezCirurgia, String descricaoCirurgias,
			boolean praticaEsporte, String descricaoEsportes, boolean usaMedicamento, String descricaoMedicamentos,
			Sensibilidade sensibilidade, boolean isGestante, boolean tempoGestante, boolean alergico,
			String descricaoAlergias, boolean isHerpes, boolean isCardiaco, boolean temProblemasCirculatorios,
			boolean isHipertenso, boolean isDiabetico, boolean doencaTireoide, boolean doencaRenal,
			boolean isDepressivo, boolean temPinos, boolean temConvulsao, boolean temEstresse, boolean isAlcoolatra,
			boolean isFumante, boolean isLactante, boolean isEpiletico, boolean cirugiaOcular, boolean temGlaucoma,
			boolean lacrimeja, boolean trataOncologia, boolean alopeciaAreata, boolean usaLente, boolean usaAcidos,
			boolean marcaExpressao, String descricaoTratamento) {
		super();
		this.idAnamnese = idAnamnese;
		this.usuario = usuario;
		this.fezCirurgia = fezCirurgia;
		this.descricaoCirurgias = descricaoCirurgias;
		this.praticaEsporte = praticaEsporte;
		this.descricaoEsportes = descricaoEsportes;
		this.usaMedicamento = usaMedicamento;
		this.descricaoMedicamentos = descricaoMedicamentos;
		this.sensibilidade = sensibilidade;
		this.isGestante = isGestante;
		this.tempoGestante = tempoGestante;
		this.alergico = alergico;
		this.descricaoAlergias = descricaoAlergias;
		this.isHerpes = isHerpes;
		this.isCardiaco = isCardiaco;
		this.temProblemasCirculatorios = temProblemasCirculatorios;
		this.isHipertenso = isHipertenso;
		this.isDiabetico = isDiabetico;
		this.doencaTireoide = doencaTireoide;
		this.doencaRenal = doencaRenal;
		this.isDepressivo = isDepressivo;
		this.temPinos = temPinos;
		this.temConvulsao = temConvulsao;
		this.temEstresse = temEstresse;
		this.isAlcoolatra = isAlcoolatra;
		this.isFumante = isFumante;
		this.isLactante = isLactante;
		this.isEpiletico = isEpiletico;
		this.cirugiaOcular = cirugiaOcular;
		this.temGlaucoma = temGlaucoma;
		this.lacrimeja = lacrimeja;
		this.trataOncologia = trataOncologia;
		this.alopeciaAreata = alopeciaAreata;
		this.usaLente = usaLente;
		this.usaAcidos = usaAcidos;
		this.marcaExpressao = marcaExpressao;
		this.descricaoTratamento = descricaoTratamento;
	}

	public int getIdAnamnese() {
		return idAnamnese;
	}

	public void setIdAnamnese(int idAnamnese) {
		this.idAnamnese = idAnamnese;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isFezCirurgia() {
		return fezCirurgia;
	}

	public void setFezCirurgia(boolean fezCirurgia) {
		this.fezCirurgia = fezCirurgia;
	}

	public String getDescricaoCirurgias() {
		return descricaoCirurgias;
	}

	public void setDescricaoCirurgias(String descricaoCirurgias) {
		this.descricaoCirurgias = descricaoCirurgias;
	}

	public boolean isPraticaEsporte() {
		return praticaEsporte;
	}

	public void setPraticaEsporte(boolean praticaEsporte) {
		this.praticaEsporte = praticaEsporte;
	}

	public String getDescricaoEsportes() {
		return descricaoEsportes;
	}

	public void setDescricaoEsportes(String descricaoEsportes) {
		this.descricaoEsportes = descricaoEsportes;
	}

	public boolean isUsaMedicamento() {
		return usaMedicamento;
	}

	public void setUsaMedicamento(boolean usaMedicamento) {
		this.usaMedicamento = usaMedicamento;
	}

	public String getDescricaoMedicamentos() {
		return descricaoMedicamentos;
	}

	public void setDescricaoMedicamentos(String descricaoMedicamentos) {
		this.descricaoMedicamentos = descricaoMedicamentos;
	}

	public Sensibilidade getSensibilidade() {
		return sensibilidade;
	}

	public void setSensibilidade(Sensibilidade sensibilidade) {
		this.sensibilidade = sensibilidade;
	}

	public boolean isGestante() {
		return isGestante;
	}

	public void setGestante(boolean isGestante) {
		this.isGestante = isGestante;
	}

	public boolean isTempoGestante() {
		return tempoGestante;
	}

	public void setTempoGestante(boolean tempoGestante) {
		this.tempoGestante = tempoGestante;
	}

	public boolean isAlergico() {
		return alergico;
	}

	public void setAlergico(boolean alergico) {
		this.alergico = alergico;
	}

	public String getDescricaoAlergias() {
		return descricaoAlergias;
	}

	public void setDescricaoAlergias(String descricaoAlergias) {
		this.descricaoAlergias = descricaoAlergias;
	}

	public boolean isHerpes() {
		return isHerpes;
	}

	public void setHerpes(boolean isHerpes) {
		this.isHerpes = isHerpes;
	}

	public boolean isCardiaco() {
		return isCardiaco;
	}

	public void setCardiaco(boolean isCardiaco) {
		this.isCardiaco = isCardiaco;
	}

	public boolean isTemProblemasCirculatorios() {
		return temProblemasCirculatorios;
	}

	public void setTemProblemasCirculatorios(boolean temProblemasCirculatorios) {
		this.temProblemasCirculatorios = temProblemasCirculatorios;
	}

	public boolean isHipertenso() {
		return isHipertenso;
	}

	public void setHipertenso(boolean isHipertenso) {
		this.isHipertenso = isHipertenso;
	}

	public boolean isDiabetico() {
		return isDiabetico;
	}

	public void setDiabetico(boolean isDiabetico) {
		this.isDiabetico = isDiabetico;
	}

	public boolean isDoencaTireoide() {
		return doencaTireoide;
	}

	public void setDoencaTireoide(boolean doencaTireoide) {
		this.doencaTireoide = doencaTireoide;
	}

	public boolean isDoencaRenal() {
		return doencaRenal;
	}

	public void setDoencaRenal(boolean doencaRenal) {
		this.doencaRenal = doencaRenal;
	}

	public boolean isDepressivo() {
		return isDepressivo;
	}

	public void setDepressivo(boolean isDepressivo) {
		this.isDepressivo = isDepressivo;
	}

	public boolean isTemPinos() {
		return temPinos;
	}

	public void setTemPinos(boolean temPinos) {
		this.temPinos = temPinos;
	}

	public boolean isTemConvulsao() {
		return temConvulsao;
	}

	public void setTemConvulsao(boolean temConvulsao) {
		this.temConvulsao = temConvulsao;
	}

	public boolean isTemEstresse() {
		return temEstresse;
	}

	public void setTemEstresse(boolean temEstresse) {
		this.temEstresse = temEstresse;
	}

	public boolean isAlcoolatra() {
		return isAlcoolatra;
	}

	public void setAlcoolatra(boolean isAlcoolatra) {
		this.isAlcoolatra = isAlcoolatra;
	}

	public boolean isFumante() {
		return isFumante;
	}

	public void setFumante(boolean isFumante) {
		this.isFumante = isFumante;
	}

	public boolean isLactante() {
		return isLactante;
	}

	public void setLactante(boolean isLactante) {
		this.isLactante = isLactante;
	}

	public boolean isEpiletico() {
		return isEpiletico;
	}

	public void setEpiletico(boolean isEpiletico) {
		this.isEpiletico = isEpiletico;
	}

	public boolean isCirugiaOcular() {
		return cirugiaOcular;
	}

	public void setCirugiaOcular(boolean cirugiaOcular) {
		this.cirugiaOcular = cirugiaOcular;
	}

	public boolean isTemGlaucoma() {
		return temGlaucoma;
	}

	public void setTemGlaucoma(boolean temGlaucoma) {
		this.temGlaucoma = temGlaucoma;
	}

	public boolean isLacrimeja() {
		return lacrimeja;
	}

	public void setLacrimeja(boolean lacrimeja) {
		this.lacrimeja = lacrimeja;
	}

	public boolean isTrataOncologia() {
		return trataOncologia;
	}

	public void setTrataOncologia(boolean trataOncologia) {
		this.trataOncologia = trataOncologia;
	}

	public boolean isAlopeciaAreata() {
		return alopeciaAreata;
	}

	public void setAlopeciaAreata(boolean alopeciaAreata) {
		this.alopeciaAreata = alopeciaAreata;
	}

	public boolean isUsaLente() {
		return usaLente;
	}

	public void setUsaLente(boolean usaLente) {
		this.usaLente = usaLente;
	}

	public boolean isUsaAcidos() {
		return usaAcidos;
	}

	public void setUsaAcidos(boolean usaAcidos) {
		this.usaAcidos = usaAcidos;
	}

	public boolean isMarcaExpressao() {
		return marcaExpressao;
	}

	public void setMarcaExpressao(boolean marcaExpressao) {
		this.marcaExpressao = marcaExpressao;
	}

	public String getDescricaoTratamento() {
		return descricaoTratamento;
	}

	public void setDescricaoTratamento(String descricaoTratamento) {
		this.descricaoTratamento = descricaoTratamento;
	}
	
	
	
}
