package entities;

import abstracts.Entity;

public class User implements Entity {

	private int id;
	
	private String firstName;
	
	private String lastName;

    private int timeOfBirth;
	
	private String nationalityId;
	
	public User () {
		
	}
	
	public User(int id, String firstName, String lastName, int timeOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.timeOfBirth = timeOfBirth;
		this.nationalityId = nationalityId;
	}


	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public int getTimeOfBirth() {
		return timeOfBirth;
	}

	public void setTimeOfBirth(int timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


}