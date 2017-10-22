function escondeDiv(){
    
    var elemento = document.getElementById("div"+this.id);
    elemento.style.display = "none";
    
    var botaoPrincipal = document.getElementById("botaoPrincipal"+this.id);
    botaoPrincipal.style.display = "block";
}

function mostraDiv(){
    
    var elemento = document.getElementById("div"+this.id);
    elemento.style.display = "block";
    
    var botaoPrincipal = document.getElementById("botaoPrincipal"+this.id);
    botaoPrincipal.style.display = "none";
}

function init(){
    
    var desc = document.getElementsByClassName("descServc");
    var botao = document.getElementsByClassName("desc");
    var botaoSecundario = document.getElementsByClassName("botaoSecundario");
    
    for(var i = 0; i<desc.length; i++){
        desc[i].style.display = "none";
        botao[i].onclick = mostraDiv;
        botaoSecundario[i].onclick = escondeDiv;
    }
}

onload = init;