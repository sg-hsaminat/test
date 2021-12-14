package com.mayuratech.camunda.service;

import java.util.List;
import java.util.Optional;

import com.mayuratech.camunda.bean.Invoice;

public interface InvoiceService {
	
	public List<Invoice> getAllInvoice();

	public Optional<Invoice> getInvoiceByInvoiceNumber(String invoiceNo);
	
	public void addNewInvoice(Invoice invoice);

	public void updateInvoice(Invoice invoice);

}
