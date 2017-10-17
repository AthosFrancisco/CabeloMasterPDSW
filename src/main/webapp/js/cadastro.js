var xhr = new XMLHttpRequest();

onload = function(){
    var formulario = document.forms[0];
    var cep = formulario.cep;
    var resposta;
    
    cep.onblur = function(){
        xhr.open("get", "https://viacep.com.br/ws/"+cep.value+"/json/", true);
        xhr.send(null);
        
        xhr.onreadystatechange = function(){
            if(xhr.readyState === 4){
                resposta = JSON.parse(xhr.responseText);
                
                formulario.logradouro.value = resposta.logradouro;
                formulario.bairro.value = resposta.bairro;
                formulario.complemento.value = resposta.complemento;
                formulario.cidade.value = resposta.localidade;
                formulario.estado.value = resposta.uf;
            }
        };
    };
};