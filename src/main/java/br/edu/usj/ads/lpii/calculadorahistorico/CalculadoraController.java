package br.edu.usj.ads.lpii.calculadorahistorico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CalculadoraController {

    @Autowired
    OperacaoRepository operacaoRepository;
    
    
    @PostMapping(value="/calcula")

    public ModelAndView postCalcula(@RequestParam String numero1, @RequestParam String numero2) {

        Double n1 = Double.parseDouble(numero1);
        Double n2 = Double.parseDouble(numero2);
        Double resultado = n1 + n2;

        String operacaoString = n1 + " + " + n2 + " = " + resultado.toString();
        
        Operacao operacao = new Operacao();
        operacao.setOperacao(operacaoString);

        operacaoRepository.save(operacao);
        


        
        ModelAndView modelAndView = new ModelAndView("index");

        
        modelAndView.addObject("resultado", resultado);
        modelAndView.addObject("historico", operacaoRepository.findAll());
        return modelAndView;
    }
   
}