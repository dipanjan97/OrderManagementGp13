package com.psl.project.model;

import java.sql.Date;

public class Stock {
	private int itemNumber;
	private Date mfgDate;
	private Date expDate;
	private int quantityBought;
	private int quantityAvailable;
	
	public Stock() {
		
	}	
	
	public Stock(int itemNumber, Date mfgDate, Date expDate, int quantityBought, int quantityAvailable) {
		super();
		this.itemNumber = itemNumber;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.quantityBought = quantityBought;
		this.quantityAvailable = quantityAvailable;
	}

	/**
	 * @return the itemNumber
	 */
	public int getItemNumber() {
		return itemNumber;
	}

	/**
	 * @param itemNumber the itemNumber to set
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * @return the mfgDate
	 */
	public Date getMfgDate() {
		return mfgDate;
	}

	/**
	 * @param mfgDate the mfgDate to set
	 */
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	/**
	 * @return the expDate
	 */
	public Date getExpDate() {
		return expDate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	/**
	 * @return the quantityBought
	 */
	public int getQuantityBought() {
		return quantityBought;
	}

	/**
	 * @param quantityBought the quantityBought to set
	 */
	public void setQuantityBought(int quantityBought) {
		this.quantityBought = quantityBought;
	}

	/**
	 * @return the quantityAvailable
	 */
	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	/**
	 * @param quantityAvailable the quantityAvailable to set
	 */
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}	


	@Override
	public String toString() {
		return "Stock [itemNumber=" + itemNumber + ", " + (mfgDate != null ? "mfgDate=" + mfgDate + ", " : "")
				+ (expDate != null ? "expDate=" + expDate + ", " : "") + "quantityBought=" + quantityBought
				+ ", quantityAvailable=" + quantityAvailable + "]";
	}

	public boolean checkAvailability() {				
		
		return false;
	}		
}
