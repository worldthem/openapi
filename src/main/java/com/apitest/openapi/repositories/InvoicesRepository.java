package com.apitest.openapi.repositories;

import com.apitest.openapi.entities.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices, Long> {

   //@Procedure (name = "getAllDataFromInvoices")
    @Query(value = "{CALL GET_ALL_DATA}", nativeQuery = true)
    List<Invoices> getAllDataFromInvoices();

    @Query(value = "{CALL GET_DATA_FROM_INVOICES_BY_ID(:id_in)}", nativeQuery = true)
    Invoices getDataFromInvoicesByID(@Param("id_in") Integer id_in);
}
