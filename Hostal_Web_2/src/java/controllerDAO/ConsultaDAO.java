package controllerDAO;

import connection.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Consulta;
import model.Medico;
import model.Paciente;

public class ConsultaDAO {
    private String ordem ="cod_consulta";
    //Classe que criamos para conectar e desconectar ao banco
    private ConexaoBD conn = new ConexaoBD();
    
    Consulta a = new Consulta();

    public void salvarConsulta(Consulta consulta) {
        conn.conectarBD();
     
        String sql = "insert into consulta(hora_consulta, dia_consulta, descricao, CPF_Paciente_Consulta, CRM_Medico_Consulta)values(?,?,?,?,?)";
 
        PreparedStatement pst;
        try {
        
            pst = conn.conexao.prepareStatement(sql);
         
            pst.setString(1, consulta.getCadas_hora());
            pst.setString(2, consulta.getCadas_dia());
      
            pst.setString(3, consulta.getCadas_descri());
            pst.setString(4, consulta.getConsul_paci_cpf());
     
            pst.setString(5, consulta.getConsul_medico_crm());
          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Consulta cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar Consulta\n" + ex);
        }
    }

    public List<Consulta> listarConsultas() {
      
        List<Consulta> consultas = new ArrayList();
        conn.conectarBD();
        PreparedStatement ps = null;

        ResultSet rs = null;
        try {
            ps = conn.conexao.prepareStatement("Select * from consulta order by "+this.ordem);
            rs = ps.executeQuery();
            //enquanto tiver resultado
            while (rs.next()) {
                //cria o objeto
                Consulta a = new Consulta();
                a.setConsul_numero(rs.getInt("cod_consulta"));
                a.setConsul_paci_cpf(rs.getString("CPF_Paciente_Consulta"));
              
                a.setCadas_hora(rs.getString("hora_consulta"));
                a.setCadas_dia(rs.getString("dia_consulta"));
                a.setCadas_descri(rs.getString("descricao"));
    
            
                a.setConsul_medico_crm(rs.getString("CRM_Medico_Consulta"));
                //adiciona na lista
                consultas.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar consultas" + ex);
        }
        conn.desconectarBD();
        //retorna a lista para tela que chamou o método
        return consultas;
    }

    public String ordenar(String tipo){
        if("Nome paciente".equals(tipo)){
            this.ordem="nome_paciente_consulta";
        } else if("Codigo consulta"==tipo){
            this.ordem="cod_consulta";
        } else if("Nome medico"==tipo){
            this.ordem="Nome_Medico_Consulta";
        }else if("CRM medico"==tipo){
            this.ordem="CRM_Medico_Consulta";
        } else if("CPF paciente"==tipo){
            this.ordem="CPF_Paciente_Consulta";
        } else{
             JOptionPane.showMessageDialog(null, "Erro ao ordenar");
        }
            
         return null;
    }
    
}

