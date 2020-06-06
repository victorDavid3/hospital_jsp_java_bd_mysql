/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlerServlet;

import controllerDAO.MedicoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Medico;

/**
 *
 * @author victo
 */
@WebServlet(name = "RecebeCadasMedico", urlPatterns = {"/RecebeCadasMedico"})
public class RecebeCadasMedico extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         Medico medico = new Medico();
    
        String jtCRM = (req.getParameter("CRM"));
        String jtNome = (req.getParameter("nome"));
        String jText_tele1 = (req.getParameter("numeroTel_1"));
        String jText_tele2 = (req.getParameter("numeroTel_2"));
        String jTextField_numero = (req.getParameter("numero"));
       String jTextField_rua = (req.getParameter("rua"));
       String jTextField_bairro = (req.getParameter("bairro"));
       String jTextField_cidade = (req.getParameter("cidade"));
       String jComboBox_estados = (req.getParameter("estado"));
       
        medico.setCrm(Integer.parseInt(jtCRM));
        medico.setNome(jtNome);
        
        medico.setTel_1(jText_tele1);
        medico.setTel_2(jText_tele2); 
        
        medico.setEndere_numero(jTextField_numero);
        medico.setRua(jTextField_rua);
        medico.setBairro(jTextField_bairro);
        medico.setCidade(jTextField_cidade);
        medico.setEstado(String.valueOf(jComboBox_estados));
        
        MedicoDAO crudMedico = new MedicoDAO();
        
        crudMedico.salvarMedico(medico);
        
        resp.sendRedirect("/Hostal_Web_2/viewMedico/RecebCadastroMedico.jsp?nome="+ jtNome );           

       
    }
    
}
