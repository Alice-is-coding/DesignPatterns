# Wikipedia - https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern

"The chain of responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects.
 Each processing object contains logic that defines the types of command objects that it can handle - the rest is passed to the next processing object in the chain.
 A mechanism also exists for adding new processing objects to the end of this chain."

"This pattern promotes the idea of loose coupling."

"Difference between the chain of responsibility pattern and the decorator pattern :
     - Decorator : all classes handle the request.
     - Chain of responsibility : exactly one of the classes in the chain handles the request.
                                 This is a strict definition of the Responsibility concept in the GoF book."

"What problems can the chain of responsibility design pattern solve ?
     - Coupling the sender of a request to its receiver should be avoided.
     - It should be possible that more than one receiver can handle a request."

"What solution does the chain of responsibility design pattern describe ?
     - Define a chain of receiver objects having the responsibility, depending on run-time conditions, to either handle a request or forward it to the next receiver on the chain (if any).

 This enables us to send a request to a chain of receivers without having to know which one handles the request.
 The request gets passed along the chain until a receiver handles the request.
 The sender is no longer coupled to a particular receiver."

-------------------------------------------------------------------------------------------------------------------------------------------------------

 # Design Patterns and Best Practices in Java - Packt - 2018

 "Implementation of the chain of responsibility pattern :
      - Client           : The main structure of the application that uses the pattern.
                           It's responsible for instantiating a chain of handlers and then for invoking the handleRequest method on the first object.
                           (Note that with dependency injection, the Client doesn't need to instantiate the chain of handlers).

      - Handler          : The abstract class from which all the concrete handlers have to be inherited.
                           It has a handleRequest method, which receives the request that should be processed.

      - ConcreteHandlers : The concrete classes which implement a handleRequest method for each case.
                           Each ConcreteHandler keeps a reference to the next ConcreteHandler in the chain and has to check whether it can process the request -
                           otherwise, it has to pass it on to the next ConcreteHandler in the chain."