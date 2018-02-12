package validation;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserDetails {
	
	 @NotEmpty
     private String user;

     @NotEmpty
     @Email
     private String email;        

     @NotEmpty(message = "Phone should not be blank.")
     @Size(min = 10,max = 10)
     private String phone;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
