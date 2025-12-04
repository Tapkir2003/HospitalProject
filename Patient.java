package com.Hospital.patient;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Patient {

	@Id
	@SequenceGenerator(sequenceName = "Patient_seq",initialValue = 123456,allocationSize = 1,name="pt_seq")
	@GeneratedValue(generator = "pt_seq",strategy =GenerationType.SEQUENCE)
	
	private int paId;
	private String paName;
	private String Address;
	private long mobileno;
	private int paAge;
	private String paDoctor;
	private String wardType;
	private String disease;
	private String gender;
	private double balance;
	private String Admitdate;
	
	public int getPaId() {
		return paId;
	}
	public void setPaId(int paId) {
		this.paId = paId;
	}
	public String getPaName() {
		return paName;
	}
	public void setPaName(String paName) {
		this.paName = paName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getPaAge() {
		return paAge;
	}
	public void setPaAge(int paAge) {
		this.paAge = paAge;
	}
	public String getPaDoctor() {
		return paDoctor;
	}
	public void setPaDoctor(String paDoctor) {
		this.paDoctor = paDoctor;
	}
	public String getWardType() {
		return wardType;
	}
	public void setWardType(String wardType) {
		this.wardType = wardType;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getDate() {
		return Admitdate;
	}
	public void setDate(String date) {
		this.Admitdate = Admitdate;
	}
	@Override
	public String toString() {
		return "Patient [paId=" + paId + ", paName=" + paName + ", Address=" + Address + ", mobileno=" + mobileno
				+ ", paAge=" + paAge + ", paDoctor=" + paDoctor + ", wardType=" + wardType + ", disease=" + disease
				+ ", gender=" + gender + ", balance=" + balance + ", Admitdate=" + Admitdate + ", getPaId()=" + getPaId()
				+ ", getPaName()=" + getPaName() + ", getAddress()=" + getAddress() + ", getMobileno()=" + getMobileno()
				+ ", getPaAge()=" + getPaAge() + ", getPaDoctor()=" + getPaDoctor() + ", getWardType()=" + getWardType()
				+ ", getDisease()=" + getDisease() + ", getGender()=" + getGender() + ", getBalance()=" + getBalance()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
