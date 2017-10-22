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
    </head>
    <body>
        <a href="Gerente/cadastroCabelereiro.jsp">Cadastrar Cabelereiro</a>
        <h1>lista de Cabelereiro!</h1>
        
        <c:forEach var="func" items="${requestScope.lista}">
            <form action="CabelereiroController" method="get">
                <input name="codigo" value="${func.id}" type="text" style="display: none"/>
                Código Funcionário: ${func.id}<br/>
                Nome do Funcionário: ${func.nome}<br/>
                <input type="submit" value="editar"/>
                <button type="button"><a href="ExcluirCabelereiroController?codigo=${func.id}">excluir</a></button>
            </form>
                
        </c:forEach>
    </body>
</html>
