package com.glen.GetBookListMicroService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glen.GetBookListMicroService.model.Book;
import com.glen.GetBookListMicroService.sherbim.Busines;

@EnableCircuitBreaker
@RestController
public class Kontrollor {


	@Autowired
	private Busines busines;

	@GetMapping("/books")
	public List<Book>  getBookList() {
		List<Book> liber = new ArrayList<>();
		liber = busines.getBookList();
		
		/*
		//  ModelAndView
		ModelAndView mv = new ModelAndView();
		
		System.out.println(" getBookList inicilizua ");
		
		
		mv.addObject("listaLibrave", liber);
		mv.setViewName("lista_Librave");
		
		System.out.println(" ok ");
		// return mv;
		*/
		
		return liber; 
	}
	

}
