package br.edu.usj.ads.lpii.calculadorahistorico;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperacaoRepository extends CrudRepository<Operacao, Long> {
    List<Operacao> findAll();
    
}