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
    
    var qtdSub = parseInt(document.forms[0].qtdsub.value)+1;
    document.forms[0].qtdsub.value = qtdSub;
    
    var nome = document.createElement("INPUT");
    nome.name = "nomeSub"+qtdSub;
    nome.type = "text";
    
    var valor = document.createElement("INPUT");
    valor.name = "valorSub"+qtdSub;
    valor.type = "text";
    
    var labelNome = document.createElement("LABEL");
    labelNome.for = "nomeSub"+qtdSub;
    labelNome.appendChild(document.createTextNode("Nome: "));
    
    var labelValor = document.createElement("LABEL");
    labelValor.for = "valorSub"+qtdSub;
    labelValor.appendChild(document.createTextNode("Valor: "));
    
    
    var subservico = document.getElementById("subservicos");
    
    subservico.appendChild(labelNome);
    subservico.appendChild(nome);
    subservico.appendChild(labelValor);
    subservico.appendChild(valor);
    subservico.appendChild(document.createElement("BR"));
}

onload = function(){
    var botao = document.getElementById("botao");
    botao.onclick = adicionarSubservico;
};