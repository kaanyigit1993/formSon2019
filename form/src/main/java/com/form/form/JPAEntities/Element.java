package com.form.form.JPAEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Element {
	private Long id;
	private String isim;
	private String soyisim;
	private int tcno;
	private String adres;
	private int telefon;
	private String email;
	private int dogumtarihi;
	private String perakendebilgi;
	private String tercihbilgi;
	private String konumbilgi;
	private int yatirimbilgi;
	private String ekbilgi;
	
	
	public Element()
	{
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getTcno() {
		return tcno;
	}
	public void setTcno(int tcno) {
		this.tcno = tcno;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDogumtarihi() {
		return dogumtarihi;
	}
	public void setDogumtarihi(int dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}
	public String getPerakendebilgi() {
		return perakendebilgi;
	}
	public void setPerakendebilgi(String perakendebilgi) {
		this.perakendebilgi = perakendebilgi;
	}
	public String getTercihbilgi() {
		return tercihbilgi;
	}
	public void setTercihbilgi(String tercihbilgi) {
		this.tercihbilgi = tercihbilgi;
	}
	public String getKonumbilgi() {
		return konumbilgi;
	}
	public void setKonumbilgi(String konumbilgi) {
		this.konumbilgi = konumbilgi;
	}
	public int getYatirimbilgi() {
		return yatirimbilgi;
	}
	public void setYatirimbilgi(int yatirimbilgi) {
		this.yatirimbilgi = yatirimbilgi;
	}
	public String getEkbilgi() {
		return ekbilgi;
	}
	public void setEkbilgi(String ekbilgi) {
		this.ekbilgi = ekbilgi;
	}
	

}
