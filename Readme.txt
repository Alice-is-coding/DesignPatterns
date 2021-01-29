After a class dedicated to design patterns I followed during the 1st semester 2020/2021, I decided to manage a project
which aims to better understand design patterns and get how to implement them.

I think that simple examples allow us to better (and more naturally) understand more complex design pattern implementations.
Note that, for every design pattern, there's a dedicated Readme.txt which gives a definition of it.

Feel free to participate if you would like to add some more examples.
Feel free to give me feedbacks.

To participate you should :

- Fork the project
- Create a branch to work on it
- Push your modifications on your fork
- Create a pull-request

To keep an organized project, each time you add a design pattern implementation example, please :

- Create a topic package for the design pattern if it doesn't exist yet (Ex: BehavioralPatterns).
  (Note: if you would like to contribute to a creational pattern for example, it's not necessary to create another package for this kind of design pattern as it already exists).
- In this package, create another package with the name of the design pattern you would like to contribute for.
  (Note: if you would like to contribute for the Builder pattern for example, it's not necessary to create another package for this pattern as it already exists).
- Finally, in this package, create another package named "example[n]".
  (Note: To do in every case).
- Enjoy coding in this package !
- In example[n], please don't forget to comment your classes with javadoc comments, neither to add a test class, so that everyone can understand the design pattern implementation you amazingly made ! ;)
- Lastly, please add, if it doesn't already exist, a Readme.txt which gives an English definition of this pattern.
  If it already exists, feel free to complete the definition if you would like to.

    -> Example :
        - BehavioralPatterns
            - ChainOfResponsibility
                - example0
                    - Class0.java
                    - Class1.java
                    - ...
                    - ClassN.java
                    - TestClass.java
                - Readme.txt
