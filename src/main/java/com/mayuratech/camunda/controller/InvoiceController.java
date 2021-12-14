package com.mayuratech.camunda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.camunda.bean.Invoice;
import com.mayuratech.camunda.service.InvoiceService;

@RestController
@RequestMapping("/camunda")
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping("/getAllInvoice")
	public List<Invoice> getAllInvoice() {
		return invoiceService.getAllInvoice();
	}
	
	@GetMapping("/getInvoiceByInvoiceNumber/{invoiceNo}")
	public Optional<Invoice> getInvoiceByInvoiceNumber(@PathVariable String invoiceNo) {
		return invoiceService.getInvoiceByInvoiceNumber(invoiceNo);
	}
	
	@PostMapping("/addNewInvoice")
	public String addNewInvoice(@RequestBody Invoice invoice) {
		invoiceService.addNewInvoice(invoice);
		return "Invoice added successfully";
	}
	
	@PostMapping("/updateInvoice")
	public String updateInvoice(@RequestBody Invoice invoice) {
		
		invoiceService.updateInvoice(invoice);
		return "Invoice updated successfully";
	}

}
