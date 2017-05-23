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
public class TipoChamado implements ITipoChamado {
    
    private int codigo;
    private String descricao;
    private String nome;
    
    public TipoChamado (int codigo, String descricao, String nome){
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
    }
    
    @Override
    public int getCodigo(){
        return codigo;
    }

    @Override
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String getNome(){
        return nome;
    }
}
