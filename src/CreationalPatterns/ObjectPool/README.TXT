# Design Patterns and Best Practices in Java - Packt - 2018

The instantiation of objects is one of the most costly operations in terms of performance.
Nowadays, event if we have powerful systems, when we deal with objects that encapsulate external resources (cf. Database connections), the creation
of new objects becomes expensive.

The solution is to implement a mechanism that reuses and shares objects expensive to create.

Structure of the Object Pool Pattern :
    - ResourcePool : A class that encapsulates the logic to hold and manage a list of resources (Here I chose a Stack).
    - Resource     : A class that encapsulates a limited Resource (Here I chose a Dot class).
                     The Resource classes are always referenced by the ResourcePool, so they'll never be garbage collected as long as the ResourcePool is not de-allocated.
    - Client       : The class that uses resources.

# ------------------------------------------------------

# Wikipedia

The object pool pattern is a creational pattern that uses a set of initialized objects kept ready to use (a pool).
A client of the pool will request an object from the pool and perform operations on the returned object.
When the client has finished, it returns the object to the pool rather than destroying it (This can be done manually of automatically).

Object pools are primarily used for performance -> they significantly improve performance.
Note : In other situations, simple object pooling (that hold no external resources, but only occupy memory) may not by efficient and could decrease performance.
In case of simple memory pooling, the slab allocation memory management technique is more suited, as the only goal is to minimize the cost
of memory allocation and de-allocation by reducing fragmentation.

Note : Manual object pools are simple to implement, but harder to use, as they require manual memory management of pool objects.

To handle requests, object pools employ 1 to 3 strategies when there are no spare objects in the pool :
    - 1) Fail to provide the object (and return an error to the client).
    - 2) Allocate a new object, thus increasing the size of the pool.
         (Note: Usually, it requires to set the max number of objects ever used).
    - 3) In a multithreaded environment, a pool may block the client until another thread returns an object to the pool.
