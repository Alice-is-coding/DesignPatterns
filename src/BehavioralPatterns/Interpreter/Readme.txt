# Wikipedia

"The interpreter pattern is a design pattern that specifies how to evaluate sentences in a language.
 The basic idea is to have a class for each symbol (terminal and nonterminal) in a specialized computer language.
 The syntax tree of a sentence is based on the composite pattern and is used to evaluate (interpret) the sentence for a client.

 Solutions the interpret design pattern describes :
     - Define a grammar for a simple language by defining an Expression class hierarchy and implementing an interpret() operation.
     - Represent a sentence in the language by an Abstract Syntax Tree (AST) made up of Expression instances.
     - Interpret a sentence by calling interpret() on the AST.

 The expression objects are composed recursively into a composite/tree structure (an AST)."

---------------------------------------------------------------------------------------------------------------------------------------
# Design Patterns and Best Practices in Java - Packt - 2018

"The interpreter pattern defines the representation of the grammar along with the interpretation.

 The interpreter pattern uses the composite pattern to define the internal representation of the object structure.

 This pattern is composed of the following classes :
     - Context               : Class (or abstract class, or interface) used to encapsulate the information that is global to the interpreter and needs to be accessed by all concrete interpreters.
     - AbstractExpression    : An abstract class or interface that declares the interpret method to be executed, which should be implemented by all the concrete interpreters.
     - TerminalExpression    : A concrete interpreter class which implements the operations associated with the terminal symbols of the grammar (a leaf).
                               This class must always be implemented and instantiated, as it signals the end of the expression.
     - NonTerminalExpression : Classes (or abstract classes) that implement different rules or symbols of the grammar.

 The interpreter pattern is used in practice to interpret regex (regular expressions). Java implements the interpreter pattern in java.util.Parser and it's used to interpret regex.
 First, when a regular expression is interpreted, a matcher object is returned. The matcher uses the internal structure that was created by the pattern class based on the regular expression.

 This pattern can be used whenever an expression should be interpreted and transformed to its internal representation."
---------------------------------------------------------------------------------------------------------------------------------------