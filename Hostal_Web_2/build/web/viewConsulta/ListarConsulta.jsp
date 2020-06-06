<%-- 
    Document   : ListarMedico
    Created on : 02/06/2020, 10:02:03
    Author     : victo
--%>


<%@page import="model.Consulta"%>
<%@page import="controllerDAO.PacienteDAO"%>
<%@page import="controllerDAO.ConsultaDAO"%>
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
          
       
    String CPF;
        ConsultaDAO  cons = new ConsultaDAO();
    
        
        MedicoDAO m_dao = new MedicoDAO();
        PacienteDAO p = new PacienteDAO();
       
        for(Consulta a : cons.listarConsultas()){
            
        int CRM = Integer.valueOf(a.getConsul_medico_crm());
        m_dao.buscarMedicoCRM(CRM);     
        
        CPF = (a.getConsul_paci_cpf());
        p.buscarPacienteCPF(CPF);
   
         
       tudo = (tudo + ("<tr><td>"+a.getConsul_numero()+"</td>"+"<td>"+p.nome_p+"</td><td>"+a.getConsul_paci_cpf()+"</td><td>"+a.getCadas_descri()+"</td><td>"+a.getCadas_dia()+"</td><td>"+a.getCadas_hora()+"</td><td>"+m_dao.nome_m+"</td><td>"+a.getConsul_medico_crm()+"</td></tr>"));
 
        }
        

        %>
      
        <h1>Lista de Consultas</h1>
        
        <table class="table-responsive" border="1">
            <tr>
                <td>Cod</td>
                <td>Nome paciente</td>
                <td>CPF paciente</td>
                <td>Descrição</td>
                <td>Data</td>
                <td>Horario</td>
                <td>Nome medico</td>
                <td>CRM medico</td>
               
            </tr>
           
                <%=tudo%>
         
        </table>
        
        <br>
   
    </body>
</html>
