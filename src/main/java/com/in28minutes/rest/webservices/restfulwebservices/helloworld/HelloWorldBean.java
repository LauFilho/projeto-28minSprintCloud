package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {


    private String mensagem;

    public HelloWorldBean(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}
