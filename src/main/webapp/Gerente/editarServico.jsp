<%-- 
    Document   : cadastroServico
    Created on : 20/10/2017, 11:59:02
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/cadastroServico.js"></script>
        <title>JSP Page</title>
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
                </div>
            </div>
        </nav>
        <div class="container">
            <h1>Editar Servico</h1>
            <form action="../EditarServicoController" method="post">
                <div class="form-group">
                    <label for="codigo">Código:</label>
                    <input type="text" name="nome" placeholder="Nome..." class="form-control" value="${requestScope.servico.id}" readonly="readonly"/>
                </div>
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" name="nome" placeholder="Nome..." class="form-control" value="${requestScope.servico.nomeServico}"/>
                </div>
                <div class="form-group">
                    <label for="descricao">Descrição:</label>
                    <textarea name="descricao" placeholder="Descrição..." class="form-control">${requestScope.servico.descricao}</textarea>
                </div>
                <div class="form-group">
                    <label for="tempomedio">Tempo Médio de Atendimento</label>
                    <input name="tempomedio" type="time" class="form-control" value="${requestScope.servico.tempoMedioAtendimento}"/>
                </div>
                <div class="form-group">
                    <label for="pausa">Pausa:</label>
                    <input name="pausa" type="time" class="form-control" value="${requestScope.servico.pausa}"/>
                </div>
                <div class="form-group">
                    <label for="temporestante">Tempo Restante:</label>
                    <input name="temporestante" type="time" class="form-control" value="${requestScope.servico.tempoRestanteAtendimento}"/>
                </div>

                <button type="button" id="botao">Adicionar Subserviço</button>

                <input name="qtdsub" value="${requestScope.servico.subServ.size()}" type="text"/>

                <div id="subservicos">
                    <c:forEach var="s" items="${requestScope.servico.subServ}">
                        <label ></label>
                    </c:forEach>
                </div>

                <button type="submit" id="submeter">Enviar</button>

            </form>

        </div>
    </body>
</html>
