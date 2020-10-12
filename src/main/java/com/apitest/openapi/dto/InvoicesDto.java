package com.apitest.openapi.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
@Component
public class InvoicesDto {
    private Integer id;
    private String number;
    private Float balance;
    private String curency;
    InvoicesDto() {}
    public InvoicesDto(Integer id, String number, Float balance, String curency) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.curency = curency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getCurency() {
        return curency;
    }

    public void setCurency(String curency) {
        this.curency = curency;
    }
}
