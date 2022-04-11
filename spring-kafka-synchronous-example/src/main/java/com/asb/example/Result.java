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
	
	private String rcustomerName;
	private String ridNo;
	private String rstatus;
	private String rdatereceived;
	

// Getter
public String getRcustomerName() {
	return rcustomerName;
  }

  // Setter
  public void setRcustomerName(String newRcustomerName) {
	this.rcustomerName = newRcustomerName;
  }



  // Getter
	public String getRidNo() {
		return ridNo;
	  }
	
	  // Setter
	  public void setRidNo(String newRidNo) {
		this.ridNo = newRidNo;
	  }


	  // Getter
	public String getRstatus() {
		return rstatus;
	  }
	
	  // Setter
	  public void setRstatus(String newRstatus) {
		this.rstatus = newRstatus;
	  }


	   // Getter
	public String getRdatereceived() {
		return rdatereceived;
	  }
	
	  // Setter
	  public void setRdatereceived(String newRdatereceived) {
		this.rdatereceived = newRdatereceived;
	  }
}