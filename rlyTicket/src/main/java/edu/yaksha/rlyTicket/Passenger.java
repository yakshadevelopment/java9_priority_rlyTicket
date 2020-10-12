package edu.yaksha.rlyTicket;

public class Passenger {
	private String name;
	private Integer age;
	private Integer fare;
		
	public Passenger(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getFare() {
		return fare;
	}
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		String str=String.format("%-10s %-10s %-10s ",name,age,fare);
		return str;
	}
	
	

}
