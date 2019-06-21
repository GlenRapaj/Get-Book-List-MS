package com.glen.GetBookListMicroService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Liber")
public class Book {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titull")
	private String titull;
	
	@Column(name="autori")
	private String autori;
	
	@Column(name="zhaneri")
	private String zhaneri;
	
	@Column(name="vlera")
	private double vlera;
	
	@Column(name="isbn")
	private int isbn;

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitull() {
		return titull;
	}

	public void setTitull(String titull) {
		this.titull = titull;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public String getZhaneri() {
		return zhaneri;
	}

	public void setZhaneri(String zhaneri) {
		this.zhaneri = zhaneri;
	}

	public double getVlera() {
		return vlera;
	}

	public void setVlera(double vlera) {
		this.vlera = vlera;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", titull=" + titull + ", autori=" + autori + ", zhaneri=" + zhaneri + ", vlera="
				+ vlera + ", isbn=" + isbn + "]";
	}

	
	
}
