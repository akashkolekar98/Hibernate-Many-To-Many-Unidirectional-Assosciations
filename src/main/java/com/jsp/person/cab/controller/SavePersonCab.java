package com.jsp.person.cab.controller;

import java.util.ArrayList;

import com.jsp.person.cab.Cab;
import com.jsp.person.cab.Person;
import com.jsp.person.cab.services.CabServices;
import com.jsp.person.cab.services.PersonServices;

public class SavePersonCab {

	public static void main(String[] args) {
		CabServices cabServices = new CabServices();
		PersonServices personServices = new PersonServices();

		Cab cab = new Cab();
		cab.setName("maruti");
		cab.setType("Ac");

		Cab cab1 = new Cab();
		cab1.setName("bmw");
		cab1.setType("Ac withComfort");

		Cab cab2 = new Cab();
		cab2.setName("nano");
		cab2.setType("2nd class");

		ArrayList<Cab> c1 = new ArrayList<Cab>();
		c1.add(cab1);
		c1.add(cab2);
		c1.add(cab);

		Person per1 = new Person();
		per1.setName("ajay");
		per1.setEmail("ajay@gmail.com");
		per1.setC_no(25);

		Person per2 = new Person();
		per2.setName("sameer");
		per2.setEmail("sameer@gmail.com");
		per2.setC_no(25);

		Person per = new Person();
		per.setName("salman");
		per.setEmail("salman@gmail.com");
		per.setC_no(25);
		per.setCabs(c1);

		per.setCabs(c1);
		per1.setCabs(c1);
		per2.setCabs(c1);

		cabServices.saveCab(cab);
		cabServices.saveCab(cab1);
		cabServices.saveCab(cab2);

		personServices.savePerson(per);
		personServices.savePerson(per);
		personServices.savePerson(per);

		System.out.println("all good");

	}
}
