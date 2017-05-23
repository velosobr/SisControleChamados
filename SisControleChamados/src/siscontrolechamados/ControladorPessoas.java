/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscontrolechamados;

import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class ControladorPessoas implements IControladorPessoas {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Tecnico> tecnicos;
    
    public ControladorPessoas(){
        this.clientes = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
     public ArrayList<Tecnico> getTecnicos(){
         return tecnicos;
     }

     public IPessoa incluiCliente(int codigo, String nome){
         Cliente novoCliente = new Cliente (codigo, nome);
         this.clientes.add(novoCliente);
         return (IPessoa) novoCliente;
     }
     
    public IPessoa incluiTecnico(int codigo, String nome){
        Tecnico novoTecnico = new Tecnico (codigo, nome);
        this.tecnicos.add(novoTecnico);
        return (IPessoa) novoTecnico;
    }
}
