<%-- 
    Document   : login
    Created on : 16/10/2017, 22:02:55
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
        <form method="post" action="LoginController">
            <fieldset>
                <legend>Login</legend>
                <label for="login">login</label>
                <input name="login" type="text" placeholder="Login..."/>
                <label for="senha">senha</label>
                <input name="senha" type="password" placeholder="Senha..."/>
                <label for="tipo">tipo</label>
                <select name="tipo">
                    <option value="CLIENTE">Cliente</option>
                    <option value="CABELEREIRO">Cabelereiro</option>
                    <option value="GERENTE">Gerente</option>
                </select>
                <input type="submit" value="enviar"/>
            </fieldset>
        </form>
    </body>
</html>
