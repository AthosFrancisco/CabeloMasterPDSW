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
        <h1>lista de Cabelereiro!</h1>
        
        <c:forEach var="func" items="${requestScope.lista}">
            <form action="VerCabelereiroController" method="post">
                <input name="codigo" vale="${func.id}" type="text" style="display: none"/>
                Código Funcionário: ${func.id}<br/>
                Nome do Funcionário: ${func.nome}<br/>
                <input type="submit" value="editar"/>
                <input type="submit" value="excluir"/>
            </form>
                
        </c:forEach>
    </body>
</html>
