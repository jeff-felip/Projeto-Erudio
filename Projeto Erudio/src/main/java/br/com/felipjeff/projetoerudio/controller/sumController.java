package br.com.felipjeff.projetoerudio.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class sumController {

    @GetMapping("/sum/{nunOne}/{nunTwo}")
    @ResponseBody
    private String soma(@PathVariable Double nunOne, @PathVariable Double nunTwo, @RequestParam String operation){
        if(operation.equals(".")){
            return nunOne+" + "+nunTwo+" = "+(nunOne+nunTwo);
        }else if(operation.equals("-")){
            return nunOne+" - "+nunTwo+" = "+(nunOne - nunTwo);
        }else if(operation.equals("*")){
            return nunOne+" * "+nunTwo+" = "+(nunOne * nunTwo);
        }else if(operation.equals("/")){
            return nunOne+" / "+nunTwo+" = "+(nunOne / nunTwo);
        }else{
            return "ERRO: Operação não encontrada!";
        }
    }


}
