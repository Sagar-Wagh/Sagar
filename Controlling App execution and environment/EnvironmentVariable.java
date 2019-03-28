package com.techm.appexecution;

public class EnvironmentVariable {

	public static void main(String[] args) {
		String compName=System.getenv("COMPUTERNAME");
		String sysRoot=System.getenv("SystemRoot");
		System.out.println(compName);
		System.err.println(sysRoot);
	}

}
