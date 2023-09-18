* **CHAPTER 5**
* **The three things we'll write for each class**
* Prep code : A form of pseudocode , to help you to focus on the logic without stressing about syntax
* Test code : A class or methods that will test the real code and validate that it's doing the right thing .
* Real code : The actual implementation of the class.
* Choose  for loops over while loops when you know how many times you want to repeat the loop code 
* Use Integer.parseInt() to get int value of a String
* Use break to leave loop early
* **Two kinds of for loops**
* for(int i=0; i<5; i++){}
* for(String i:cars){}

* **CHAPTER 6**
* ArrayList:
* It never needs to know how big it should be , because it grows and shrinks as objects are added or removed
* You can specify an index using add(anInt,anObject)
* new ArrayList<String>()
* In java API, classes are grouped into packages 
* To use a class in the API you have know which package the class is in
* Put an import statement at the top of the source code
* import java.util.ArrayList;
public class Myclass{}
* Type the full name in your code
* java.util.ArrayList<Dog> list = new java.util.ArrayList<Dog>()


* **CHAPTER 7**
* **Inheritance:**
* when one class inheritance from another , the subclass inherits from superclass
* example:
* class B extends class A
* public members are inherited and private members are not inherited
* **Polymorphism** 
* With polymorphism , use can write code that does'nt have to change when you introduce new subclass types into the program 
* public int addNumbers(int a, int b ){}
*  public double addNumbers(double a, double b ){}


* **CHAPTER 8**
* To prevent a class from being instantiated use the keyword abstract
* Concrete classes are those that are specific enough to be instantiated 
* abstract class canine extends Animal {}
* An abstract class has virtually no use unless it is extended
* An abstract method means the methods should be overridden 
* public abstract void eat();


* **CHAPTER 9**
* In java objects live in the heap and method invocations and local variables live in the stack 
* Instance variables are declared inside a class but not method 
* Local variables are declared inside a method 
* Constructor is the code that runs when you instantiate an object 
* public class Duck {
public Duck(){}
}
* Overloaded constructor means you have more than one constructor in your class
* An object becomes eligible for garbage collection when it's last live reference disappears