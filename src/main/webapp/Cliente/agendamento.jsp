<%-- 
    Document   : marcarVisita
    Created on : 17/10/2017, 00:20:24
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                    <a href="index.jsp" class="btn bnt-default navbar-bnt">Início</a>
                    <a href="#" class="btn bnt-default navbar-bnt">Agendamento</a>
                    <a href="../LoginController" class="btn bnt-default navbar-bnt">Sair</a>
                </div>
            </div>
        </nav>

        <div class="container">
            <h1>Agendamento</h1>

            <form action="AgendamentoController" method="post">
                <label for="servico">Servico</label>
                <select name="servico">
                    <c:forEach var="s" items="${requestScope.listaServico}">
                        <option value="${s.id}">${s.nomeServico}</option>
                    </c:forEach>
                </select>
                <label for="cabelereiro">Cabelereiro</label>
                <select name="cabelereiro">
                    <c:forEach var="c" items="${requestScope.listaCabelereiro}">
                        <option value="${c.id}">${c.nome}</option>
                    </c:forEach>
                </select>
                
            </form>
        </div>
    </body>
</html>
