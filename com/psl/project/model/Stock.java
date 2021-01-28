package com.psl.project.model;

import java.sql.Date;

public class Stock {
	private String stockID;
	private Date mfgDate;
	private Date expDate;
	private int quantityBought;
	private int quantityAvailable;
	
	public Stock() {
		
	}

	public Stock(String stockID, Date mfgDate, Date expDate, int quantityBought, int quantityAvailable) {
		this.stockID = stockID;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.quantityBought = quantityBought;
		this.quantityAvailable = quantityAvailable;
	}

	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockID) {
		this.stockID = stockID;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public int getQuantityBought() {
		return quantityBought;
	}

	public void setQuantityBought(int quantityBought) {
		this.quantityBought = quantityBought;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", quantityBought="
				+ quantityBought + ", quantityAvailable=" + quantityAvailable + "]";
	}

	
	
}
