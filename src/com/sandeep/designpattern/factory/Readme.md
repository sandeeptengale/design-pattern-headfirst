# Factory pattern
- All factory method pattern encaplusates object creation by letting sub-class decide what objects to create  
- Factory method pattern defies an interface for creating an object , but lets the subclasses decide which class to instantiate   
- Factory method lets a class defer instantiation to subclass  

# Dependecy inversion principle
- Depend on abstraction. Don't depend on the concerete class
- It says, high level components should not depend on the low-level components; rather both should depend on the abstraction  

# Note
In the mentioned code, both high-level component i.e. PizzaStore and low-level component Pizza types both are dependent on `Pizza`.  
Never PizzaStore instainted a concreate Pizza, nor the concereate Pizza classes like CheesePizza sent its object.   
Both are always communcaited with Pizza abstration only.  


# Abstract factory pattern
- Abstract factory pattern providesan interface for creating  families of related or dependent objects without specifying their concerte class

