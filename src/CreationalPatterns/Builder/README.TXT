# Design Patterns and Best Practices in Java - Packt Editions - 2018

The builder pattern serves the same purpose as the other creational patterns, but it does so
in a different way and for different reasons.
When developing complex applications, the code tends to become more complex.
Classes tend to encapsulate more functionality and, at the same time, class structures become more complex.
As the functionality grows, more scenarios need to be covered and, for these, different representations of classes are required.

When we have a complex class that we need to instantiate to different objects with different
structures or different internal states, we can use separate classes to encapsulate the
instantiation logic. These classes are called builders.
Each time we need objects from the same class with a different structure, we can create another builder to create such instances

----------------------------------------------------------------------------------------