/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewConsulta;

import Verificar.Verificacao;
import controllerDAO.ConsultaDAO;
import viewPaciente.*;
import viewMedico.*;
import controllerDAO.MedicoDAO;
import controllerDAO.PacienteDAO;
import model.Consulta;
import model.Medico;
import model.Paciente;

/**
 *
 * @author Anderson
 */
public class CadastroConsulta extends javax.swing.JFrame {
    
   
  
   
   

    /**
     * Creates new form CadastroAluno
     */
    public CadastroConsulta() {
        initComponents();
        listAno();
        listMes();
       listDias();
      listHora();     
    }
      
    public void listAno(){
        int ano =2019;
         jComboBox_ano.removeAllItems();
         while(ano<2022){
            
            jComboBox_ano.addItem(ano);
            ano=ano+1;
        }
    }
    
   public void listMes(){
       
       int mes =0;
        jComboBox_mes.removeAllItems();
                   
        while(mes<12){
            mes=mes+1;
            jComboBox_mes.addItem(mes);
            
        }
  
   }
    
    public void listDias(){
        int dia =0;
        jComboBox_dia.removeAllItems();
                   
        while(dia<31){
            dia=dia+1;
            jComboBox_dia.addItem(dia);
            
        }
    }
    
    public void listHora(){
        int hora =0;
        jComboBox_hora.removeAllItems();
          
        while(hora<24){
            jComboBox_hora.addItem(hora);
            hora=hora+1;
        }
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCadastrar = new javax.swing.JButton();
        jButton_ir_menu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_mes = new javax.swing.JComboBox();
        lblMensagem1 = new javax.swing.JLabel();
        jComboBox_dia = new javax.swing.JComboBox();
        jComboBox_ano = new javax.swing.JComboBox();
        lblMensagem5 = new javax.swing.JLabel();
        lblMensagem6 = new javax.swing.JLabel();
        lblMensagem4 = new javax.swing.JLabel();
        jComboBox_hora = new javax.swing.JComboBox();
        lblMensagem2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_sintomas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jtCPFBuscaPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNomeBuscaPaciente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtNomeBuscaMedico = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jtNome_medi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCMR = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jtCRMBuscaMedico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jButton_ir_menu.setText("< voltar");
        jButton_ir_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ir_menuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel5.setText("Dia da consulta");

        jComboBox_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_mesActionPerformed(evt);
            }
        });

        lblMensagem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem1.setText("Horas");

        jComboBox_dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_diaActionPerformed(evt);
            }
        });

        jComboBox_ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_anoActionPerformed(evt);
            }
        });

        lblMensagem5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem5.setText("Mes");

        lblMensagem6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem6.setText("Ano");

        lblMensagem4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem4.setText("Dia");

        jComboBox_hora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMensagem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem2.setText("Sintomas do paciente");

        jTextArea_sintomas.setColumns(20);
        jTextArea_sintomas.setRows(5);
        jScrollPane1.setViewportView(jTextArea_sintomas);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF");

        jLabel6.setText("Nome");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtNome.setEnabled(false);

        jLabel3.setText("Nome");

        jLabel2.setText("CPF");

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel1.setText("Buscar de medico");

        jtCPF.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel7.setText("Cadastro de consulta");

        jLabel8.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel8.setText("Buscar de paciente");

        jtNomeBuscaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeBuscaMedicoActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtNome_medi.setEnabled(false);

        jLabel9.setText("Nome");

        jLabel10.setText("CRM");

        jtCMR.setEnabled(false);
        jtCMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCMRActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("CRM");

        jLabel12.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jtCPFBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(jtNomeBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblMensagem2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addComponent(jtCRMBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jtNomeBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addComponent(jtCMR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addComponent(jtNome_medi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton_ir_menu)
                .addGap(189, 189, 189)
                .addComponent(jbCadastrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensagem1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblMensagem5)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensagem6)
                    .addComponent(jComboBox_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMensagem1)
                        .addComponent(lblMensagem4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMensagem5)
                        .addComponent(lblMensagem6)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtCPFBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel6)
                    .addComponent(jtNomeBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lblMensagem2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtCRMBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel12)
                    .addComponent(jtNomeBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jtCMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtNome_medi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ir_menu)
                    .addComponent(jbCadastrar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        String let;
        Consulta cons = new Consulta();
        Verificacao Verif = new Verificacao();
        
        
        String cons_hora = String.valueOf(jComboBox_hora.getSelectedItem());
        String cons_dia = String.valueOf(jComboBox_dia.getSelectedItem());
        String cons_mes = String.valueOf(jComboBox_mes.getSelectedItem()) ;
        String cons_ano = String.valueOf(jComboBox_ano.getSelectedItem()) ;
        String cons_pacien_nome = String.valueOf(jtNome.getText()) ;
        String cons_pacien_cpf = String.valueOf(jtCPF.getText()) ;
        String descricao = String.valueOf(jTextArea_sintomas.getText());
        String cons_medico_nome = String.valueOf(jtNome_medi.getText()) ;
        String cons_medico_crm = String.valueOf(jtCMR.getText()) ;
      
        
        Verif.erro=0;
         
        let = cons_pacien_nome;
        Verif.verif_let(let);
        Verif.verif_nulo(let);
        
        let = cons_medico_nome;
        Verif.verif_let(let);
        Verif.verif_nulo(let);
        
        let = cons_medico_crm;
        Verif.verif_nulo(let);
  
        if(Verif.erro==0){
            
        cons.setCadas_hora((cons_hora));
        cons.setCadas_dia(cons_dia+ "/"+ cons_mes +"/"+ cons_ano);
     
        
        cons.setCadas_descri(descricao);   
        
        cons.setConsul_paci_cpf(cons_pacien_cpf);
   
        cons.setConsul_medico_crm(cons_medico_crm);
        
        ConsultaDAO crudConsulta = new ConsultaDAO();
        crudConsulta.salvarConsulta(cons);
        
        
        
        jtCPFBuscaPaciente.setText("");
        jtNomeBuscaPaciente.setText("");
        jtCPF.setText("");
        jtNome.setText("");
        jTextArea_sintomas.setText("");
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jButton_ir_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ir_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton_ir_menuActionPerformed

    private void jComboBox_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_mesActionPerformed

    private void jComboBox_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diaActionPerformed

    private void jComboBox_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_anoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cpf = (jtCPFBuscaPaciente.getText());
        Paciente paciente = new Paciente();
        PacienteDAO crudPaciente = new PacienteDAO();
     
        paciente = crudPaciente.buscarPacienteCPF(cpf);
      
        jtCPF.setText(String.valueOf(paciente.getCadas_CPF()));
        jtNome.setText(paciente.getCadas_nome());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String nome = jtNomeBuscaPaciente.getText();
        Paciente paciente = new Paciente();
        PacienteDAO crudPaciente = new PacienteDAO();

        paciente = crudPaciente.buscarPacienteNome(nome);
    
        jtCPF.setText(String.valueOf(paciente.getCadas_CPF()));
        jtNome.setText(paciente.getCadas_nome());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        String nome = jtNomeBuscaMedico.getText();
        Medico med = new Medico();
        MedicoDAO crudAluno = new MedicoDAO();
      
        med = crudAluno.buscarMedicoNome(nome);
      
        jtCMR.setText(String.valueOf(med.getCrm()));
        jtNome_medi.setText(med.getNome());

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        int cpd = Integer.parseInt(jtCRMBuscaMedico.getText());
        Medico meds = new Medico();
        MedicoDAO crudAluno = new MedicoDAO();
 
        meds = crudAluno.buscarMedicoCRM(cpd);
      
        jtCMR.setText(String.valueOf(meds.getCrm()));
        jtNome_medi.setText(meds.getNome());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtNomeBuscaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeBuscaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeBuscaMedicoActionPerformed

    private void jtCMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCMRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCMRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_ir_menu;
    private javax.swing.JComboBox jComboBox_ano;
    private javax.swing.JComboBox jComboBox_dia;
    private javax.swing.JComboBox jComboBox_hora;
    private javax.swing.JComboBox jComboBox_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_sintomas;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JTextField jtCMR;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtCPFBuscaPaciente;
    private javax.swing.JTextField jtCRMBuscaMedico;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeBuscaMedico;
    private javax.swing.JTextField jtNomeBuscaPaciente;
    private javax.swing.JTextField jtNome_medi;
    private javax.swing.JLabel lblMensagem1;
    private javax.swing.JLabel lblMensagem2;
    private javax.swing.JLabel lblMensagem4;
    private javax.swing.JLabel lblMensagem5;
    private javax.swing.JLabel lblMensagem6;
    // End of variables declaration//GEN-END:variables
}
