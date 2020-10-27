
public class Instructor {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int expYears;
	private String experience;
	
	public Instructor(String firstName, String lastName, String phoneNumber, int expYears) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNumber);
		setExpYear(expYears);
		setExperience(experience);
	}
	

	public String getFirstName() {
		return firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNum() {
		return phoneNumber;
	}
	
	public int getExpYears() {
		return expYears;
	}
	
	public String getExperience() {
		return experience;
	}
	
	
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
		
	}
	
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public void setPhoneNum(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	
	public void setExpYear(int expYears) {
		if (expYears > 1) {
			this.expYears = expYears;
		} else {
			this.expYears = 1;
		}
	}
	
	public void setExperience(String experience) {
		switch (expYears) {
		case 2: this.experience = "junior instructor";
		break;
		case 3: this.experience = "junior instructor";
		break;
		case 4: this.experience = "junior instructor";
		break;
		default: this.experience = "senior instructor";
		}
		
	}
	
	

}
