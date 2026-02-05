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
