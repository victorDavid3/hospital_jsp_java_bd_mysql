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
        
        <%          
                 String cpf = (request.getParameter("cpf"));
                 String crm = (request.getParameter("crm"));
                 
         %>
        
       
             
            <form name="forms1" action="/Hostal_Web_2/RecebeCadasConsulta" method="post">
            
                <fieldset>
                    <center><legend>Cadastro de Consulta</legend></center>
                    <fieldset>
                        <div class="quad3">
                         <legend>Dados do Medico</legend>
                            
                       <br>
                       <input class="form-control form-control-lg" id="CRM" name="CRM" type="number" value="<%=crm%>" placeholder="CRM" required readonly>
                        <br>
                      
                       <br>
                        </div>
                     </fieldset>
                    
                    <br>
                                    
                    <fieldset>
                    <div class="quad3">
                         <legend>Dados do paciente</legend>                     
                        <br>
                        <input class="form-control form-control-lg" id="CPF" name="cpf" type="number" value="<%=cpf%>" placeholder="CRM" required readonly>
                        <br>
                        
                        </div>
                     </fieldset>
                    
                    <br>
                <fieldset>
                    
                    <div class="quad3">
                    <legend>Dados da consulta</legend>
                    
                            <!-- Data input -->
                            <label for="dia">Data</label>
                            <input class="form-control form-control-lg" type="date" id="dia" name="dia" required>

                            <!-- hora input -->
                            <label for="hora">Horario</label>
                            <input class="form-control form-control-lg" type="time" id="hora" name="hora" required>

                            <br>
                             <label for="Sintomas">Sintomas</label>
                        <input class="form-control form-control-lg" id="Sintomas" name="sintomas" type="text" value="" placeholder="Sintomas" required>
                        <br>
                         
                    </div>   
                    
                </fieldset>
                    <br>
                
                
                <center><input type="submit" class="btn btn-primary" name="enviar" value="Enviar"></center>
              
                </fieldset>
             </form>    
           <br>
          </div>
          <br>      
            
           
    </body>
</html>
