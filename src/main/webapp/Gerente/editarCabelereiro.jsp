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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Cadastro</h1>
        <form method="post" action="CabelereiroController">
            <fieldset>
                <legend>Dados Pessoais</legend>
                <label for="codigo">Código:</label>
                <input type="number" name="codigo" value="${requestScope.cab.id}" readonly="readonly"/>
                <label for="nome">Nome:</label>
                <input type="text" name="nome" value="${requestScope.cab.nome}"/>
                <label for="cpf">Cpf:</label>
                <input type="number" name="cpf" value="${requestScope.cab.cpf}" disabled="true"/>
                <label for="email">E-mail:</label>
                <input type="text" name="email" value="${requestScope.cab.email}"/>
                <label for="senha">Senha:</label>
                <input type="password" name="senha" value="${requestScope.cab.senha}"/>
                <label for="sexo">Sexo:</label>
                <select name="sexo" disabled="true">
                    <option value="M">Masculino</option>
                    <option value="F">Feminino</option>
                </select>
            </fieldset>
            <fieldset>
                <legend>Endereço</legend>
                <label for="cep">CEP:</label>
                <input name="cep" type="number" value="${requestScope.cab.endereco.cep}"/>
                <label for="logradouro">Logradouro:</label>
                <input name="logradouro" type="text" value="${requestScope.cab.endereco.logradouro}"/>
                <label for="numero" value="">Numero:</label>
                <input name="numero" type="number" value="${requestScope.cab.endereco.numero}"/>
                <label for="bairro">Bairro:</label>
                <input name="bairro" type="text" value="${requestScope.cab.endereco.bairro}"/>
                <label for="complemento" value="">Complemento:</label>
                <input name="complemento" type="text" value="${requestScope.cab.endereco.complemento}"/>
                <label for="cidade">Cidade:</label>
                <input name="cidade" type="text" value="${requestScope.cab.endereco.cidade}"/>
                <label for="estado">Estado:</label>
                <input name="estado" type="text" value="${requestScope.cab.endereco.estado}"/>
            </fieldset>
            <input type="submit" value="enviar"/>
        </form>
    </body>
</html>
