<%-- 
    Document   : index
    Created on : 16/10/2017, 20:51:59
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="cadastroCabelereiro.jsp">Cadastrar Cabelereiro</a>
        <a href="../ListarCabelereiros">Listar Cabelereiros</a>
        <h1>Hello World! ${sessionScope.usuario.nome}</h1>
        
    </body>
</html>
