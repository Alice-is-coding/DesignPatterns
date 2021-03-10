The iterator pattern offers a solution to the following problem :
"How could I iterate through an object from which I know nothing ?"

-------------------------------------------------------------------
# https://howtodoinjava.com/design-patterns/behavioral/iterator-design-pattern/

"The iterator pattern is a behavioral pattern.
According to the GoF definition, this pattern is used to access the elements of an aggregate object sequentially
without exposing its underlying representation."

------------------------------------------------------------------
# Design Patterns and Best Practices in Java - Packt - 2018

"The iterator pattern is probably one of the most well-known patterns in Java.
Some Java programmers are using it without being aware that the java.util.Collection package is an implementation of the iterator pattern,
regardless of the type of the collection : array, list, set, or any other types.

The fact that we can deal in the same way with a collection, regardless of whether it's a list or an array, is because it provides
a mechanism to iterate through its elements without exposing its internal structure.
The same mechanism is used by different types of collections.

The following classes are used in the iterator pattern :
    - Aggregate : The abstract class that should be implemented by all the classes and can be traversed by an iterator.
                  This corresponds to the java.util.Collection interface.
    - Iterator : The iterator abstraction that defines the operations to traverse the aggregate object along with the one to return the object.
    - ConcreteAggregate : Concrete aggregates can implement internally different structures, but expose the concrete iterator, which deals with traversing the aggregates.
    - ConcreteIterator : The concrete iterator, that deals with a specific concrete aggregate class.
                         In practice, for each ConcreteAggregate, we have to implement a ConcreteIterator.
                         The ConcreteIterator should be nested in the ConcreteAggregate class. This is the best option because
                         the iterator needs access to the internal variables of the aggregator.

Iterators are popular in most programming languages, and is probably most widely used in Java along with the collections package.
It's also implemented at the language level when a collection is traversed with the for loop :
    for(String item : strCollection)
    {
        // Do something.
    }

Good practice when implementing new containers and iterators in Java is to implement the existing :
    - java.util.Iterator<E>, and
    - java.util.Collection<E> (which extends Iterable. Objects implementing the Iterable interface, which returns an Iterator from its only method,
      can be traversed using Java's foreach loop syntax).

When we need aggregators with specific behaviors, we should also consider extending one of the classes that were implemented in the java.collection package
instead of creating a new one."

------------------------------------------------------------------
# Wikipedia

"What solution does the Iterator design pattern describe ?
    - Define a separate (iterator) object that encapsulates accessing and traversing an aggregate object.
    - Clients use an iterator to access and traverse an aggregate without knowing its representation (data structures).

Different iterators can be used to access and traverse an aggregate in different ways.
New access and traversal operations can be defined independently by defining new iterators."

About other languages :
    - C# :
        - .NET Framework has special interfaces that support a simple iteration :
            - System.Collections.IEnumerator over a non-generic collection and
            - System.Collections.Generic.IEnumerator<T> over a generic collection.
        - foreach is designed to easily iterate through the collection that implements System.Collections.IEnumerator and/or
          System.Collections.Generic.IEnumerator<T> interface.
    - C++ :
        - Implements iterators with semantics of pointers in that language."
    - JS :
        - Supports this pattern with any object that provides a next() method, which returns an object with 2 specific properties : done and value.
    - PHP :
        - Supports the iterator pattern via the Iterator interface. Objects that implement the interface can be iterated over with the foreach language construct.
    - Python :
        - Prescribes a syntax for iterators as part of the language itself, so that language keywords such as "for" work with what Python calls iterables.
          An iterable has an __iter__() method that returns an iterator object."

------------------------------------------------------------------
# Other definitions

- An aggregate object = An object which contains other objects.
  (Ex : a Car class would contain Engine, Wheel,... objects).