package br.edu.usj.ads.lpii.calculadorahistorico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CalculadoraController {

    Historico historico = new Historico();

    @PostMapping(value="/calcula")

    public ModelAndView postCalcula(@RequestParam String numero1, @RequestParam String numero2) {

        Double n1 = Double.parseDouble(numero1);
        Double n2 = Double.parseDouble(numero2);
        Double resultado = n1 + n2;

        String operacao = n1 + " + " + n2 + " = " + resultado.toString();
        historico.adicionar(operacao);

        
        ModelAndView modelAndView = new ModelAndView("index");

        
        modelAndView.addObject("resultado", resultado);
        modelAndView.addObject("historico", historico.getHistorico());
        return modelAndView;
    }
   
}