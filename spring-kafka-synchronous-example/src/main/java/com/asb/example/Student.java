package com.asb.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String registrationNumber;
	private String name;
	private String grade;


	// Getter
	public String getName() {
		return name;
	  }
	
	  // Setter
	  public void setName(String newName) {
		this.name = newName;
	  }

	  // Getter
  	public String getGrade() {
    	return grade;
  	 	}

  	// Setter
  	public void setGrade(String newGrade) {
    	this.grade = newGrade;
  		}


		  // Getter
  	public String getRegistrationNumber() {
    	return registrationNumber;
  	 	}

  	// Setter
  	public void setRegistrationNumber(String newRegistrationNumber) {
    	this.grade = newRegistrationNumber;
  		}
}