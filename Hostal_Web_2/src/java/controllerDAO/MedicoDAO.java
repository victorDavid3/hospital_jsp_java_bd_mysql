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
import model.Medico;

public class MedicoDAO {
     private String ordem ="Cod_Medico";
     
 
    private ConexaoBD conn = new ConexaoBD();
    public String nome_m;
    Medico a = new Medico();

    public void salvarMedico(Medico medico) {
        conn.conectarBD();

        String sql = "insert into medico(CMR_Medico, Nome_Medico, Endere_Numero, Rua, Bairro, Cidede, Estado, Tele_1, Tele_2) values(?,?,?,?,?,?,?,?,?)";

        PreparedStatement pst;
        try {
     
            pst = conn.conexao.prepareStatement(sql);

            pst.setInt(1, medico.getCrm());
            pst.setString(2, medico.getNome());
           pst.setString(3, medico.getEndere_numero());
            pst.setString(4, medico.getRua());
            pst.setString(5, medico.getBairro());
            pst.setString(6, medico.getCidade());
            pst.setString(7, medico.getEstado());
            pst.setString(8, medico.getTel_1());
            pst.setString(9, medico.getTel_2());
  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medico cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar medico\n" + ex);
        }
    }
   


    public Medico buscarMedicoCRM(int CRM) {
        String sql = "select * from medico where CMR_Medico = " + CRM;
        conn.conectarBD();
        PreparedStatement ps;
        
        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
            
            rs = ps.executeQuery();
           
            rs.first();
     
            a.setCrm(rs.getInt("CMR_Medico"));
      
            a.setNome(rs.getString("Nome_Medico"));     
            nome_m = (rs.getString("Nome_Medico"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CRM não cadastado");
        }

        conn.desconectarBD();
     
        return a;
    }

    public Medico buscarMedicoNome(String nome) {
     
        String sql = "select * from medico where Nome_Medico like'%" + nome + "%'";
        conn.conectarBD();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.first();
            a.setCrm(rs.getInt("CMR_Medico"));
            a.setNome(rs.getString("Nome_Medico"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nome não encontrado");
        }

        conn.desconectarBD();
        return a;
    }

    public List<Medico> listarMedicos() {

        List<Medico> medicos = new ArrayList();
        conn.conectarBD();
        PreparedStatement ps = null;
      
        ResultSet rs = null;
        try {
            ps = conn.conexao.prepareStatement("Select * from medico order by "+ordem);
            rs = ps.executeQuery();
         
            while (rs.next()) {
       
                Medico a = new Medico();
                a.setCrm(rs.getInt("CMR_Medico"));
                a.setNome(rs.getString("Nome_Medico"));
                a.setCod_medico(rs.getString("Cod_Medico"));
                a.setTel_1(rs.getString("Tele_1"));
                a.setTel_2(rs.getString("Tele_2"));
                a.setEndere_numero(rs.getString("Endere_Numero"));
                a.setRua(rs.getString("Rua"));
                a.setBairro(rs.getString("Bairro"));
                a.setCidade(rs.getString("Cidede"));
                a.setEstado(rs.getString("Estado"));
      
                medicos.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar os medicos" + ex);
        }
        conn.desconectarBD();
      
        return medicos;
    }
    
     
    public String ordenar(String tipo){
        if("Codigo medico".equals(tipo)){
            this.ordem="Cod_Medico";
        } else if("Nome medico"==tipo){
            this.ordem="Nome_Medico";
        } else if("CRM medico"==tipo){
            this.ordem="CMR_Medico";
        } else{
             JOptionPane.showMessageDialog(null, "Erro ao ordenar");
        }
            
         return null;
    }

  
  
}

