# Java OOP Vehicle System

This is a simple Java project demonstrating basic Object-Oriented Programming (OOP) concepts through a vehicle management hierarchy.

 Features

1. **Base Class**: `Vehicle` — Contains common properties like brand and speed.
2. **Subclasses**: 
   * `Car`: Inherits from `Vehicle` and adds door count.
   * `ElectricCar`: Inherits from `Car` and adds battery management.
   * `Bike`: Inherits from `Vehicle` and adds carrier status.

 Methods

1. `displayInfo()`: Overridden in each subclass to show specific details.
2. `startEngine()`: Demonstrates method reuse and overriding.
3. `category()`: Demonstrates static method hiding.

 File Structure

1. `Vehicle.java`: Base class with common properties and methods.
2. `Car.java`: Inherits from `Vehicle` (Single Inheritance).
3. `ElectricCar.java`: Inherits from `Car` (Multilevel Inheritance).
4. `Bike.java`: Inherits from `Vehicle` (Hierarchical Inheritance).
5. `FinalVehicle.java`: Demonstrates inheritance restrictions using the `final` keyword.
6. `Main.java`: Runs and tests the program.


 Concepts Used

1. **Inheritance**: Using the `extends` keyword to build a hierarchy.
2. **Encapsulation**: Using `protected` and `private` modifiers to secure data.
3. **Method Overriding**: Customizing parent behavior in child classes.
4. **Polymorphism**: Handling different vehicle types through a common interface.
