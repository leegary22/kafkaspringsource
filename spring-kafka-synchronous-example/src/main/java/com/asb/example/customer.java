package com.asb.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String dob;
	private String customerName;
	private String idNo;
	private String countryCode;
	private String occuptionCode;
	private String industryCode;
	private String income;


	// Getter
	public String getDob() {
		return dob;
	  }
	
	  // Setter
	  public void setDob(String newDob) {
		this.dob = newDob;
	  }

	  // Getter
  	public String getCustomerName() {
    	return customerName;
  	 	}

  	// Setter
  	public void setCustomerName(String newCustomerName) {
    	this.customerName = newCustomerName;
  		}


		  // Getter
  	public String getIdNo() {
    	return idNo;
  	 	}

  	// Setter
  	public void setIdNo(String newIdNo) {
    	this.idNo = newIdNo;
  		}


		    // Getter
  	public String getCountryCode() {
    	return countryCode;
  	 	}

  	// Setter
  	public void setContuntryCode(String newCountryCode) {
    	this.countryCode = newCountryCode;
  		}

		  // Getter
  	public String getOccuptionCode() {
    	return occuptionCode;
  	 	}

  	// Setter
  	public void setOccuptionCode(String newOccuptionCode) {
    	this.occuptionCode = newOccuptionCode;
  		}


	// Getter
  	public String getIndustryCode() {
    	return industryCode;
  	 	}

  	// Setter
  	public void setIndustryCode(String newIndustryCode) {
    	this.industryCode = newIndustryCode;
  		}


	// Getter
  	public String getIncome() {
    	return income;
  	 	}

  	// Setter
  	public void setIncome(String newIncome) {
    	this.income = newIncome;
  		}
}