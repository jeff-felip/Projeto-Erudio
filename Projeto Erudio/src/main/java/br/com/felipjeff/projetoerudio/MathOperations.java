package br.com.felipjeff.projetoerudio;

import br.com.felipjeff.projetoerudio.exceptions.ParamNotNumberException;
import org.springframework.web.bind.annotation.PathVariable;

public class MathOperations {
    private boolean isNumber(Double nunOne){
        if(nunOne.isNaN()){
            return false;
        }
        return true;
    }

    public String somar(Double nunOne, Double nunTwo) throws Exception{
        if(isNumber(nunOne) && isNumber(nunTwo)) {
            return nunOne + " + " + nunTwo + " = " + (nunOne + nunTwo);
        }else {
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }
    }

    public String subtrair(Double nunOne,Double nunTwo) throws Exception{
        if(isNumber(nunOne) && isNumber(nunTwo)) {
            return nunOne + " - " + nunTwo + " = " + (nunOne - nunTwo);
        }else {
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }
    }

    public String multiplicar(Double nunOne, Double nunTwo) throws Exception{
        if(isNumber(nunOne) && isNumber(nunTwo)) {
            return nunOne + " * " + nunTwo + " = " + (nunOne * nunTwo);
        }else {
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }
    }

    public String dividir(Double nunOne, Double nunTwo) throws Exception{
        if(isNumber(nunOne) && isNumber(nunTwo)) {
            return nunOne + " / " + nunTwo + " = " + (nunOne / nunTwo);
        }else {
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }
    }

    public String media( Double nunOne, Double nunTwo) throws Exception{
        if(isNumber(nunOne) && isNumber(nunTwo)){
            return "A media é: "+(nunOne + nunTwo)/2;
        }else{
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }

    }

    public String raizQuadrada( Double nunOne) throws Exception{
        if(isNumber(nunOne)){
            return "A Raiz Quadrada é: "+(Math.sqrt(nunOne));
        }else{
            throw new ParamNotNumberException("Erro: parâmetro passado não é um número!");
        }
    }
}
