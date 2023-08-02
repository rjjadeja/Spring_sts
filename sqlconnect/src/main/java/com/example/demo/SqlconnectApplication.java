package com.example.demo;

import java.util.Optional;


import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SqlconnectApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SqlconnectApplication.class, args);
	
	Repository ur=ctx.getBean(Repository.class);
	
	
	//for inserting
//	Entry e=new Entry();
//	e.setName("ram shyam");
//	e.setId(59);
//	e.setCity("Rajkot");
//	Entry e1=ur.save(e);
//	System.out.println(e1);
	
//	Entry e2=new Entry();
//	e2.setName("shusil");
//	e2.setId(9);
//	e2.setCity("Surat");
	//Entry e3=ur.save(e2);
	//System.out.println(e3);
	
//	Entry e4=new Entry();
//	e4.setName("prince");
//	e4.setId(10);
//	e4.setCity("Ahmedabad");
	//Entry e5=ur.save(e4);
	//System.out.println(e5);
	
//	ur.saveAll(List.of(e,e2,e4));
	
	
	
	
	
	//for updating
	Optional<Entry> opt;
	try {
		 opt = ur.findById(51);
		Entry e6=opt.get(); // here opt.get() will return Entry's object
		
		e6.setName("babayaga" );
		
		Entry r1=ur.save(e6);
		System.out.println(r1);
	} catch (Exception e6) {
		e6.printStackTrace();
	}
	
//	for selecting
	
	
//	Iterator<Entry> iterator=itr.iterator();
//	
//	while(iterator.hasNext()) {
//		Entry e7=iterator.next();
//		System.out.println(e7);
//	}
//	Iterable<Entry> itr=ur.findAll();
//	itr.forEach(user->{System.out.println(user);});
	
	
//	for(Entry user: itr)
//	{System.out.println(user);
//		
//	}
	
	//deleting elements
	
	
	//ur.deleteById(2);
	
	
	
	}

}
