package com.glen.GetBookListMicroService.sherbim;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.glen.GetBookListMicroService.model.Book;
import com.glen.GetBookListMicroService.repository.BookRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class BusinesImp implements Busines{

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	@HystrixCommand(fallbackMethod = "getBookListSapstitude" )
	public List<Book> getBookList() {
		List<Book> liber = new ArrayList<>();
		
		
		liber = bookRepo.findAll();
		
		return liber;
	}

	

	public List<Book> getBookListSapstitude(){
		
		List<Book> liber = new ArrayList<>();
		Book b = new Book();
		
		b.setTitull("shqip");
		b.setZhaneri("gazet");
		
		liber.add(1, b);
		
		
		b.setTitull("Tema");
		b.setZhaneri("gazet");
		
		liber.add(2, b);
	
		b.setTitull("GSH");
		b.setZhaneri("gazet");
		
		liber.add(3, b);
		
		b.setTitull("Kha Jone");
		b.setZhaneri("gazet");
		
		liber.add(4, b);
		
		
		return liber;
	}
	

	
}
