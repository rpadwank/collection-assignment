package com.capgemini.cellphone.model;

import java.util.Objects;

public class Cellphone {

	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	public Cellphone() {
		
	}
	public Cellphone(String company, String model, String description, String operatingSystem, double price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Cellphone))
			return false;
		if(this==obj)
			return true;
		Cellphone cellphone = (Cellphone) obj;
		if(this.company == cellphone.company && this.model == cellphone.model && this.operatingSystem == cellphone.operatingSystem)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(company, model, operatingSystem);
	}
}
