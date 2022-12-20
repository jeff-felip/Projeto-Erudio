package br.com.felipjeff.projetoerudio.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class sumController {

    @GetMapping("/soma/{nunOne}/{nunTwo}")
    @ResponseBody
    private Double soma(@PathVariable Double nunOne, @PathVariable Double nunTwo){System.out.println(nunOne +" + "+nunTwo+" = "+(nunOne+nunTwo));
        return (nunOne + nunTwo);
    }


}
