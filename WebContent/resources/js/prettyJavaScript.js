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