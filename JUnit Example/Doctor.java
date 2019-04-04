package com.techm.junit;

public enum Doctor {
  wagh("Sagar Wagh"),
  magdum("Abhinav Magdum"),
  salorkar("Sushil Salorkar");
	
	private String name;
	
	
	 Doctor(String name) {
		this.name = name;
	}


	public String getName() {
		
		return name;
	}

}
