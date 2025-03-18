# Abstraction in Java OOPS  

## 1. What is Abstraction?  
Abstraction is one of the four pillars of Object-Oriented Programming (OOP) in Java. It is the process of hiding the implementation details and exposing only the necessary functionality to the user.  

## 2. Why is Abstraction Needed?  
- **Hides unnecessary details** → Reduces complexity.  
- **Improves code maintainability** → Changes in implementation do not affect users.  
- **Increases security** → Users cannot modify internal code directly.  
- **Enhances reusability** → Common functionalities can be shared.  

## 3. How is Abstraction Achieved in Java?  
In Java, Abstraction is achieved using:  
- **Abstract Classes (Partial Abstraction)**  
- **Interfaces (100% Abstraction)**  

### 3.1 Using Abstract Classes (Partial Abstraction)  
An abstract class is a class that cannot be instantiated. It may contain abstract methods (methods without a body) and concrete methods (methods with implementation).  

### Key Points About Abstract Class:
✅ Can have both abstract and concrete methods.
✅ Can have constructors and member variables.
✅ Supports single inheritance.
✅ Provides partial abstraction (some methods are implemented, some are not).