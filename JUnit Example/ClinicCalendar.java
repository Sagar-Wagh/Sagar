package com.techm.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ClinicCalendar {
	LocalDate today;
 private List<PatientAppointment> appointments;
  public ClinicCalendar(LocalDate today)
  {
	  this.appointments=new ArrayList<>();
	  this.today=today;
  }
  
  public void addAppointment(String patientFname,String patientLname,String doctorKey,String dateTime)
  {
	  Doctor doc=Doctor.valueOf(doctorKey.toLowerCase());
	  LocalDateTime localDateTime;
	  try{
		  if(dateTime.toLowerCase().startsWith("today"))
		  {
			String[] parts=dateTime.split(" ",2);
			LocalTime time=LocalTime.parse(parts[1].toUpperCase(),
					  DateTimeFormatter.ofPattern("h:mm a", Locale.US));
			localDateTime=LocalDateTime.of(today, time);
		  }
		  else{
		  localDateTime=LocalDateTime.parse(dateTime.toUpperCase(),
				  DateTimeFormatter.ofPattern("M/d/yyyy h:mm a", Locale.US));}
	  }catch(Throwable t)
	  {
		  throw new RuntimeException("Unable to create date and time from: ["+
	            dateTime.toUpperCase()+"] Please enter with the format M/d/yyyy h:mm a");
	  }
	  PatientAppointment appointment=new PatientAppointment(patientFname,patientLname,localDateTime,doc);
	  appointments.add(appointment);
  }
  public List<PatientAppointment> getAppointments()
  {
	  return this.appointments;
  }
  
  public List<PatientAppointment> getTodayAppointment()
  {
	  return appointments.stream()
			  .filter(appt->appt.getAppointmentDateTime().toLocalDate().equals(today))
			  .collect(Collectors.toList());
  }
  
  public boolean hasAppointment(LocalDate date)
  {
	  return appointments.stream()
			  .anyMatch(appt->appt.getAppointmentDateTime().toLocalDate().equals(date));
  }
}
