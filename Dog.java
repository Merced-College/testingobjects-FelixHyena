// Jessie Mendez Cruz
// 2-4-2026
// Dog class for my Dog objects

public class Dog{
	
	//data variables
	private String name;	    
	private int age;
	private String breed;
	
	//default constructor
	public Dog() {
	    name = "Unknown";
	    age = 0;
	    breed = "Mixed";
	}
	
	// parameterized constructor
	public Dog(String name, int age, String breed) { 
	    this.name = name;
	    this.age = age;
	    this.breed = breed;
	}
	
	//getters and setters
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
	    // simple guard (optional)
	    if (age >= 0) this.age = age; 
	}

	public String getBreed() { 
		return breed;
	}
	
	public void setBreed(String breed) { 
		this.breed = breed; 
	}
	
	//toString() that describes the object clearly
	@Override
	public String toString() {
		return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
	}
	
}