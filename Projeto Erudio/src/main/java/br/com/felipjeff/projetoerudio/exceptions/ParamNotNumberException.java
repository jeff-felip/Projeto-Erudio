package br.com.felipjeff.projetoerudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParamNotNumberException extends RuntimeException{
    public ParamNotNumberException(String ex) {
        super(ex);
    }
}
