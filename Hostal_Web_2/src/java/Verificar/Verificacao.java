/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verificar;


import controllerDAO.PacienteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Verificacao {
    
  public  int erro =0;
    
   public String verif_num (String let){       
            try {
            Integer.valueOf(let);
            
            if(Integer.parseInt(let)>=0){   
                if(erro==0){         
                } else{
                    erro=erro+1;
                }                
            }else{
                JOptionPane.showMessageDialog(null, "ERRO: negativo "+let);
                erro=erro+1;
            }
              } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "ERRO: invalido "+let);
                    erro=erro+1;
             }
      return null;          
    }
    
   public String verif_let (String let){ 
       
      
       try {
            Integer.valueOf(let);
            
            if(Integer.parseInt(let)>=0){   
                JOptionPane.showMessageDialog(null, "ERRO: "+let);
                erro=erro+1;
            }else{
                JOptionPane.showMessageDialog(null, "ERRO: "+let+" negativo");
                erro=erro+1;
            }
              } catch (Exception e) {
                 if(erro==0){         
                } else{
                    erro=erro+1;
                }        
             }
       
      return null;
       
    }
    
   public String verif_nulo (String let){ 
       
       if(let==null){
           JOptionPane.showMessageDialog(null, "ERRO: Nulo "+let);
           erro=erro+1;
       }
       
       if("".equals(let)){
           JOptionPane.showMessageDialog(null, "ERRO: Vazio "+let);
           erro=erro+1;
       }
      
      return null;
       
    }
   
     
   public String verif_vazio (String let){ 
       
       if(let==null){
         
       } else if("".equals(let)){
           
       } else{
           this.verif_num(let);
       }
      
      return null;
       
    }
   
   public String verifCPF(String cpf){
       
       PacienteDAO p = new PacienteDAO();
       p.VeriPacienteCPF(cpf);
       
      if(p.cpf_v.equals(cpf)){          
           erro=erro+1;
            JOptionPane.showMessageDialog(null, "ERRO: CPF ja cadastrado ");
      }else{
          
      }
       
      return null;
       
    
}
   
   
   
}
