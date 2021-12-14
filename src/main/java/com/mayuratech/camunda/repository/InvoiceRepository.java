package com.mayuratech.camunda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayuratech.camunda.bean.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, String>{
	
	Optional<Invoice> findByInvoiceNumber(String invoiceNo);

}
