<%-- 
    Document   : cadastro
    Created on : 17/10/2017, 00:26:39
    Author     : Athos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../js/cadastro.js"></script>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form method="post" action="../CadastroCabelereiroController">
            <fieldset>
                <legend>Dados Pessoais</legend>
                <label for="nome">Nome:</label>
                <input type="text" name="nome" placeholder="Nome..."/>
                <label for="cpf">Cpf:</label>
                <input type="number" name="cpf" placeholder="Cpf..."/>
                <label for="email">E-mail:</label>
                <input type="text" name="email" placeholder="E-mail..."/>
                <label for="senha">Senha:</label>
                <input type="password" name="senha" placeholder="Senha..."/>
                <label for="sexo">Sexo:</label>
                <select name="sexo">
                    <option value="M">Masculino</option>
                    <option value="F">Feminino</option>
                </select>
            </fieldset>
            <fieldset>
                <legend>Endereço</legend>
                <label for="cep">CEP:</label>
                <input name="cep" type="number" placeholder="Cep..."/>
                <label for="logradouro">Logradouro:</label>
                <input name="logradouro" type="text" placeholder="Logradouro..."/>
                <label for="numero" value="">Numero:</label>
                <input name="numero" type="number" placeholder="Numero..."/>
                <label for="bairro">Bairro:</label>
                <input name="bairro" type="text" placeholder="Bairro..."/>
                <label for="complemento" value="">Complemento:</label>
                <input name="complemento" type="text" placeholder="Complemento..."/>
                <label for="cidade">Cidade:</label>
                <input name="cidade" type="text" placeholder="Cidade..."/>
                <label for="estado">Estado:</label>
                <input name="estado" type="text" placeholder="Estado..."/>
            </fieldset>
            <input type="submit" value="enviar"/>
        </form>
    </body>
</html>
