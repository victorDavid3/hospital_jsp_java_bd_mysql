/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlerServlet;

import controllerDAO.ConsultaDAO;
import controllerDAO.MedicoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;
import model.Medico;

/**
 *
 * @author victo
 */
@WebServlet(name = "RecebeBuscConsultaMedico", urlPatterns = {"/RecebeBuscConsultaMedico"})
public class RecebeBuscConsultaMedico extends HttpServlet {

     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
         
        int crm = Integer.parseInt(req.getParameter("CRMdig"));
        
        Medico meds = new Medico();
        MedicoDAO crudAluno = new MedicoDAO();
 
        meds = crudAluno.buscarMedicoCRM(crm);
        
        PrintWriter saida = resp.getWriter();
        
        saida.print("medico cem: "+meds.getCrm());
        
        if(meds.getCrm()==0){
            resp.sendRedirect("/Hostal_Web_2/viewConsulta/CadastraConsulta.jsp");
        } else{
          resp.sendRedirect("/Hostal_Web_2/viewConsulta/CadastraConsulta_2.jsp?crm="+ meds.getCrm());
  
        }
       
     
     }
}
