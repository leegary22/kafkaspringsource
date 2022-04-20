package com.asb.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	
	private String customerName;
	private String idNo;
	private String status;
	private String dateReceived;
	

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
	public String getStatus() {
		return status;
	  }
	
	  // Setter
	  public void setStatus(String newStatus) {
		this.status = newStatus;
	  }


	   // Getter
	public String getDateReceived() {
		return dateReceived;
	  }
	
	  // Setter
	  public void setDateReceived(String newDateReceived) {
		this.dateReceived = newDateReceived;
	  }
}