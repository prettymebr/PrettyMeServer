$(document).ready(function() {
	console.log("Pagina carregada")
	$("#cep").focusout(function() {
		
		var cep = $("#cep").val();
		cep = cep.replace("-", "");
		var urlStrViaCEP = "https://viacep.com.br/ws/" + cep + "/json/";
		var urlStrCorreio = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente"
		$.ajax({
			url : urlStrViaCEP,
			type : "get",
			dataType : "json",
			success : function(data) {
				console.log(data);
				
				$("#cidade").val(data.localidade);
				$("#uf").val(data.uf);
				$("#bairro").val(data.bairro);
				$("#logradouro").val(data.logradouro);
				$("#complemento").val(data.complemento);
			},
			error : function(erro) {
				console.log(erro);
			}
		});
	});
});



function adicionaEndereco() {

	var labels= ['Especie','Nome','Raça','Sexo','Data de Nascimento','Talhe'];
	var atributos= ['especie','nome','raca','sexo','dataNascimento','talhe'];
	var element = ['select','input','input','select','input','select'];
	var divPet = document.getElementById('divPet');
	var qtpet = document.getElementById("petQtd");
	var h3 = document.createElement('h3');
	var elements = [];

	qtpet.value = Number(qtpet.value)+1;
	h3.className="text-center border h3 col-12";
	h3.innerHTML="Pet "+qtpet.value;
	divPet.append(h3);
	for (var j=0; j<atributos.length; j++){
		elements.push( createInput(element[j],Number(qtpet.value)-1,"paciente",atributos[j],labels[j]));                            
	}
	for (var k=0; k<atributos.length; k++){
		divPet.appendChild(elements[k]);
	}
	divPet.append(document.createElement('br'));
}

function createInput(type,valueArray,nomeVariavel,nomeAtributo,labels){

	var element = document.createElement(type);
	var div = document.createElement('div');
	var label = document.createElement('label');
	div.id = type+(valueArray)+"."+nomeAtributo;
	div.className = "form-group col-6";
	label.htmlFor = nomeVariavel+(valueArray)+"."+nomeAtributo;
	label.innerHTML = labels;
	element.className="form-control";
	element.id = nomeVariavel+"["+(valueArray)+"]."+nomeAtributo;
	element.name = nomeVariavel+"["+(valueArray)+"]."+nomeAtributo;

	switch (type) {
	case 'input':
		div.id = type+(valueArray)+"."+nomeAtributo;
		div.append(label,element);
		return div;
		break;
	case 'select':
		var valor = [];
		var texto = [];
		var options = [];
		switch (nomeAtributo){
		case 'sexo':
			valor = ['MASCULINO','FEMININO'];
			texto = ['Masculino','Feminino'];
			break;
		case 'especie':
			valor = ['AVES','CANINO','FELINO','SILVESTRE','EXOTICO'];
			texto = ['Aves','Canino','Felino','Silvestre','Exótico'];
			break;
		case 'talhe':
			valor = ['MINI','PEQUENO','MEDIO','GRANDE'];
			texto = ['Mini','Pequeno','Medio','Grande'];
			break;
		default:
			break;
		}
		for (var i=0; i<valor.length; i++){
			options.push( createOptionItem(valor[i],texto[i]));                            
		}
		for (var j=0; j<options.length; j++){
			element.appendChild(options[j]);
		}
		div.append(label,element);
		return div;               
		break;
	default:
		break;
	}	
}

function createOptionItem(valor,texto){

	var option = document.createElement('option');
	option.value = valor;
	option.textContent = texto;

	return option;
}

$(document).ready(function(){
	  $('.data').mask('00/00/0000');
	  $('.cep').mask('00000-000');
	  $('.phone').mask('0000-0000');
	  $('.phone_with_ddd').mask('(00) 0000-0000');
	  $('.phone_us').mask('(000) 000-0000');
	  $('.mixed').mask('AAA 000-S0S');
	  $('.cpf').mask('000.000.000-00', {reverse: true});
	  $('.cnpj').mask('00.000.000/0000-00', {reverse: true});
	  $('.money').mask('000.000.000.000.000,00', {reverse: true});
	  $('.money2').mask("#.##0,00", {reverse: true});
	});

























































