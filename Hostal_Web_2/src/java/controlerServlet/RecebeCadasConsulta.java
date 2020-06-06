/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlerServlet;

import controllerDAO.ConsultaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;

/**
 *
 * @author victo
 */
@WebServlet(name = "RecebeCadasConsulta", urlPatterns = {"/RecebeCadasConsulta"})
public class RecebeCadasConsulta extends HttpServlet {

     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
         Consulta cons = new Consulta();
        
        String cons_hora = (req.getParameter("hora"));
        String cons_dia = (req.getParameter("dia"));
        String descricao = (req.getParameter("sintomas"));
        String cons_pacien_cpf = (req.getParameter("cpf"));
        String cons_medico_crm = (req.getParameter("CRM"));
        
        
        cons.setCadas_hora(cons_hora);
        cons.setCadas_dia(cons_dia);

        cons.setCadas_descri(descricao);   
        
        cons.setConsul_paci_cpf(cons_pacien_cpf);
   
        cons.setConsul_medico_crm(cons_medico_crm);
        
        ConsultaDAO crudConsulta = new ConsultaDAO();
        
        crudConsulta.salvarConsulta(cons);
  
        /*     
        PrintWriter saida = resp.getWriter();
        
        saida.println("CPF: "+cons_pacien_cpf);
        saida.println("CMR: "+cons_medico_crm);
        saida.println("Dia: "+cons_dia);
        saida.println("Hora: "+cons_hora);
        saida.println("Descricao: "+descricao);
       */
    
       

        resp.sendRedirect("/Hostal_Web_2/viewConsulta/RecebCadastroConsulta.jsp?cpf="+cons_pacien_cpf + "&crm="+cons_medico_crm);           

        
         
     }
}
