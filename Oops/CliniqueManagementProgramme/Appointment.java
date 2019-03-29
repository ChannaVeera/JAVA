package com.BridgeIt.Oops.CliniqueManagementProgramme;

public class Appointment {
	private String doctorName;
	private String patientName;
	private  String date;
	int doctorAppointmentNum;
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	public Appointment(String docterName,String patientName,String date,int doctorAppointmentNum)
	{
		this.doctorName=docterName;
		this.patientName=patientName;
		this.date=date;
		this.doctorAppointmentNum=doctorAppointmentNum;
		
		
	}
	
	
	
	
	
	
	
	
	public String getDocter() {
		return doctorName;
	}
	public String toString()
	{
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.append(String.format("%-20s %-20s %-10s", doctorName, patientName, date));
		return stringbuilder.toString();
	}
	public void setDocter(String docter) {
		this.doctorName = docter;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDocterAppointmentNum() {
		return docterAppointmentNum;
	}
	public void setDocterAppointmentNum(int docterAppointmentNum) {
		this.docterAppointmentNum = docterAppointmentNum;
	}
	
	
	}
