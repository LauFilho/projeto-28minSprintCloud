package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse extends Exception {
    private Date timestamp;
    private String mensagem;
    private String detail;
}

