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
                    <img src="../img/cabelo.jpg" height="60" width="60" class="img-circle navbar-left"/>
                    <h1 class="navbar-text navbar-left">Cabelo Master</h1>
                    <a href="#" class="btn bnt-default navbar-bnt">Início</a>
                    <a href="../ListarCabelereiros" class="btn bnt-default navbar-bnt">Listar Cabelereiros</a>
                    <a href="../ListarServicos" class="btn bnt-default navbar-bnt">Listar Serviços</a>
                    <a href="../LoginController" class="btn bnt-default navbar-bnt">Sair</a>
                </div>
            </div>
        </nav>

        <div class="container">
            <h1>Bem vindo ${sessionScope.usuario.nome}</h1>
        </div>
    </body>
</html>
