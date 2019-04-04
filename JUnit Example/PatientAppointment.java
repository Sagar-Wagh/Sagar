package com.techm.junit;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;

public class PatientAppointment {
   private String patientFirstName;
   private String patientLastName;
   private LocalDateTime appointmentDateTime;
   private Doctor doctor;
   
	
	
	public LocalDateTime getAppointmentDateTime() {
			return appointmentDateTime;
	}

	public String getPatientLastname() {
    	return patientLastName;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public Doctor getDoctor() {
		
		return doctor;
	}

	public PatientAppointment(String patientFirstName, String patientLastName, LocalDateTime appointmentDateTime,
			Doctor doctor) {
		super();
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.appointmentDateTime = appointmentDateTime;
		this.doctor = doctor;
	}

	
		
	

	

}
