<%-- 
    Document   : index
    Created on : 01/06/2020, 12:30:53
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="CSS/corIndex.css">

        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="viewGenericas/cabecalho.jsp" %>
        
        <div class="quad" id="qua">
                 
       <div class="quad3" id="paci">
        <img src="imagens/pessoa30p.png" />
        <br>
        <a class="navbar-brand" href="viewPaciente/inicialPaciente.jsp"><h3>Pacientes</h3></a>
        
        </div>
            
   
            
        <div class="quad3" id="medico">
        <a  href="viewMedico/inicialMedico.jsp"><img src="imagens/medic.png" /></a>   
        <br>
        <a class="navbar-brand" href="viewMedico/inicialMedico.jsp"><h3>Medicos</h3></a>
        </div>
            
            
          
        
        <div class="quad3" id="calendario">
        <img src="imagens/calendariop30.png" />
        <br>
        <a class="navbar-brand" href="viewConsulta/inicialConsulta.jsp"><h3>Agendamento</h3></a>
        
        </div>
            
            <br>
        </div>
       
  
          <script src="JS/jsIndex.js"></script>      
            
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

       
    </body>
</html>
