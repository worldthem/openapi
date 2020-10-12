package com.apitest.openapi.services;

import com.apitest.openapi.dto.InvoicesDto;
import com.apitest.openapi.entities.Invoices;
import com.apitest.openapi.repositories.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class InvoiceService {

    @Autowired
    protected InvoicesRepository invoicesRepository;

    @GetMapping("/invoices/all")
    public List<Invoices> findAll(){
        return invoicesRepository.getAllDataFromInvoices();
    }
    @GetMapping("/invoices/by-id/{id}")
    public Invoices findById(@PathVariable int id){
        return invoicesRepository.getDataFromInvoicesByID(id);
    }



   /*
     @RequestMapping
     public Iterable<Invoices> findAll(){
         return invoicesRepository.getAllDataFromInvoices();
     }

    */
}
