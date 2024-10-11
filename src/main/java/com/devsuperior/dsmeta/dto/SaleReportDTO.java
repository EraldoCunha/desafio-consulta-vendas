package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

import java.time.LocalDate;

public class SaleReportDTO {

	private Long id;
	private LocalDate date;
	private Double amount;
	private String sellerName;

	public SaleReportDTO(Long id,LocalDate date,  Double amount, String seller) {
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.sellerName = seller;
	}

	public SaleReportDTO(Sale entity) {
		id = entity.getId();
		date = entity.getDate();
		amount = entity.getAmount();
		sellerName = entity.getSeller().getName();
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public String getSellerName() {
		return sellerName;
	}
}
