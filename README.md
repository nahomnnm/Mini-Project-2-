Java OOP Vehicle System
This is a simple Java project demonstrating basic Object-Oriented Programming (OOP) concepts through a vehicle management hierarchy.

Features
Base Class: Vehicle — Contains common properties like brand and speed.

Subclasses:

Car: Inherits from Vehicle and adds door count.

ElectricCar: Inherits from Car and adds battery management.

Bike: Inherits from Vehicle and adds carrier status.

Methods
displayInfo(): Overridden in each subclass to show specific details.

startEngine(): Demonstrates method reuse and overriding.

category(): Demonstrates static method hiding.

File Structure
Vehicle.java: Base class with common properties and methods.

Car.java: Inherits from Vehicle (Single Inheritance).

ElectricCar.java: Inherits from Car (Multilevel Inheritance).

Bike.java: Inherits from Vehicle (Hierarchical Inheritance).

FinalVehicle.java: Demonstrates inheritance restrictions using the final keyword.

Main.java: Runs and tests the program.

How to Run
Compile: javac *.java

Run: java Main

Concepts Used
Inheritance: Using the extends keyword to build a hierarchy.

Encapsulation: Using protected and private modifiers to secure data.

Method Overriding: Customizing parent behavior in child classes.

Polymorphism: Handling different vehicle types through a common interface.
