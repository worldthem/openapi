package com.apitest.openapi.entities;


import com.apitest.openapi.dto.InvoicesDto;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.awt.print.Book;
import java.time.LocalDateTime;

@Entity
 //@NamedStoredProcedureQuery(name = "getInvoicesCount", procedureName = "GET_COUNT_FROM_SERVICES", resultClasses = Invoices.class)

@Table(name = "invoices")
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100)
    private String number;

    @Column(columnDefinition="Decimal(10,2)")
    private Float balance;

    @Column(length = 10)
    private String curency;

    @UpdateTimestamp
    private LocalDateTime updated;
    @Transient
    private Integer RowCont;

    public Integer getRowCont() {
        return RowCont;
    }

    public Invoices() {}

    public Invoices(Integer id, String number, Float balance, String curency, LocalDateTime updated) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.curency = curency;
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
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
