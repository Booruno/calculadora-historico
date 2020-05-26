package br.edu.usj.ads.lpii.calculadorahistorico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    List<String> listaOperacoes = new ArrayList<>();

    void adicionar(String operacao) {
        listaOperacoes.add(operacao);
    }

    List<String> getHistorico(){
        return listaOperacoes;
    }

}