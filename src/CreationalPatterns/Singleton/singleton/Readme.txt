# Design Patterns and Best Practices in Java - Packt - 2018

The Singleton pattern is used to ensure that only a single instance of an object can be created.
In addition to that, it also provides global access to that instance.

The implementation of the singleton pattern is very simple and consists of a single class. To
ensure that the singleton instance is unique, all singleton constructors should be made
private. Global access is done through a static method that can be globally accessed to get
the singleton instance.