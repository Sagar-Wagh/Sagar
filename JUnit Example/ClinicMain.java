package com.techm.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class ClinicMain {
  private static ClinicCalendar calendar;
   public static void main(String[] args)  throws Throwable{
	calendar =new ClinicCalendar(LocalDate.now());
	Scanner scanner=new Scanner(System.in);
	System.out.println("Welcome to the patient intake computer system");
	String lastOption="";
	while (!lastOption.equalsIgnoreCase("x")) {
		lastOption=displayMenu(scanner);
		
	}
	System.out.println("Exiting system");
}
private static String displayMenu(Scanner scanner) throws Throwable{
	System.out.println("Please select an option");
	System.out.println("1.Enter a patient appointment");
	System.out.println("2.View all appointments");
	System.out.println("3.View Today's appointment");
	System.out.println("X. Exit system");
	System.out.println("Option ");
	String option=scanner.next();
	switch(option){
	case "1":performPatientEntry(scanner);
	         return option;
	case "2":performAllAppointments();
	          return option;
	case "3":todaysAppointment();
	         return option;
	          
	default:System.out.println("Invalid option, please re-enter");
	return option;
	}
	
}
private static void todaysAppointment() {
	System.out.println("Todays appointment in system");
	for(PatientAppointment appointment:calendar.getAppointments())
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("M/d/yyyy h:mm a");
		String appTime=formatter.format(appointment.getAppointmentDateTime());	
		System.out.println(String.format("%s: %s, %s\t\tDoctor:%s",appTime,appointment.getPatientLastname(),
				appointment.getPatientFirstName(),appointment.getDoctor().getName()));
	}
	
}
private static void performAllAppointments() throws Throwable{
	System.out.println("All appointment in system");
	for(PatientAppointment appointment:calendar.getAppointments())
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("M/d/yyyy h:mm a");
		String appTime=formatter.format(appointment.getAppointmentDateTime());	
		System.out.println(String.format("%s: %s, %s\t\tDoctor:%s",appTime,appointment.getPatientLastname(),
				appointment.getPatientFirstName(),appointment.getDoctor().getName()));
	}
	System.out.println("press any key to continue");
	
}
private static void performPatientEntry(Scanner scanner) {
	scanner.nextLine();
	System.out.println("Please enter patient info");
	System.out.println("Enter patient last name");
	String lastName=scanner.nextLine();
	System.out.println("Enter patient first name ");
	String firstName=scanner.nextLine();
	System.out.println("Appointment date:");
	String when=scanner.nextLine();
	System.out.println("Doctor last name");
	String doc=scanner.nextLine();
	try{
		calendar.addAppointment(firstName,lastName,doc,when);
	}catch(Throwable t)
	{
		System.out.println("Error "+t.getMessage());
		return;
	}
	System.out.println("Patient entered successfully");
	
	
	
}
}
