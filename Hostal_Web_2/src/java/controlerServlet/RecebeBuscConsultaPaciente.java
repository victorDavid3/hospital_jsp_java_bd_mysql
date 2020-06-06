/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlerServlet;

import controllerDAO.ConsultaDAO;
import controllerDAO.MedicoDAO;
import controllerDAO.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;
import model.Medico;
import model.Paciente;

/**
 *
 * @author victo
 */
@WebServlet(name = "RecebeBuscConsultaPaciente", urlPatterns = {"/RecebeBuscConsultaPaciente"})
public class RecebeBuscConsultaPaciente extends HttpServlet {

     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
        String cpf = (req.getParameter("CPFdig"));
        String crm = (req.getParameter("CRM"));

        Paciente paciente = new Paciente();
        PacienteDAO crudPaciente = new PacienteDAO();
     
        paciente = crudPaciente.buscarPacienteCPF(cpf);
      
       String resulBuscCPF = (paciente.getCadas_CPF());
        
       PrintWriter saida = resp.getWriter();
        
        saida.print("Paciente CPF: "+resulBuscCPF);
       
        
        if(resulBuscCPF==null){
            resp.sendRedirect("/Hostal_Web_2/viewConsulta/CadastraConsulta_2.jsp?crm="+crm);
        } else{
          resp.sendRedirect("/Hostal_Web_2/viewConsulta/CadastraConsulta_3.jsp?cpf="+ resulBuscCPF+ "&crm="+crm);
  
        }
       
     
     }
}
