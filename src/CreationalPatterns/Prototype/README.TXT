# Design Patterns & Best Practices in Java - Packt Editions :

The prototype pattern is a pattern that seems more complicated than it really is.
Practically, it is just a method to clone objects.
There are several situations in which it is required to clone objects that are already instantiated:

- When the creation of a new object relies on an external resource or a hardware-intensive operation
- When we need a copy of the same object with the same state without having to redo all of the operations to get to that state
- When we need an instance of an object without knowing to which concrete class it belongs

In the prototype pattern, the following classes are involved:

- Prototype: This is the base class, or an interface that declares the clone() method that derived objects have to implement. In a simple scenario, we may not
  have a base class, and a direct concrete class is sufficient.
- ConcretePrototype: These classes implement or extend the clone() method. This method should always be implemented because it returns a new instance of
  its type. If the clone() method was implemented in the base class and we didn't implement it in ConcretePrototype, when we invoked the clone() method
  on a ConcretePrototype object, it would return a base Prototype object.

SHALLOW CLONE VS DEEP CLONE

A problem arises when our objects contain references to other objects. For example, if we have to implement a clone method for a Car class that has an engine and
a list of four wheels, we should create not only a new Car object but also a new Engine and four new Wheel objects.
After all, two cars cannot share the same engine and the same wheels.
This is called a deep clone.

Shallow cloning is a method of cloning only the object that is the subject of cloning.
For example, if we have to implement a clone method for a Student object, we are not going to
clone the Course object it points to. More than one Student object can point to the same Course object.