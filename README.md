
# Object Oriented Design(OOD)
In software development, Object-Oriented Design plays a crucial role when it comes to writing flexible, scalable, maintainable, and reusable code. There are so many benefits of using OOD but every developer should also have the knowledge of the SOLID principle for good object-oriented design in programming.
## what are SOLID principles:
The SOLID principle was introduced by **Robert C. Martin,** also known as **Uncle Bob** and it is a coding standard in programming.
This principle is an acronym of the five principles which is given below…
1. Single Responsibility Principle (SRP)
2. Open/Closed Principle (OCP)
3. Liskov’s Substitution Principle (LSP)
4. Interface Segregation Principle (ISP)
5. Dependency Inversion Principle (DIP)
![SOLID principles](https://user-images.githubusercontent.com/40607314/111860221-25e26780-896c-11eb-997e-9db7b0fd38cb.jpg)

## Now let’s discuss one by one these principles…

 ### Single Responsibility Principle (SRP):
 
This principle states that **“a class should only have one responsibility. Furthermore, it should only have one reason to change.”** 

How does this principle help us to build better software?

1. Testing – A class with one responsibility will have far fewer test cases
2. Lower coupling – Less functionality in a single class will have fewer dependencies
3. Organization – Smaller, well-organized classes are easier to search than monolithic ones
4. The options for reuse increases significantly.

### Open/Closed Principle(OCP):
This principle states that **"classes should be open for extension, but closed for modification."** 

How does this principle help us to build better software?

1. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
2. You should be able to extend a class behavior, without modifying it.
> one exception to the rule is when fixing bugs in existing code.

### Liskov’s Substitution Principle (LSP):
>Barbara Liskov in 1987

 This principle states that **“Derived or child classes must be substitutable for their base or parent classes.“**
 It extends the open-close principle and also focuses on the behavior of a superclass and its subtypes.
 
 This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behavior.
 
 LSP states that inheritance should be used very carefully. Make sure that the super class is always fully replaceable by each of its sub classes
 
 ### Interface Segregation Principle (ISP):

 This principle states that **“do not force any client to implement an interface which is irrelevant to them“.**
 
 Clients should not be forced to implement interfaces that they don’t use

 Instead of one fat interfaces, a group of smaller interfaces is preferred, each one addressing a sub-module.
 
 *If two systems are communicating to each other, then the dependency should be in the smallest possible interface.*
 
 ###  Dependency Inversion Principle (DIP):
 
 This principle states that **“Depend upon abstract classes (interfaces), not upon concrete classes”**
 
 The principle of Dependency Inversion refers to the decoupling of software modules. 
 
 This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
 
 
#### Resources:
 https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/
 https://www.baeldung.com/solid-principles
 https://www.javatpoint.com/solid-principles-java
 https://www.springboottutorial.com/software-design-solid-principles
 
  
