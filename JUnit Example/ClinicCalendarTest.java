package com.techm.junit;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Test;

public class ClinicCalendarTest {

	@Test
	public void allowEntryOfAnAppointment() {
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		calendar.addAppointment("Sagar", "wagh", "magdum", "9/10/2018 2:00 pm");
		List<PatientAppointment> appointments=calendar.getAppointments();
		assertNotNull(appointments);
		assertEquals(1, appointments.size());
		PatientAppointment enteredAppt=appointments.get(0);
		assertEquals("Sagar", enteredAppt.getPatientFirstName());
		assertEquals("wagh", enteredAppt.getPatientLastname());
		assertSame(Doctor.magdum, enteredAppt.getDoctor());
		assertEquals("9/10/2018 2:00 PM", 
				enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy h:mm a")));
		
	}
     
	void returnTrue()
	{
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		calendar.addAppointment("Sagar", "wagh", "magdum", "9/10/2018 2:00 pm");
		assertTrue(calendar.hasAppointment(LocalDate.of(2018,9,10)));
		
	}
	void returnFalse()
	{
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		assertFalse(calendar.hasAppointment(LocalDate.of(2018,9,10)));
	}
	
	void returnCurrentDaysAppointments()
	{
		ClinicCalendar calender=new ClinicCalendar(LocalDate.now());
		calender.addAppointment("sagar", "wagh", "magdum", "4/4/2019 4:00 pm");
		assertEquals(2,calender.getTodayAppointment().size());
		assertEquals(calender.getTodayAppointment(), calender.getAppointments());
	}
}
