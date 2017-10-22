var xhr = new XMLHttpRequest();

function submeterFormulario(){
    
    var forumularios = document.forms;
    
    var principal = new Object();
    principal.nome = forumularios[0].nome.value;
    principal.descricao = forumularios[0].descricao.value;
    principal.tempomedio = forumularios[0].tempomedio.value;
    principal.pausa = forumularios[0].pausa.value;
    principal.temporestante = forumularios[0].temporestante.value;
    
    var array = new Array();
    array[0] = principal;
    
    for(var i = 1; i < forumularios.length; i++){
        var secundario = new Object();
        secundario.nome = forumularios[i].nome.value;
        secundario.valor = forumularios[i].valor.value;
        
        array[i] = secundario;
    }
    
    var argument = "value="+JSON.stringify(array);
    
    
    alert(array[0].nome.value);
    alert(JSON.stringify(array));
    
    xhr.open("post", "../CadastrarServicoController", false);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(argument);
}

function adicionarSubservico(){
    
    var a = "<form>";
    a += "Nome: <input type=\"text\" name=\"nome\"/>";
    a += "Valor: <input type=\"text\" name=\"valor\"/>";
    a += "</form>";
    
    var subservico = document.getElementById("subservicos");
    
    subservico.innerHTML += a;
}

onload = function(){
    var botao = document.getElementById("botao");
    botao.onclick = adicionarSubservico;
    
    var submeter = document.getElementById("submeter");
    submeter.onclick = submeterFormulario;
};