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
import model.Paciente;
import model.Pessoa;

public class PacienteDAO {
    private String ordem ="Num_Paciente";
    
    private ConexaoBD conn = new ConexaoBD();
    
    Paciente a = new Paciente();
    
   public String nome_p;
   public String cpf_v ="";  

    public void salvarPaciente(Paciente paciente ) {
        
        conn.conectarBD();
     
        String sql = "insert into paciente(CPF_Paciente, Nome_Paciente, Idade_Paciente, Tele_1_Paciente, Tele_2_Paciente, Nemero_Endere_Paciente, Rua_Endere_Paciente, Bairro_Endere_Paciente, Cidade_Endere_Paciente, Estado_Endere_Paciente) values(?,?,?,?,?,?,?,?,?,?)";
    
        PreparedStatement pst;
        try {
     
            pst = conn.conexao.prepareStatement(sql);
            pst.setString(1, paciente.getCadas_CPF());
            pst.setString(2, paciente.getCadas_nome());
            pst.setString(3, paciente.getCadas_Idade());
        
            pst.setString(4, paciente.getTel_1());
            pst.setString(5, paciente.getTel_2());
            pst.setString(6, paciente.getEndere_numero());
            pst.setString(7, paciente.getRua());
            pst.setString(8, paciente.getBairro());
            pst.setString(9, paciente.getCidade());
            pst.setString(10, paciente.getEstado());
                    
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar paciente\n" + ex);
        }
    }
    
   


    public Paciente buscarPacienteCPF(String CPF) {
        String sql = "select * from paciente where CPF_Paciente = " + CPF;
        conn.conectarBD();
        PreparedStatement ps;
       
        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
          
            rs = ps.executeQuery();
           
            rs.first();
          
            a.setCadas_CPF(rs.getString("CPF_Paciente"));
            a.setCadas_nome(rs.getString("Nome_Paciente"));  
            nome_p = (rs.getString("Nome_Paciente")); 
            
               
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "CPF não cadastrado");
            
         
        }

        conn.desconectarBD();
       
        return a;
    }

    public Paciente buscarPacienteNome(String nome) {
     
        String sql = "select * from paciente where Nome_Paciente like'%" + nome + "%'";
        conn.conectarBD();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.first();
            a.setCadas_CPF(rs.getString("CPF_Paciente"));
            a.setCadas_nome(rs.getString("Nome_Paciente"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nome não encontrado");
        }

        conn.desconectarBD();
        return a;
    }

    public List<Paciente> listarPacientes() {
 
        List<Paciente> pacientes = new ArrayList();
        conn.conectarBD();
        PreparedStatement ps = null;
     
        ResultSet rs = null;
        try {
            ps = conn.conexao.prepareStatement("Select * from paciente order by "+ordem);
            rs = ps.executeQuery();
       
            while (rs.next()) {
              
                Paciente a = new Paciente();
                a.setCadas_CPF(rs.getString("CPF_Paciente"));
                a.setCadas_nome(rs.getString("Nome_Paciente"));
                 a.setNum_Paciente(rs.getInt("Num_Paciente"));
                 a.setCadas_Idade(rs.getString("Idade_Paciente"));
                 a.setTel_1(rs.getString("Tele_1_Paciente"));
                 a.setTel_2(rs.getString("Tele_2_Paciente"));
                 a.setEstado(rs.getString("Estado_Endere_Paciente"));
                 a.setCidade(rs.getString("Cidade_Endere_Paciente"));
                 a.setBairro(rs.getString("Bairro_Endere_Paciente"));
                 a.setRua(rs.getString("Rua_Endere_Paciente"));
                 a.setEndere_numero(rs.getString("Nemero_Endere_Paciente"));
                 
            
                pacientes.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar os pacientes" + ex);
        }
        conn.desconectarBD();
       
        return pacientes;
    }
    
    public String ordenar(String tipo){
        if("Nome paciente".equals(tipo)){
            this.ordem="Nome_Paciente";
        } else if("Idade paciente"==tipo){
            this.ordem="Idade_Paciente";
        } else if("Estado paciente"==tipo){
            this.ordem="Estado_Endere_Paciente";
        }else if("Codigo paciente"==tipo){
            this.ordem="Num_Paciente";
        } else if("CPF paciente"==tipo){
            this.ordem="CPF_Paciente";
        } else{
             JOptionPane.showMessageDialog(null, "Erro ao ordenar");
        }
            
         return null;
    }
    
    public Paciente VeriPacienteCPF(String cpf) {
        String sql = "select * from paciente where CPF_Paciente = " + cpf;
        conn.conectarBD();
        PreparedStatement ps;
       
        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
          
            rs = ps.executeQuery();
           
            rs.first();
          
            a.setCadas_CPF(rs.getString("CPF_Paciente"));
            a.setCadas_nome(rs.getString("Nome_Paciente"));  
            nome_p = (rs.getString("Nome_Paciente")); 
            cpf_v =(rs.getString("CPF_Paciente"));
               
        } catch (SQLException ex) {
            
        }

        conn.desconectarBD();
       
        return a;
    }

   
  
   
 
}

