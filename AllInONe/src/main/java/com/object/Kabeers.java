package com.object;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@ManagedBean(name = "kabeers", eager = true)

@Entity
@Component
public class Kabeers {
@Id

	private int aid;
	private String aname;
	private String number;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String answer() {
		return "Kabeers [aid=" + aid + ", aname=" + aname + ", number=" + number + "]";
	}
	@Override
	public String toString() {
		return "Kabeers [aid=" + aid + ", aname=" + aname + ", number=" + number + "]";
	}
}

