<%-- 
    Document   : login
    Created on : 16/10/2017, 22:02:55
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
                    <img src="img/cabelo.jpg" height="60" width="60" class="img-circle"/>
                    <h1 class="navbar-text navbar-right">Cabelo Master</h1>
                </div>
            </div>
        </nav>

        <div class="container">
            <form method="post" action="LoginController">
                <fieldset>
                    <legend>Login</legend>
                    <div class="form-group">
                        <label for="login">Login</label>
                        <input name="login" type="text" placeholder="name@example.com" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="senha">Senha</label>
                        <input name="senha" type="password" placeholder="Senha..." class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="tipo">Tipo</label>
                        <select name="tipo" class="form-control">
                            <option value="CLIENTE">Cliente</option>
                            <option value="CABELEREIRO">Cabelereiro</option>
                            <option value="GERENTE">Gerente</option>
                        </select>
                    </div>
                    <input type="submit" value="enviar" class="btn btn-primary btn-lg"/>
                    <a href="cadastro.jsp" class="btn btn-default"> Cadastrar</a>
                </fieldset>
            </form>
        </div>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        oi<br/>
    </body>
</html>
