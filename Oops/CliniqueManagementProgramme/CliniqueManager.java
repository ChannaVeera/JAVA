package com.BridgeIt.Oops.CliniqueManagementProgramme;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.BridgeIt.util.Utility;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CliniqueManager implements IClinique
{
	static ObjectMapper objectMapper= new ObjectMapper();
	private static CliniqueUtlity CliniqueUtility;
	public static void main(String[] args) 
	{
		Doctor doctor = new Doctor();
		Patient patient = new Patient();
		
		try {
			List<Appointment> appointmentList =objectMapper.readValue(new File(doctorFile), new TypeReference<List<Doctor>>() {});
			List<Patient> patientsList=objectMapper.readValue(new File(patientFile), new TypeReference<List<Patient>>() {});
			List<Doctor> doctorsList=objectMapper.readValue(new File(doctorFile),new TypeReference<List<Doctor>>(){} );
		
		
			boolean value = true;
			while(value)
			{
				
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Enter the choice");
				System.out.println("1. Add Doctor");
				System.out.println("2. Add Patient");
				System.out.println("3. See Doctors");
				System.out.println("4. See Patients");
				System.out.println("5. Search Doctors");
				System.out.println("6. Search Patients");
				System.out.println("7. Take Appointment");
				System.out.println("8. Print Appointment Reports");
				System.out.println("9. Popular Doctor in Clinic!");
				System.out.println("10.Our Popular Specialization!");
				System.out.println("11.Exit");
				System.out.println("__________________________________________________________________________");
				int chooise = Utility.getnumber();
				switch (chooise) 
				{
				case 1: CliniqueUtlity.addDocter(doctorsList);
				break;
		
				case 2: CliniqueUtlity.addPatient(patientsList);
				break;
			
				case 3: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "Doctor Name", "Doctor Id", "Specialization", "Availability");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i < doctorsList.size(); i++)
				{
					doctor = doctorsList.get(i);
					System.out.println(doctor.toString());
				}
				break;
			
				case 4: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "Patient Name", "Patient Id", "Mobile Number", "Age");
				System.out.println("------------------------------------------------------------------------");
				for(int i = 0; i < patientsList.size(); i++)
				{
					patient = patientsList.get(i);
					System.out.println(patient.toString());
				}
				break;
			
				case 5: CliniqueUtlity.searchDoctor(doctorsList);
					break;
		
				case 6: CliniqueUtlity.searchPatient(patientsList);
					break;
			
				case 7: CliniqueUtlity.fixAppointment(doctorsList, patientsList);
					break;
			
				case 8: CliniqueUtility.printAppointments(appointmentList);
					break;
			
				case 9 :	if(doctorsList.isEmpty())
							{
								System.out.println("Doctors are not available at this time\n");
							}
							else
							{
								System.out.println("Popular Doctor is " + doctorsList.get(0).getName()+ "\n");
							}
							break;
	
				case 10 : 	if(doctorsList.isEmpty())
							{
								System.out.println("Doctors are not available at this time\n");
							}
							else
							{
								System.out.println("Popular Specialization is "
										+ doctorsList.get(0).getSpecialization() + "\n");
							}
							break;
	
				case 11 : 	value = false;
							break;

				} 
			}
		}catch (Exception e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		
	}
}


