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
	
	private String name;
	private String percentage;
	private String result;

// Getter
public String getName() {
	return name;
  }

  // Setter
  public void setName(String newName) {
	this.name = newName;
  }



  // Getter
	public String getResult() {
		return result;
	  }
	
	  // Setter
	  public void setResult(String newResult) {
		this.result = newResult;
	  }


	  // Getter
	public String getPercentage() {
		return percentage;
	  }
	
	  // Setter
	  public void setPercentage(String newPercentage) {
		this.percentage = newPercentage;
	  }

}