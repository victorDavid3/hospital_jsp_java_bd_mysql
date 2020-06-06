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
        
        <h1>Cadastro de Medico</h1>
         <br>
         <div class="quad">
            <form name="forms1" action="/Hostal_Web_2/RecebeCadasMedico" method="post">
            
                <fieldset>
                    <center><legend>Cadastro de Medico</legend></center>
                    <fieldset>
                            <legend>Dados do medico</legend>
                        <label for="CRM">CRM</label>
                        <input class="form-control form-control-lg" id="CRM" name="CRM" type="number" min="1" max="999999" step="1" value="" placeholder="CRM" required>
                        <br>

                        <label for="Nome">Nome</label>
                        <input class="form-control form-control-lg" id="Nome" name="nome" type="text" value="" placeholder="Nome" required>
                        <br>
                     </fieldset>
                    <br>
                <fieldset>
                    <legend>Endereço</legend>
                    
                        <label for="Numero">Numero</label>
                        <input class="form-control form-control-lg" id="Numero" name="numero" type="number" min="1" max="999999" value="" placeholder="Numero" required>
                        <br>

                        <label for="Rua">Rua</label>
                        <input class="form-control form-control-lg" id="Rua" name="rua" type="text" value="" placeholder="Rua" required>
                        <br>

                        <label for="Bairro">Bairro</label>
                        <input class="form-control form-control-lg" id="Bairro" name="bairro" type="text" value="" placeholder="Bairro" required>
                        <br>

                        <label for="Cidade">Cidade</label>
                        <input class="form-control form-control-lg" id="Cidade" name="cidade" type="text" value="" placeholder="Cidade" required>
                        <br>

                        <label for="Estado">Estado</label>        
                        <select class="form-control form-control-lg" id="Estado" name="estado">
                         <option value="Acre" selected>Acre</option>
                          <option value="Alagoas">Alagoas</option>
                          <option value="Amapá">Amapá</option>
                          <option value="Amazonas">Amazonas</option>
                          <option value="Bahia">Bahia</option>
                          <option value="Ceará">Ceará</option>
                          <option value="Distrito Federal">Distrito Federal</option>
                          <option value="Espírito Santo">Espírito Santo</option>
                          <option value="Goiás">Goiás</option>
                          <option value="Maranhão">Maranhão</option>
                          <option value="Mato Grosso">Mato Grosso</option>
                          <option value="Mato Grosso do Sul">Mato Grosso do Sul</option>
                          <option value="Minas Gerais">Minas Gerais</option>
                          <option value="Paraíba">Paraíba</option>
                          <option value="Paraná">Paraná</option>
                          <option value="Pernambuco">Pernambuco</option>
                          <option value="Piauí">Piauí</option>
                          <option value="Rio de Janeiro">Rio de Janeiro</option>
                          <option value="Rio Grande do Norte">Rio Grande do Norte</option>
                          <option value="Rio Grande do Sul">Rio Grande do Sul</option>
                          <option value="Rondônia">Rondônia</option>
                          <option value="Roraima">Roraima</option>
                          <option value="Santa Catarina">Santa Catarina</option>
                          <option value="São Paulo">São Paulo</option>
                          <option value="Sergipe">Sergipe</option>
                          <option value="Tocantins">Tocantins</option>
                          
                        </select>   
                        <br>
                </fieldset>
                    <br>
                <fieldset>
                    <legend>Contato</legend>
                        <label for="NumeroTel_1">Numero tel(1)</label>
                        <input class="form-control form-control-lg" id="NumeroTel_1" name="numeroTel_1" type="number" min="1" max="99999999999" value="" placeholder="Numero tel(1)" required>
                        <br>

                        <label for="NumeroTel_2">Numero tel(2)</label>
                        <input class="form-control form-control-lg" id="NumeroTel_2" name="numeroTel_2" type="number" min="1" max="99999999999" value="" placeholder="Numero tel(2)">
                        <br>
                </fieldset>
                
                <center><input type="submit" class="btn btn-primary" name="enviar" value="Enviar"></center>
              
                </fieldset>
             </form>    
             <br>
             </div>
            <br>      
    </body>
</html>
