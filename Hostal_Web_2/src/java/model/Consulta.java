/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author victo
 */
public class Consulta {
  
  private  int Consul_numero;
  private  String Consul_medico_crm;
  private  String Consul_paci_cpf;
  private  String Cadas_hora;
  private  String Cadas_dia;
  private  String Cadas_descri;

    public int getConsul_numero() {
        return Consul_numero;
    }

    public void setConsul_numero(int Consul_numero) {
        this.Consul_numero = Consul_numero;
    }


    public String getConsul_paci_cpf() {
        return Consul_paci_cpf;
    }

    public void setConsul_paci_cpf(String Consul_paci_cpf) {
        this.Consul_paci_cpf = Consul_paci_cpf;
    }

    public String getCadas_hora() {
        return Cadas_hora;
    }

    public void setCadas_hora(String Cadas_hora) {
        this.Cadas_hora = Cadas_hora;
    }

    public String getCadas_dia() {
        return Cadas_dia;
    }

    public void setCadas_dia(String Cadas_dia) {
        this.Cadas_dia = Cadas_dia;
    }


  
    public String getCadas_descri() {
        return Cadas_descri;
    }

    public void setCadas_descri(String Cadas_descri) {
        this.Cadas_descri = Cadas_descri;
    }

    public String getConsul_medico_crm() {
        return Consul_medico_crm;
    }

    public void setConsul_medico_crm(String Consul_medico_crm) {
        this.Consul_medico_crm = Consul_medico_crm;
    }
  
    
   
  
    
}
