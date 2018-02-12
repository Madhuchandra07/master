package validationMaven;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MyUser {
	
	 @NotNull
	 @Size(min=1,max=20)
    private String name;

	
	 @Min(0)
	 @Max(120)
     private int age;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	 
	 
}
