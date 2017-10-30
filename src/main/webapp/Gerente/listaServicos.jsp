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
        <title>Lista de Serviços</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <style>
            body{
                padding-top: 80px;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <img src="img/cabelo.jpg" height="60" width="60" class="img-circle navbar-left"/>
                    <h1 class="navbar-text navbar-left">Cabelo Master</h1>
                    <a href="Gerente/index.jsp" class="btn bnt-default navbar-bnt">Início</a>
                    <a href="Gerente/cadastroServico.jsp" class="btn bnt-default navbar-bnt">Cadastrar Serviço</a>
                </div>
            </div>
        </nav>

        <div class="container">
            <h1>Serviços Cadastrados</h1>
            <c:forEach var="s" items="${requestScope.lista}">
                <form method="get" action="EditarServicoController">
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
                    <input type="submit" value="Editar"/>
                    <a href="ServicoController?codigo=${s.id}">Excluir</a>
                </form>
                <br/>
                <br/>
            </c:forEach>
        </div>
    </body>
</html>
