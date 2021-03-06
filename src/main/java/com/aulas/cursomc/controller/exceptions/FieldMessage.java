package com.aulas.cursomc.controller.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class FieldMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String fieldName;
    @Getter
    @Setter
    private String message;

    public FieldMessage(){

    }

    public FieldMessage(String fieldName, String message) {
        super();
        this.fieldName = fieldName;
        this.message = message;
    }
}
