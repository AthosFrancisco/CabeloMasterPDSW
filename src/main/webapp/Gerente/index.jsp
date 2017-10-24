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
        <a href="../ListarCabelereiros">Listar Cabelereiros</a>
        <a href="../ListarServicos">Listar Serviços</a>
        <a href="../LoginController">Sair</a>
        <h1>Hello World! ${sessionScope.usuario.nome}</h1>
        
    </body>
</html>
