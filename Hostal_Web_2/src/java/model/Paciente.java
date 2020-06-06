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
public class Paciente extends Pessoa{
    
  private int num_Paciente;           
  private  String Cadas_nome;
  private  String Cadas_CPF;
  private String Cadas_Idade;

    public int getNum_Paciente() {
        return num_Paciente;
    }

    public void setNum_Paciente(int num_Paciente) {
        this.num_Paciente = num_Paciente;
    }

    public String getCadas_nome() {
        return Cadas_nome;
    }

    public void setCadas_nome(String Cadas_nome) {
        this.Cadas_nome = Cadas_nome;
    }

    public String getCadas_CPF() {
        return Cadas_CPF;
    }

    public void setCadas_CPF(String Cadas_CPF) {
        this.Cadas_CPF = Cadas_CPF;
    }

    public String getCadas_Idade() {
        return Cadas_Idade;
    }

    public void setCadas_Idade(String Cadas_Idade) {
        this.Cadas_Idade = Cadas_Idade;
    }
  
    
}
