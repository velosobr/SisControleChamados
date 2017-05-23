/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscontrolechamados;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Allan
 */
public class ControladorChamados implements IControladorChamados {

    private ArrayList<TipoChamado> tiposChamado;
    private ArrayList<Chamado> chamados;

    public ControladorChamados() {
        this.chamados = new ArrayList<>();
        this.tiposChamado = new ArrayList<>();
    }

    public int getTotalChamadosPorTipo(TipoChamado tipo) {
        int totalChamados = 0;
        for (Chamado chamado : chamados) {
            if (chamado.getTipo() == tipo) {
                totalChamados++;
            }
        }
        return totalChamados;
    }

    @Override
    public IChamado incluiChamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, TipoChamado tipo) {
        Chamado novoChamado = new Chamado(data, cliente, descricao, prioridade, tecnico, tipo, titulo);
        chamados.add(novoChamado);
        return (IChamado) novoChamado;
    }

    @Override
    public ITipoChamado incluiTipoChamado(int codigo, String nome, String descricao) {
        TipoChamado novoTipoChamado = new TipoChamado(codigo, descricao, nome);
        tiposChamado.add(novoTipoChamado);
        return (ITipoChamado) novoTipoChamado;
    }
}
