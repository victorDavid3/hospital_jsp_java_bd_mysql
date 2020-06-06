<%-- 
    Document   : ListarMedico
    Created on : 02/06/2020, 10:02:03
    Author     : victo
--%>


<%@page import="model.Paciente"%>
<%@page import="controllerDAO.PacienteDAO"%>
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
        PacienteDAO  paci = new PacienteDAO();
        
       
        for(Paciente a : paci.listarPacientes()){
         
                tudo = (tudo + ("<tr><td>"+a.getNum_Paciente()+"</td>"+"<td>"+a.getCadas_nome()+"</td><td>"+a.getCadas_CPF()+"</td><td>"+a.getCadas_Idade()+"</td><td>"+a.getTel_1()+"</td><td>"+a.getTel_2()+"</td><td>"+a.getRua()+"</td><td>"+a.getEndere_numero()+"</td><td>"+a.getBairro()+"</td><td>"+ a.getCidade()+"</td><td>"+a.getEstado()+"</td></tr>"));
            
        }
            

        %>
      
        <h1>Lista de pacientes</h1>
        
        <table class="table-responsive" border="1">
            <tr>
                <td>Cod</td>
                <td>Nome</td>
                <td>CPF</td>
                <td>Data de nascimento</td>
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
