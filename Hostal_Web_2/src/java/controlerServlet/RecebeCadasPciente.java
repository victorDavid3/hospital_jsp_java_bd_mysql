/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlerServlet;

import controllerDAO.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Paciente;

/**
 *
 * @author victo
 */
@WebServlet(name = "RecebeCadasPciente", urlPatterns = {"/RecebeCadasPciente"})
public class RecebeCadasPciente extends HttpServlet {

    
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Paciente paci = new Paciente();
             
        String jtCPF = (req.getParameter("CPF"));
        String jtNome = (req.getParameter("nome"));
        String jtData = (req.getParameter("data"));
        String jText_tele1 = (req.getParameter("numeroTel_1"));
        String jText_tele2 = (req.getParameter("numeroTel_2"));
        String jTextField_numero = (req.getParameter("numero"));
       String jTextField_rua = (req.getParameter("rua"));
       String jTextField_bairro = (req.getParameter("bairro"));
       String jTextField_cidade = (req.getParameter("cidade"));
       String jComboBox_estados = (req.getParameter("estado"));
       
        paci.setCadas_CPF(jtCPF);
        paci.setCadas_nome(jtNome);
        String data = (String.valueOf (jtData));
        paci.setCadas_Idade(data);
        
        paci.setTel_1(jText_tele1);
        paci.setTel_2(jText_tele2); 
        
        paci.setEndere_numero(jTextField_numero);
        paci.setRua(jTextField_rua);
        paci.setBairro(jTextField_bairro);
        paci.setCidade(jTextField_cidade);
        paci.setEstado(String.valueOf(jComboBox_estados));
        
        PacienteDAO crudPaciente = new PacienteDAO();
        crudPaciente.salvarPaciente(paci);
    
       resp.sendRedirect("/Hostal_Web_2/viewPaciente/RecebCadastroPaciente.jsp?nome="+ jtNome );           

        
       }
    
}
