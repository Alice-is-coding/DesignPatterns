# Design Patterns and Best Practices in Java - Packt - 2018

If we use our code in a multithreading application, it may be the case that 2 threads invoke the getInstance method at the same time when the instance is null.
When this happens, it may be the case that the 1st thread proceeds to instantiate the singleton using the new operator, and, before finishing it,
the 2nd thread checks whether the singleton is null. Since the 1st thread didn't finish instantiating it,
the 2nd one will find that the instance is null, so it will start instantiating it too.

This scenario may seem almost impossible, but that cannot be neglected.

The solution to this problem is simple.
We have to make the block checks whether the instance is null thread-safe.
To make the getInstance method thread-safe, we add the "synchronized" keyword to its declaration.
Then, we wrap the "if(instance == null)" condition in a synchronized block.
Note : When we use this keyword in this context, we need to specify an object that provides the lock. We use the SingletonSynchronized.class object for this.