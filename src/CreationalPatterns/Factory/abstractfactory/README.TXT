The abstract factory is an extended version of the factory method.
Instead of creating a single type of object, it is used to create a family of related objects.
If the factory method had one AbstractProduct, the abstract factory has several AbstractProduct classes.

The factory method has an abstract method that is implemented by each concrete factory
with the code to instantiate the abstract product. The abstract factory has one method for each abstract product.

If we take the abstract factory pattern and we apply it to a family containing a single object,
then we have a factory method pattern.

The factory method is just a particular case of the abstract factory !!