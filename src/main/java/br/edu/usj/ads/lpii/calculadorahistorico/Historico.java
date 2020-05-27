package br.edu.usj.ads.lpii.calculadorahistorico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    List<Operacao> listaOperacoes = new ArrayList<>();

    void adicionar(Operacao operacao) {
        listaOperacoes.add(operacao);
    }

    List<Operacao> getHistorico(){
        return listaOperacoes;
    }

}