package com.mayuratech.camunda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.camunda.bean.Invoice;
import com.mayuratech.camunda.repository.InvoiceRepository;
import com.mayuratech.camunda.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{
	
	@Autowired
	InvoiceRepository invoiceRepository;

	@Override
	public List<Invoice> getAllInvoice() {
		return invoiceRepository.findAll();
	}
	
	@Override
	public Optional<Invoice> getInvoiceByInvoiceNumber(String invoiceNo) {
		return invoiceRepository.findByInvoiceNumber(invoiceNo);
	}
	
	@Override
	public void addNewInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	@Override
	public void updateInvoice(Invoice invoice) {
		Optional<Invoice> invoiceRequest = invoiceRepository.findByInvoiceNumber(invoice.getInvoiceNumber());
		invoice.setId(invoiceRequest.get().getId());
		invoice.setMetadata(invoiceRequest.get().getMetadata());
		invoice.setInvoiceAmount(invoiceRequest.get().getInvoiceAmount());
		invoiceRepository.save(invoice);
	}

}
