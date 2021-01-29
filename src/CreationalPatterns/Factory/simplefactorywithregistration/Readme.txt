# Design Patterns and Best Practices in Java - Packt Editions - 2018

Improvement of the simpleFactory.
Making the factory open for extension but closed for modification by using a mechanism to register new classes that will be instantiated when needed -> 2 ways to do it :
     . Registering product class objects and instantiating them using reflection
     . Registering product objects and adding a newInstance method to each product that returns a new instance of the same class as itself