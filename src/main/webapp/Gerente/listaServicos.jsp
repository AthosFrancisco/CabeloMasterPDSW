<%-- 
    Document   : listaServicos
    Created on : 21/10/2017, 20:08:12
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/listaServico.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <a href="Gerente/cadastroServico.jsp">Cadastrar Serviço</a>
        <h1>Serviços Cadastrados</h1>
        <c:forEach var="s" items="${requestScope.lista}">
            <form method="get" action="ServicoController">
                <input type="text" value="${s.id}" name="codigo" style="display: none"/>
                Código: ${s.id}<br/>
                Nome: ${s.nomeServico}<br/>
                <div class="descServc" id="div${s.id}">
                    Descrição: ${s.descricao}<br/>
                    Tempo Médio de Atendimento: ${s.tempoMedioAtendimento}<br/>
                    Tempo de Pausa: ${s.pausa}<br/>
                    Tempo Restante de Atendimento: ${s.tempoRestanteAtendimento}<br/>
                    Subserviços:
                    <c:forEach var="sub" items="${s.subServ}">
                        Nome: ${sub.nome}<br/>
                        Valor: ${sub.valor}<br/>
                    </c:forEach>
                    <button type="button" class="botaoSecundario" id="${s.id}">ocultar detalhes</button>
                </div>
                <div id="botaoPrincipal${s.id}">
                    <button type="button" class="desc" id="${s.id}">detalhes</button>
                </div>
                <br/>
                <input type="submit" value="excluir"/>
            </form>
            <br/>
            <br/>
        </c:forEach>
    </body>
</html>
