<%-- 
    Document   : RecebCadastroMedico
    Created on : 02/06/2020, 08:15:25
    Author     : victo
--%>

<%@page import="controllerDAO.MedicoDAO"%>
<%@page import="Verificar.Verificacao"%>
<%@page import="model.Medico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="../CSS/corIndex.css" rel="stylesheet" type="text/css"/>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>       
    </head>
    <body>
        
        <%@include file="../viewGenericas/cabecalho.jsp" %>
        
        <%
       
        String jtNome = (request.getParameter("nome"));

        %>
        
        <div id="alertCads" class="alert alert-dark" role="alert">
        <h2>Medico <%=jtNome%> cadastrado com sucesso</h2>
        </div>
    </body>
</html>
