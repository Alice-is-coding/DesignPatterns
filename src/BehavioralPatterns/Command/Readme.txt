# Wikipedia

"The Command pattern is a behavioral pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time."

--------------------------------------------------------------------------------------------------------------------------
# Design Patterns and Best Practices in Java - Packt - 2018

"The Command pattern does the following :
     - Provides a unified way to encapsulate a command along with the required parameters to execute an action
     - Allows the handling of commands, such as storing them in queues.

 Implementation :
     - Command         : The abstraction that represents the encapsulation of a command.
                         It declares the abstract method executed, which should be implemented by all the concrete commands.
     - ConcreteCommand : The actual implementation of the Command.
                         It has to execute the command and deal with the parameters associated with each concrete command.
                         It delegates the command to the receiver.
     - Receiver        : The class responsible for executing the action associated with the command.
     - Invoker         : The class that triggers the command.
                         This is usually an external event, such as a user action.
     - Client          : The actual class that instantiates the concrete command objects and their receivers.

 Applicability and examples of the Command pattern :
     - Undo/redo operations               : The Command pattern allows us to store the command object in a queue. This way, we can implement undo/redo operations.
     - Composite commands                 : Complex commands can be composed of simple commands using the Composite pattern, and are run in a sequential order.
                                            That way, we can build macros in an object-oriented-design manner.
     - The asynchronous method invocation : The Command pattern is used in multithreading applications.
                                            Command objects can be executed in the background in separate threads. The java.lang.Runnable is a Command interface."

 -------------------------------------------------------------------------------------------------------------------------