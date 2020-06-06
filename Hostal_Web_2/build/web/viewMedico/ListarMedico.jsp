<%-- 
    Document   : ListarMedico
    Created on : 02/06/2020, 10:02:03
    Author     : victo
--%>


<%@page import="model.Medico"%>
<%@page import="controllerDAO.MedicoDAO"%>
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
        String tudo="";
          
        MedicoDAO  medDAO = new MedicoDAO();
    
        
       
       
        for(Medico a : medDAO.listarMedicos()){
         
        
         
          
                tudo = (tudo + ("<tr><td>"+a.getCod_medico()+"</td>"+"<td>"+a.getNome()+"</td><td>"+a.getCrm()+"</td><td>"+a.getTel_1()+"</td><td>"+a.getTel_2()+"</td><td>"+a.getRua()+"</td><td>"+a.getEndere_numero()+"</td><td>"+a.getBairro()+"</td><td>"+ a.getCidade()+"</td><td>"+a.getEstado()+"</td></tr>"));
            

        }
            

        
        %>
      
        <h1>Lista de medicos</h1>
        
        <table class="table-responsive" border="1">
            <tr>
                <td>Cod</td>
                <td>Nome</td>
                <td>CRM</td>
                <td>Tel 1</td>
                <td>Tel 2</td>
                <td>Rua</td>
                <td>Numero</td>
                <td>Bairro</td>
                <td>Cidade</td>
                <td>Estado</td>
            </tr>
           
                <%=tudo%>
         
        </table>
        
        <br>
   
    </body>
</html>
