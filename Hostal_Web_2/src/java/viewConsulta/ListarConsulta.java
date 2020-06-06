/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewConsulta;

import controllerDAO.ConsultaDAO;
import controllerDAO.MedicoDAO;
import controllerDAO.PacienteDAO;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import model.Consulta;
import model.Paciente;


/**
 *
 * @author Anderson
 */
public class ListarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form ListarAlunos
     */
    public ListarConsulta() {
        initComponents();
        preencherTabel();
        preencherOrdem();
        
        
    }
    
    public void preencherOrdem(){
        jComboBox_ordem.removeAllItems();
        jComboBox_ordem.addItem("Codigo consulta");
        jComboBox_ordem.addItem("Nome paciente");
        jComboBox_ordem.addItem("CPF paciente");
        jComboBox_ordem.addItem("Nome medico");
        jComboBox_ordem.addItem("CRM medico");
        
    }
    
    public void preencherTabel(){
        String CPF;
        ConsultaDAO  cons = new ConsultaDAO();
    
        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();
        
        MedicoDAO m_dao = new MedicoDAO();
        PacienteDAO p = new PacienteDAO();
       
        for(Consulta a : cons.listarConsultas()){
            
        int CRM = Integer.valueOf(a.getConsul_medico_crm());
        m_dao.buscarMedicoCRM(CRM);     
        
        CPF = (a.getConsul_paci_cpf());
        p.buscarPacienteCPF(CPF);
   
         
        modelo.addRow(new Object[]{
        a.getConsul_numero(),
        p.nome_p,
        a.getConsul_paci_cpf(),     
        a.getCadas_hora(),
        a.getCadas_dia(),
        m_dao.nome_m,
        a.getConsul_medico_crm()
                 
        });
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlunos = new javax.swing.JTable();
        jButton_ir_menu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox_ordem = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        jLabel1.setText("Lista de consultas");

        jTAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Consulta", "Nome paciente", "CPF", "Horario", "Data", "Nome medico", "CRM "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTAlunos);

        jButton_ir_menu.setText("< voltar");
        jButton_ir_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ir_menuActionPerformed(evt);
            }
        });

        jButton1.setText("Ordenar por");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox_ordem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ordemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_ir_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_ordem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1)
                        .addComponent(jComboBox_ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_ir_menu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ir_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ir_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton_ir_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
       ConsultaDAO  cons = new ConsultaDAO();
        
       String tipo = String.valueOf(jComboBox_ordem.getSelectedItem()) ;
       cons.ordenar(tipo);
       
        String CPF;
      
    
        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();
        
        MedicoDAO m_dao = new MedicoDAO();
        PacienteDAO p = new PacienteDAO();
        
        modelo.setNumRows(0);
        
        for(Consulta a : cons.listarConsultas()){
            
        int CRM = Integer.valueOf(a.getConsul_medico_crm());
        m_dao.buscarMedicoCRM(CRM);     
        
        CPF = (a.getConsul_paci_cpf());
        p.buscarPacienteCPF(CPF);
   
         
        modelo.addRow(new Object[]{
        a.getConsul_numero(),
        p.nome_p,
        a.getConsul_paci_cpf(),     
        a.getCadas_hora(),
        a.getCadas_dia(),
        m_dao.nome_m,
        a.getConsul_medico_crm()
                 
        });
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox_ordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ordemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_ordemActionPerformed

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
            java.util.logging.Logger.getLogger(ListarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_ir_menu;
    private javax.swing.JComboBox jComboBox_ordem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlunos;
    // End of variables declaration//GEN-END:variables
}
