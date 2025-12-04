package com.Hospital.Configure.HibernateUtil;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.Hospital.patient.Patient;

public class hibernateutil {
	public static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			Configuration cfg = new Configuration();
			Properties prop =new Properties();
			
			prop.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			prop.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernatemaven");
			prop.put(Environment.USER,"root");
			prop.put(Environment.PASS,"Password@5800");
			
			prop.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			prop.put(Environment.HBM2DDL_AUTO,"update");
			prop.put(Environment.SHOW_SQL,"true");
			prop.put(Environment.FORMAT_SQL, true);
			
			cfg.setProperties(prop);
			cfg.addAnnotatedClass(Patient.class);
			
			ServiceRegistry registry=(ServiceRegistry)new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build(); 
			factory=cfg.buildSessionFactory();	

		}
			
		return factory;
		
	}
	

}
