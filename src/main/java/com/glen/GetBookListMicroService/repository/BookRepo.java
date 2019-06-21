package com.glen.GetBookListMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glen.GetBookListMicroService.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
