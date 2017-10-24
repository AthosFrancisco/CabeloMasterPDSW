<%-- 
    Document   : cadastroServico
    Created on : 20/10/2017, 11:59:02
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="../js/cadastroServico.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Servico</h1>
        <form action="../CadastrarServicoController" method="post">
            <label for="nome">Nome:</label>
            <input type="text" name="nome" placeholder="Nome..."/>
            <label for="descricao">Descrição:</label>
            <textarea name="descricao" placeholder="Descrição..."></textarea>
            <label for="tempomedio">Tempo Médio de Atendimento</label>
            <input name="tempomedio" type="time"/>
            <label for="pausa">Pausa:</label>
            <input name="pausa" type="time"/>
            <label for="temporestante">Tempo Restante:</label>
            <input name="temporestante" type="time"/>
        </form>
        
        <button type="button" id="botao">Adicionar Subserviço</button>
        
        <div id="subservicos">
                
        </div>

        <button type="submit" id="submeter">Enviar</button>
    </body>
</html>
