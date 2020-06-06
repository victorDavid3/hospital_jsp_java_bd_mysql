<%-- 
    Document   : CadastroMedico
    Created on : 02/06/2020, 07:29:06
    Author     : victo
--%>

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
        
        <h1>Cadastro de Consulta</h1>
         <br>
         <div class="quad">
           
             <form name="forms2" action="/Hostal_Web_2/RecebeBuscConsultaMedico" method="post">
                            <label for="CRMdig">CRM</label>
                            <input class="form-control form-control-lg" id="CRMdig" name="CRMdig" type="number" min="1" max="999999" step="1" value="" placeholder="CRM">
                           <input type="submit" class="btn btn-primary" name="verificar" value="Enviar">
             </form>
             
             <br>          
          </div>
          <br>      
            
           
    </body>
</html>
