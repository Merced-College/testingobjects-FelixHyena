[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22531846)
# testingObjects

Checkpoint Q1: What does printing an object with no toString show, and why?

  Printing dog1 prints out Dog@4517d9a3. This happens because Java comes with different methods including toString().By default, Java takes dog1 and gives it a default name of its class name + its hashcode of its memory address.
  

Checkpoint Q2: Record what your three fields printed as defaults. Which are primitives vs. reference types?  

  The three fields printed:
    name = null
    age = 0
    breed = null

  - The primitives are age and the refrence types are name and breed.


Checkpoint Q3: How do constructors change the initialization story compared to Part B?

  When constructors, in this case the default constructor, is removed, the object d1 and d2 are no longer able to have default values. This makes it so that if some objects are not defined right off the bat, there will be an error since Java doesnt know how to define it.
  

Checkpoint Q4: What changed between Part A’s printout and Part D’s printout? Why is @Override useful?

  Part A's printed the same values but with different set ups. This happens because we overrided the print with @Override. @Override is useful because it allows you to use toString() to re-print your objects in whatever way you like while still using the same variables.
  

Checkpoint Q5: Why prefer private fields with getters/setters over public fields? Give one example of a rule you could enforce in a setter.

  Your code still needs to be protected from people that are trying to get in. Code, whether youre working on a private project or a public one, still needs security.A rule I could enforce in a setter is String name. This allows me to set my name to whatever I'd like.
  

--------------------------------------------------------Other Questions-----------------------------------------------------


1) Before toString, what printed when you printed an object? Why?

  The variables printed were the same but in a different set up. For example, the first print said: 'name = Rex' but the
  second print said 'Dog{name-'Rex'}'. This printed because of the @Override toString() we used.

3) List your class’s three fields and their default values before you set anything.

   The Three fields were:
     - name = "Unknown";
     - age = 0;
     - breed = "Mixed";

5) What changed after you added the default constructor? After adding the parameterized constructor?

   After changing the default constructor, the variables values changed to what they were set to. So instead of "Unknown"
   for the name, the name was now "Rex".

7) Why add @Override to toString()?

   Our default code to print was:
     System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());
   but with the @Override it was:
     System.out.println("d2 = " + d2);

   With @Override, the toString() could be changed to whatever we liked whilst using the same variables and less code to write.

9) Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter.

  Encapsulation is preferred over public fields because they are a lot more vulnerable. Without private fields, it becomes more prone to mistakes while coding and is not protected. A rule id add to a setter would be to se certain private variables
  from the start.
    
