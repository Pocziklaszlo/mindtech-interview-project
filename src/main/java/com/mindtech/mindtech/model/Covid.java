package com.mindtech.mindtech.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "covid")
public class Covid {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
	
	private int infected;
	
	private int activeInfected;
	
	private int deceased;
	
	private int recovered;
	
	private int quarantined;
	
	private int tested;
	
	@DateTimeFormat(pattern="YYYY-MM-dd HH:mm:ss")
	private Date date;
	
	public Covid(){}
	
	public Covid(long id, int infected, int activeInfected, int deceased, int recovered, int quarantined, int tested,
			Date date) {
		super();
		this.id = id;
		this.infected = infected;
		this.activeInfected = activeInfected;
		this.deceased = deceased;
		this.recovered = recovered;
		this.quarantined = quarantined;
		this.tested = tested;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getInfected() {
		return infected;
	}

	public void setInfected(int infected) {
		this.infected = infected;
	}

	public int getActiveInfected() {
		return activeInfected;
	}

	public void setActiveInfected(int activeInfected) {
		this.activeInfected = activeInfected;
	}

	public int getDeceased() {
		return deceased;
	}

	public void setDeceased(int deceased) {
		this.deceased = deceased;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getQuarantined() {
		return quarantined;
	}

	public void setQuarantined(int quarantined) {
		this.quarantined = quarantined;
	}

	public int getTested() {
		return tested;
	}

	public void setTested(int tested) {
		this.tested = tested;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
