<%-- 
    Document   : listaCabelereiros
    Created on : 17/10/2017, 00:19:54
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <a href="Gerente/index.jsp" class="btn bnt-default navbar-bnt">Início</a>
                    <a href="Gerente/cadastroCabelereiro.jsp" class="btn bnt-default navbar-bnt">Cadastrar Cabelereiro</a>
                </div>
            </div>
        </nav>

        <div class="container">
            <h1>Lista de Cabelereiro!</h1>

            <c:forEach var="func" items="${requestScope.lista}">
                <form action="CabelereiroController" method="get">
                    <input name="codigo" value="${func.id}" type="text" style="display: none"/>
                    Código Funcionário: ${func.id}<br/>
                    Nome do Funcionário: ${func.nome}<br/>
                    <input type="submit" value="editar"/>
                    <a class="btn btn-default" href="ExcluirCabelereiroController?codigo=${func.id}">excluir</a>
                </form>

            </c:forEach>
        </div>
    </body>
</html>
