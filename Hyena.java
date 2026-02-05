// Jessie Mendez Cruz
// 2-4-2026
// Hyena class for my Hyena objects

public class Hyena {

	//data variables
	private String color;	    
	private int age;
	private String breed;
		
	//default constructor
	public Hyena() {
	    color = "Unknown";
	    age = 0;
	    breed = "Unknown";
	}
		
	// parameterized constructor
	public Hyena(String color, int age, String breed) { 
	    this.color = color;
	    this.age = age;
	    this.breed = breed;
	}
	
	//getters and setters
	public String getColor() { 
		return color; 
		}
	
	public void setColor(String color) {
		this.color = color; 
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
		return "Hyena{color='" + color + "', age=" + age + ", breed='" + breed + "'}";
	}
	
}
