/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscontrolechamados;

import java.util.Date;

/**
 *
 * @author Allan
 */
public class Chamado implements IChamado {
    private Date data;
    private Cliente cliente;
    private String descricao;
    private int prioridade;
    private Tecnico tecnico;
    private TipoChamado tipo;
    private String titulo;

    public Chamado(Date data, Cliente cliente, String descricao, int prioridade, Tecnico tecnico, TipoChamado tipo, String titulo) {
        this.data = data;
        this.cliente = cliente;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.tecnico = tecnico;
        this.tipo = tipo;
        this.titulo = titulo;
    }
    
    @Override
    public Cliente getCliente(){
        return cliente;
    }
    
    @Override
    public String getDescricao(){
        return descricao;
    }
    
    @Override
    public int getPrioridade(){
        return prioridade;
    }
    
    @Override
    public Tecnico getTecnico(){
        return tecnico;
    }
    
    @Override
    public TipoChamado getTipo(){
        return tipo;
    }
    
    @Override
    public String getTitulo(){
        return titulo;
    }
    
    

}
