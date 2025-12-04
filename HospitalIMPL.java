package com.Hospital.serviceIMPL;

import java.awt.datatransfer.Transferable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.Hospital.patient.Patient;
import com.Hospital.serviceMETH.HospitalPAT;

public class HospitalIMPL implements HospitalPAT {

	Scanner sc=new Scanner(System.in);
	SessionFactory factory=com.Hospital.Configure.HibernateUtil.hibernateutil.getSessionFactory();
	Session session=factory.openSession();
	
	@Override
	public void createPatientAccount() {
		Transaction txn=session.beginTransaction();
		
		Patient pt=new Patient();
		
		System.out.println("enter patient name:");
		pt.setPaName(sc.nextLine());
		
		System.out.println("Enter patient address");
		pt.setAddress(sc.nextLine());
		
		System.out.println("enter mobile no:");
		pt.setMobileno(sc.nextLong());
		
		System.out.println("enter patient age:");
		pt.setPaAge(sc.nextInt());
		
		System.out.println("enter patient assigned doctor name:");
		pt.setPaDoctor(sc.nextLine());
		
		System.out.println("enter paitent ward type:");
		pt.setWardType(sc.nextLine());
		
		System.out.println("enter patient disease:");
		pt.setDisease(sc.nextLine());
		
		System.out.println("enter patient gender:");
		pt.setGender(sc.nextLine());
		
		System.out.println("enter patient account balanc:");
		pt.setBalance(sc.nextDouble());
		
		System.out.println("enter patient admitted date:");
		pt.setDate(sc.nextLine());
		
		session.save(pt);
		txn.commit();
		System.out.println("data saved sussessfully");
		
		
		
	}
	@Override
	public void viewDetails() {
		
		System.out.println("enter the Patient id to get details:");
		Patient ac =session.get(Patient.class, sc.nextInt());
		System.out.println(ac);
		
	}
	@Override
	public void updatePatientDetails() {

		Transaction txn = session.beginTransaction();

		System.out.println("enter the Patient id to update:");
		Patient ac =session.get(Patient.class, sc.nextInt());
		
		System.out.println("enter the patient new mobile no: ");
		ac.setMobileno(sc.nextLong());
		
	}
	@Override
	public void billpayment() {
		
		Transaction txn=session.beginTransaction();
		System.out.println("enter Paicent id to withdraw the money:");
		Patient ac=session.get(Patient.class, sc.nextInt());
		
		System.out.println("enter amount to bill for payment ");
		double wpamt=sc.nextDouble();
		
		if(wpamt>=100)
		{
			double newbal=ac.getBalance()-wpamt;
			ac.setBalance(newbal);
			session.update(ac);
			txn.commit();
			System.out.println("monney withdraw sucssesfully");
		}
		else
		{
			System.out.println("minimum amount should be 100");
		}
		
	}
	
}
