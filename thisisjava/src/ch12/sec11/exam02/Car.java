package ch12.sec11.exam02;

public class Car {

	private String model;
	private String owner;
	
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
}
