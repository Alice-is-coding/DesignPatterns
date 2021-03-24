# Wikipedia

"The Observer pattern is a software design pattern in which an object ("subject"), maintains a list of its dependents ("observers"), and
notifies them automatically of any state changes, usually by calling one of their methods.

It's mainly used for implementing distributed event handling systems, in "event driven" software.
Most modern programming-languages comprise built-in "event" constructs implementing the observer pattern components.

Solution the Observer pattern describes :
    - Define Subject and Observer objects.
    - When a subject changes state, all registered observers are notified and automatically updated.

The sole responsibility of a subject is to maintain a list of observers and to notify them of state changes by calling their update() method.
The responsibility of observers is to register/unregister themselves on a subject (to get notified of state changes) and to
update their state (> synchronize their state with the subject's state) when they are notified."

-----------------------------------------------------------------------------------------------------------------------

Note : The Observer pattern is used, for example, in event-driven programming : (Case of Swing. Even if swing isn't really used anymore, it allows
       better understand how this pattern is used in event-driven programming)
    - "observers" are "listeners" (> and will have a "Listener" suffix).
    - All observers/listeners extend the "EventListener" class :
        - xxxxListener extends java.util.EventListener
        - update(Subject subject, Object args) becomes actionPerformed(ActionEvent ae)
    - ConcreteSubject becomes for instance javax.swing.JButton
        - attach(Observer obs) method becomes addxxxxListener(xxxxListener xl).

    -> Each item is an observable subject (Subject) with its listeners/observers :
        - Ex with "button" : Every time we click, the listeners/observers are notified -> So an instance of the Button class notifies its observers (ActionListener)...

------------------------------------------------------------------------------------------------------------------------
# Design Patterns and Best Practices in Java - Packt - 2018

"The Observer pattern makes the state changes of one object observable to other objects that are registered to be informed.

Modules should work together, and it's not uncommon that changes in one object are known by another object.
For example : If we implement a Car class in a game, the engine of the car should know when the accelerator changes its position.
              The naive solution would be to have en Engine class that checks from time to time the accelerator position to see wether
              it has changed.
              A smarter approach would be to make the accelerator call the engine to inform it about the changes. But this is not
              enough if we want to have well-designed code.
              The best solution would be : Instead of making the accelerator dependent on the engine, we should make both of them rely on
              abstractions.

The Observer pattern relies on the following classes :
    - Subject          : Usually an interface that must be implemented by the ConcreteClasses and should be Observable.
                         The Observers that should be notified are registered using the attach method. When they no longer have to be informed
                         about the changes, they are deregistered using the detach method.
    - ConcreteSubject  : A class that implements the Subject interface.
                         It handles the list of observers and it updates them about the changes.
    - Observer         : An interface that is implemented by the objects that should be updated by the changes in the subject.
                         Contains the update method to be implemented by each ConcreteObserver.
    - ConcreteObserver : A class that implements the Observer interface.
                         Implements the update method which informs it about the new state changes."

------------------------------------------------------------------------------------------------------------------------
# https://betterprogramming.pub/observer-vs-pub-sub-pattern-50d3b27f838c

 Be Careful ! : The Observer pattern is different from the Publish-Subscribe pattern even if there's a conceptual similarity between them.

 "
 Yes, the Subject in the Observer pattern is like a Publisher, and the Observer can fully be related to a Subscriber.
 Yes, the Subject notifies the Observers just as a Publisher generally notifies its subscribers.
 That's why most of the design pattern books or articles use the publish-subscribe notion to explain the observer design pattern.

 Let's list the differences in a summary :
     - In the Obsever pattern, the observers are aware of the Subject.
       The Subject maintains a record of the observers.
       Whereas, in publish-subscribe, publishers and subscribers don't need to know each other.
       They simply communicate with the help of message queues or a broker.
     - In the Publish-Subscribe pattern, components are loosely coupled as opposed to the Observer pattern.
     - The Observer pattern is mostly implemented synchronously, i.e. the Subject calls the appropriate method of all its
       observers when an event occurs.
       The Publish-Subscribe pattern is mostly implemented asynchronously (using a message queue).
     - The Observer pattern needs to be implemented in a single-application address space.
       On the other hand, the Publish-Subscribe is more of a cross-application pattern.
 "