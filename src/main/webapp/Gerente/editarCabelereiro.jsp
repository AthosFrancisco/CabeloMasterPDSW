<%-- 
    Document   : editarCabelereiro
    Created on : 19/10/2017, 11:44:45
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/cadastro.js" type="text/javascript"></script>
        <title>Editar Cabelereiro</title>
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
                    <a href="../ListarCabelereiros" class="btn bnt-default navbar-bnt">Listar Cabelereiros</a>
                </div>
            </div>
        </nav>

        <div class="container">
            <h1>Editar Cadastro</h1>

            <form method="post" action="CabelereiroController">
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <div class="form-group">
                        <label for="codigo">Código:</label>
                        <input type="number" name="codigo" value="${requestScope.cab.id}" readonly="readonly" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text" name="nome" placeholder="Nome..." class="form-control" value="${requestScope.cab.nome}"/>
                    </div>
                    <div class="form-group">
                        <label for="cpf">Cpf:</label>
                        <input type="number" name="cpf" placeholder="Cpf..." class="form-control" value="${requestScope.cab.cpf}" disabled="true"/>
                    </div>
                    <div class="form-group">
                        <label for="email">E-mail:</label>
                        <input type="text" name="email" placeholder="E-mail..." class="form-control" value="${requestScope.cab.email}"/>
                    </div>
                    <div class="form-group">
                        <label for="senha">Senha:</label>
                        <input type="password" name="senha" placeholder="Senha..." class="form-control" value="${requestScope.cab.senha}"/>
                    </div>
                    <div class="form-group">
                        <label for="sexo">Sexo:</label>
                        <select name="sexo" class="form-control" disabled="true">
                            <option value="M">Masculino</option>
                            <option value="F">Feminino</option>
                        </select>
                    </div>
                </fieldset>
                <fieldset>
                    <legend>Endereço</legend>
                    <div class="form-group">
                        <label for="cep">CEP:</label>
                        <input name="cep" type="number" placeholder="Cep..." class="form-control" value="${requestScope.cab.endereco.cep}"/>
                    </div>
                    <div class="form-group">
                        <label for="logradouro">Logradouro:</label>
                        <input name="logradouro" type="text" placeholder="Logradouro..." class="form-control" value="${requestScope.cab.endereco.logradouro}"/>
                    </div>
                    <div class="form-group">
                        <label for="numero" value="">Numero:</label>
                        <input name="numero" type="number" placeholder="Numero..." class="form-control" value="${requestScope.cab.endereco.numero}"/>
                    </div>
                    <div class="form-group">
                        <label for="bairro">Bairro:</label>
                        <input name="bairro" type="text" placeholder="Bairro..." class="form-control" value="${requestScope.cab.endereco.bairro}"/>
                    </div>
                    <div class="form-group">
                        <label for="complemento" value="">Complemento:</label>
                        <input name="complemento" type="text" placeholder="Complemento..." class="form-control" value="${requestScope.cab.endereco.complemento}"/>
                    </div>
                    <div class="form-group">
                        <label for="cidade">Cidade:</label>
                        <input name="cidade" type="text" placeholder="Cidade..." class="form-control" value="${requestScope.cab.endereco.cidade}"/>
                    </div>
                    <div class="form-group">
                        <label for="estado">Estado:</label>
                        <input name="estado" type="text" placeholder="Estado..." class="form-control" value="${requestScope.cab.endereco.estado}"/>
                    </div>
                </fieldset>
                <input type="submit" value="enviar" class="btn btn-lg btn-primary"/>
            </form>
        </div>
    </body>
</html>
