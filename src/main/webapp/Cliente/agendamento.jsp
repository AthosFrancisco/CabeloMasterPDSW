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
    </head>
    <body>
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
            <
        </form>
    </body>
</html>
