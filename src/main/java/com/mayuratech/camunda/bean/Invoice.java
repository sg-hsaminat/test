package com.mayuratech.camunda.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="invoice_number")
	private String invoiceNumber;
	
	@Column
	private String metadata;
	
	@Column
	private String status;
	
	@Column
	private String notes;
	
	@Column
	private String version;
	
	@Column(name="invoice_amount")
	private Integer invoiceAmount;
	
	@Column(name="no_of_documents")
	private Integer noOfDocuments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Integer invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Integer getNoOfDocuments() {
		return noOfDocuments;
	}

	public void setNoOfDocuments(Integer noOfDocuments) {
		this.noOfDocuments = noOfDocuments;
	}
}
