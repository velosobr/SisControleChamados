/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscontrolechamados;

/**
 *
 * @author Allan
 */
public interface IChamado {
    
    public Cliente getCliente();

    public String getDescricao();

    public int getPrioridade();

    public Tecnico getTecnico();

    public TipoChamado getTipo();

    public String getTitulo();
    
}
