# Design Patterns and Best Practices in Java - Packt - 2018

To avoid locking mechanisms and additional checking, we instantiate the static member directly when declared, to make sure we have a single instance of the class.

The lock-free thread-safe singleton is considered an early-loading singleton in the first version of Java.
However, in the latest version of Java, classes are loaded when they are needed, so that version is also a lazy-loading version.

Furthermore, the moment a class is loaded depends on the JVM implementation and may differ from one version to another.
Making design decisions based on JVM implementation should be avoided.

Currently, there's no reliable option in Java for creating an early loading singleton.
If we really need an early instantiation, we should enforce it at the start of the application, by simply invoking the
getInstance() method (Singleton.getInstance();).

