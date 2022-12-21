package br.com.felipjeff.projetoerudio.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String menssage;
    private String details;

    public ExceptionResponse(Date timestamp, String menssage, String details) {
        this.timestamp = timestamp;
        this.menssage = menssage;
        this.details = details;
    }
}
