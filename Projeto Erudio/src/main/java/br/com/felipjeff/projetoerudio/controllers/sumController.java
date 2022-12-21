package br.com.felipjeff.projetoerudio.controllers;

import br.com.felipjeff.projetoerudio.exceptions.ParamNotNumberException;
import org.springframework.web.bind.annotation.*;
import br.com.felipjeff.projetoerudio.MathOperations;

@RestController
public class sumController extends MathOperations{

    @GetMapping("/sum/{nunOne}/{nunTwo}")
    @ResponseBody
    private String soma(@PathVariable Double nunOne, @PathVariable Double nunTwo) throws Exception{
       return somar(nunOne, nunTwo);
    }

    @GetMapping("/sub/{nunOne}/{nunTwo}")
    @ResponseBody
    private String subtracao(@PathVariable Double nunOne, @PathVariable Double nunTwo) throws Exception{
        return subtrair(nunOne, nunTwo);
    }

    @GetMapping("/mult/{nunOne}/{nunTwo}")
    @ResponseBody
    private String multiplicacao(@PathVariable Double nunOne, @PathVariable Double nunTwo) throws Exception{
        return multiplicar(nunOne, nunTwo);
    }

    @GetMapping("/div/{nunOne}/{nunTwo}")
    @ResponseBody
    private String divisao(@PathVariable Double nunOne, @PathVariable Double nunTwo) throws Exception{
        return dividir(nunOne, nunOne);
    }

    @GetMapping("/media/{nunOne}/{nunTwo}")
    @ResponseBody
    private String mediaSimplis(@PathVariable Double nunOne, @PathVariable Double nunTwo) throws Exception{
        return media(nunOne, nunTwo);
    }

    @GetMapping("/raizq/{nunOne}")
    @ResponseBody
    private String raizQ(@PathVariable Double nunOne) throws Exception{
        return raizQuadrada(nunOne);
    }


}
