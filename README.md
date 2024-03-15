https://github.com/Cydeo-Alumni/JavaProgrammingFastTrack7.git

Day 01:

How is your java experience?How do you rate your java skill? Do you have experience with java? etc

I have 5 years of java programming experience. I used java for building automation frameworks and test automation development.
I am comfortable with core java, flow control, string manipulation, collections, Object oriented programming, exception handling, debugging using java.

Why did you choose java for automation?

Java is high level object oriented language.
It is platform independent
It has many open source libraries for test automation. JUnit, TestNG, Selenium , JDBC, RestAssured etc
It is a popular language for web backend , mobile development, so using java for automation is makes it in sync with developer environment.

Which java version?
I used java 8 mostly in my automation projects. Switched to java 11 in current project.

Jdk, jre, jvm?

Jdk - Java dev kit -> is needed for java development. It contains compiler and JRE, JVM.

JRE -> Java runtime environment -> used to run compiled java code(bytecode), uses JVM to run

JVM -> java virtual machine -> used to run java compiled bytecode

================
Explain main method:
public static void main(String[] args)

Main method, is called by Jvm to start execution of java program.

public -> access modifier, can be accessed from anywhere
static -> method can be called without creating object
void -> does not return any value
main -> method name
String[] args -> String array parameter where we can pass values to main method

==============
Explain:
System.out.println("Hello World");

System is a class in java.lang package
out -> static variable of PrintStream type:
public static final PrintStream out
println -> is a void method in PrintStream class
"Hello World" -> is a input to be printed out

println is overloaded method, so we can pass all kinds of inputs.
Ex:
System.out.println("Hello World");
System.out.println(333);
=======================

Data types: primitives and non-primitives
byte, short, int, long
float, double
char
boolean

var type automatically detects data type for local variables.
And need to initialize in same statement

var v = 10;

non-primitives -> are object types that comes from a class
String, Scanner, ChromeDriver etc

Object class is root/parent class for all classes in java.
public class Object {}
can also be used as data type.

Object obj = new String("abc");

Sometimes, when we write a class, we want to be able to use for all types. In that case we can use Generic type.

public class Device<T> {
T value;
}
=======================

What are Wrapper classes:
Each primitive has a matching Wrapper class.
Primitives are just values without any behaviour.
Wrapper classes add behaviour to primitives also ability to become an object.
We can use wrapper types with java collections. Java collections does not work with primitives. Only array can work with both

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double ->  Double
char -> Character
boolean -> Boolean

=======================

//compare 2 numbers
System.out.println("larger int = " + Integer.max(10, 5));
System.out.println("sum of double = " + Double.sum(4343.2, 12.4));

//convert from String to wrapper type:
String strAge= "44";
int age = Integer.parseInt(strAge);
Integer age = Integer.valueOf(strAge);

=======================

Autoboxing vs Unboxing?

Autoboxing -> converting from primitive to wrapper object
Integer i = 11;

Unboxing -> converting from wrapper object to primitive
Integer i = 11;
int n = i;
=======================

What do you do if you have a really large number that is not fitting LONG?

BigInteger, BigDecimal types can be used for really large numbers that we cannot predict.

Internally they use arrays to store numbers.
=======================

Casting primitives.

converting from one type to another:

from byte to int
from int to short
byte n1 = 11;
int n2 = n1; //cast from small to large automatically

int n3 = 200;
byte n4 = (byte)n3; //cast from large to small
=======================

Variables:
local vs instance?

	local variable declared inside the method or a block. and scope is limited to that block.

	instance variable declared inside the class, outside the methods.
	scope is whole class
=======================

DAY 02:

Operators:
-arithmethmetic/math(+,-,/,%,*)
-shorthand, unary (+=, -=, ++, --)
-> pre , post increment/decrement
pre -> ++n;
post -> n++;

-comparison -> >, <, !=, == etc
-logical -> &, &&, |, ||, !, ^

XOR operator ^ -> returns true only when conditions are different.

if both conditions are same, it will return false.

boolean a = true;
boolean b = false;
a ^ b => true

boolean a = true;
boolean b = true;
a ^ b => false
a || b => true
==============================

Conditional statements:
1) if statements
2) switch
3) ternary
----=
1) if statement:
   if(condition) {
   //code
   }
   ---
   if(condition) {
   //code to run when true
   } else {
   //code to run when false
   }
   ----
   if(conditionA) {
   //code to run when A is true
   } else if(conditionB) {
   //code to run when B is true
   } else if(conditionC) {
   //code to run when C is true
   } else {
   //code to run when all above are false
   }
   ----
   if(conditionA) {
   if(conditionB){
   //code B
   }else {
   //Code C
   }
   //code D
   } else {
   Code E
   }

   conditionA and ConditionB are true -> B, D
   conditionA is true and ConditionB is false -> C, D
   conditionA is false, ConditionB is true -> E
   =======================

switch(variable) { //String, int, Enums
case 1:
//code to run when case 1 is match
break;
case 2:
//code to run when case 2 is match
break;
default:
//when all cases mismatch
}

=======================

var myVar = (conditionA) ? value when true : value when false

String str;
if(conditionA) {
str = value when true
} else {
str = value when false
}

=======================

When to use:
if statements are most flexible, and can be used with all kind of conditions. paired with logical operator. ||, && etc,  >, <

	if(a > b || a < c) {

	}

	we can use switch when we are comparing if variable EQUALS certain values. cannot handle other types of comparisons

	switch(a) {
		case "ABC":
			//code
			break;
		case "RRT12":
			//code
			break;
	}

	ternary can be used to replace basic simple if else statement.
===============================

LOOPS in java:

while, do while, for loop, for each loop

we can have nested loops

forEach method can also be used with collections

while(conditions is true) {
//keep running this code
}

do {
//Do this once, then keep doing while condition is true
}while(conditions is true);

while vs do while?

while loop checks condition first and runs loop block code if true.

do while runs loop block code once, then checks if conditions is true.

---------
for loop with iterator, can be used when we know number of iterations beforehand.

for(int i = 0; i <= 100; i++) {
//loop code
}

for each loop is used with arrays, collections. it will start from first element until the last element.

int[] nums = {43, 123, 53};

for(int n : nums) {
println(n);
}

String[] strs = {"43", "123", "53"};

for(String s : strs) {
println(s);
}
-----------------------

String:
String is a class in java lang package.
String can store "value" in double quotes, and uses final char[] array internally.

String pool is an area in Heap memory where string objects are stored and can be reused.

String a = "java";
String b = "java";
"java" is created in String pool, since we are using double quotes to create a String. One object is created and reused

if(a == b) ==> true. both are pointing to same object in string pool

-------------
String a = new String("java");
String b = new String("java");

We are using NEW keyword, 2 objects are created outside String pool.

a == b ==> false because a and b are referring to different objects.

a.equals(b) => true
a.equalsIgnoreCase(b) => true
-------------


================

DAY 04:

Methods:
-> when I am assigned automation task during sprint planning.
-> analyze -> make sure steps, and acceptance criteria is CLEAR. Ask from BA, Dev, other team member if not clear
-> in progress:
-> test manually, if any bugs, report them. Most bugs can be caught here
-> testing manually: make it more clear about functionality, test data requirements, steps etc deeper.
-> start automation:
-> look at framework and see if any similar scenario was automated before
-> look at any steps in this scenario are common to other tests that were automated before
-> if yes, look at what REUSABLE methods, utilities, page object elements/methods can be reused.
-> When writing doing automation development, please focus on reusability.
==============================================


COMMAND/CTRL+SHIFT+F -> global search in IntelliJ

Methods:

Help create reusable code
Void -> performs actions, does not return value.
-> Ex: setter method

Return -> method that performs actions, then returns value.
We use return keyword to return value
======

Method that with or without parameters.

Void + no params:
public static void m1() {}

Void + with params:
public static void m2(String str, int num){}

Return + no params:
public static int m3(){
return 2024;
}

Return + with params:
public static boolean m4(int num) {
return num > 0;
}
================

To make our code more Reusable
=> methods:
-> general reusable methods(reverseString )/utility methods:
configReader etc
-> application specific reusable methods(page object methods)

Naming of methods:
-> code readability.
-> make sure method, and variable names are in alignment of naming conventions in your project
================

Method overloading:

2 or more methods with SAME NAME, DIFFERENT PARAMETERS.

DIFFERENT: data types of params, number of params, or order of params different

public void m1(){}
public void m1(String str){}
public boolean m1(boolean bl){}
public boolean m1(int n1, int n2){}
public boolean m1(double n1, int n2){}
public boolean m1(int n2, double n1){}

Once we overload, return type can be different.

public void m1(){}
public int m1(String str){}

Error below, because we cannot just change the param without properly overloading.
public void m1(){}
public int m1(){}

Error, we look at variable parameter types and count. Variable names does not matter.
public void m1(int n1, int n2){}
public void m1(int n2, int n1){}
================

IQ: Is java pass by value or pass by reference?

Java is pass by value, it copies the value to method parameter.

Ex:
main {
int n = 55;
add5(n);//int num = n;
println(n); //55
}

public static void add5(int num) {
num = num+5; //60
}

================

Array/Object example:

Array is an object with multiple value stored.

When we pass the array, we copy the reference to that object.

So inside the method:
1) reassign new array object.
-> it does not affect to original array
2) change existing values of array
-> it effects original as well because they are both pointing to same object

int[] nums = {3,2,6};
addExtraNum(nums);
println(Arrays.toString(nums)); // no change 3,2,6

increaseNum(nums);
println(Arrays.toString(nums));//changes 13,2,6

//reassign new array object.
public static void addExtraNum(int[] nums) {
nums = new int[]{3,2,6,9};
}

//change existing values of array
public static void increaseNum(int[] nums) {
nums[0] += 10;
}
===============================

Java review Day 05:


• Can you run a program without the main method?
We can use test frameworks like JUnit, TestNG and @Test annotation. So it will help run the test and we do not need to add a main method.
In Cucumber framework, CucumberRunner can be used to initialize execution.
Internally they invoke main method.

-Can you overload the main method?
Yes, we can by changing the parameters. however it is no longer a runner method that Jvm will invoke

public static void main(int[] args) {

}

-Why is the main method static?
So that method can be called without creating an object of the class.

-Why is there a String[] parameter?
This is to be able to pass runtime arguments.
Usually from command line or IDE run configurations.

================

DAY 06:
For each loop:
Useful while iterating over arrays and other collections.

for(dataType var: collection) {

}

=================

Multi-Dimensional array:

An element of an array is another array.
Normally we could use 2D array in dataProvider method in TestNG

String[][] users = {
{"user4433", "abc442"},
{"user1133", "ade442"},
{"userdd33", "a12442"}
};

We could also copy webtable data from webpage to 2D array using Selenium and xpath.

============

Var-Args:

It is used as parameter to a method, and adds ability to pass multiple values seperated by comma.
Inside the method, Var-args parameter will be treated as regular array.

public static void m1(int... nums) {
//nums is used as an array
}

m1(32,1,2)
m1()
m1(23,34,34,545,134,66,56,57)

================================

Array vs ArrayList?

Array is fixed size, we cannot resize once we create the object

ArrayList is dynamic size, we can add or remove elements

--------------

Array can contain Primitives and objects(non-primitives)
ArrayList is part of collections framework and can contain only objects(non-primitives)

--------------
ArrayList uses arrays internally.

--------------

Recursion:

When a method calls itself, it is a recursive method.

Normally in test automation development, we do not use this approach, instead we use loops.

m1(4);
4
3
2
1
0
-1
public static void m1(int num) {
System.out.println(num);
m1(num-1);
}

We always need to add breaking/stopping condition to prevent infinite loop.

public static void m1(int num) {
System.out.println(num);
if(num > 0)
m1(num-1);
}

==================

Class and Object

Class is a blueprint for an object
We define data and behaviour of object in a class

data -> using variables
behaviour -> using methods
================
We can create instance or object from a class using new keyword.

public class Car {
String make;
public void drive(){...}
}
Create object/instantiate:
Car car = new Car();
car.make = "Honda";
car.drive();
================

Instance vs static variables

instance variables belong to objects and each object will have its own copy of variables.

static variables belong to class directly and the value is shared by all objects. it has single copy.
We can access static variables without creating an object.

Constructor:
Is a method in a class that automatically runs when we create object of the class.
It has same name as classname, no return type.
We can add parameters to constructors.
We can overload constructors

Constructor chaining:
we can call one constructor from another constructor using THIS keyword.

public class A{
public A() {
this("hi");
}

	public A(String str) {
		println(str);
	}
}
=============

this vs this():

this. is used to refer to instance of the object and instance variables and methods
Usually used to differentiate between local and instance variables:
this.name = name;

this() -> is used for chaining constructors. calling one constructor from another one.

======================

static block vs instance init block?

static block runs once before anything else when the class is loaded(whenever we use the class)

instance init block-> similar to constructor, it runs every time we create object of the class
======================

Inheritance:

Sub/child class inherits variables and methods from super/parent class.

It helps with reusability and design

IS-A relationship is inheritance
Child class IS-A Parent class

Student IS-A Person

public class Person {//var, methods}

public class Student extends Person {}
================

Has-A relationship -> it is when a class has instance variable of type of different class. Also called Composition

public class House {
Address address;
}

House HAS-A Address
==========================

What is inherited ?

Depends on access modifiers:

Public,Protected -> always inherited
Default -> inherited if in same package
private -> is not inherited
Constructors are not inherited
Final classes cannot be inherited.

Access modifier:
Public -> visible to everyone
protected -> visible to everyone in same package and sub classes in other packages
default -> package private. visible to everyone in same package
private -> visible to same class only

==========================

DAY 07:
------

Inheritance and constructors:

Super class - Sub class

When we create object of Sub class, Super class constructor runs first.

public class A {
public A() {
System.out.println("A");
}
}

public class B extends A {
public B() {
super(); //compiler adds super class constructor call
System.out.println("B");
}
}
----------

A a = new A();==> "A"

B b = new B();==> "A"
"B"

When we create object of B, firstly A class constructor will run then B class constructor runs.
============================

super() keyword is used for calling parent class constructor from child class constructor.
============================


public class A {
public A(String str) {
System.out.println("A => " + str);
}
}

public class B extends A {
public B() {
//super();//not compile because no-args constructor is not present
super("hi");
System.out.println("B");
}
}

B b = new B();
A => Hi
B
===========================

super vs this:

super keyword is used to reference parent class object and call parent class members.

this keyword is used to reference currunt class object and used to call current class members.

public class A {

	public String name = "A name";

	public A(String str) {
		System.out.println("A => " + str);
	}
}

public class B extends A {

	public String name = "B name";

	public void printName() {
		System.out.println(name);//"B name"
		System.out.println(super.name);//"A name"
	}

	public B() {
		//super();//not compile because no-args constructor is not present
		super("hi");
		System.out.println("B");
	}
}
==================

this() vs super()

this() -> is used to call another constructor in same class

super() -> is used to call parent class constructor from child class constructor.

both statements need to be first in the constructor.

public class A {
public A(String str) {
this(); //optionally I can add this keyword
System.out.println("A => " + str);
}

	public A() {
		System.out.println("A");
	}
}

public class B extends A {
public B() {
super();
System.out.println("B");
}

	public B(String str) {
		super(str);
		//this(); will not compile as it needs to be first statement
		System.out.println("B => " + str);
	}

}
================================

Are static members(variables and methods) inherited or no?

If access modifier allows, static members are inherited.

public class A {
public static String name = "John";
}

public class B extends A {

}

println(A.name); "John"
println(B.name); "John"
===========================

Method overriding:

When a method is inherited to a sub class, we can change the implementation to customize for sub class.
This process is called method overriding.

method overriding -> changing the implementation of inherited method in a sub class

We can only override inherited method.
Method name and paramethers MUST be same.

public class A {
public void m1() {
println("A class m1")
}
}

public class B extends A {
@Override
public void m1() {
println("B class m1")
}
}

final methods that are inherited cannot be overridden.
final methods are used to prevent overrriding
=========================

Overriding rules:
-> Method name and parameters must be same
-> access modifier can be same or most visible:
-> public -> public
-> protected -> protected,public
-> default -> default,protected,public
-> private -> not inherited.cannot override

	-> return type:
		-> same or covariant(sub class)
			-> void -> void
			-> String -> String
			-> Person -> Person, Student, Teacher, Sdet

public class Student extends Person {

}
public class Teacher extends Person {

}
public class Sdet extends Person {

}

public class A {
public Person m1() {
Person p1 = new Person("Mike");
return p1;
}
}

public class B extends A {
@Override
public Student m1() {
Student st = new Student();
return st;
}
}
============================
Method overriding vs method overloading?

overriding -> method name must be same
overloading -> method name must be same

overriding -> method parameters must be same
overloading -> method parameters must be different

overriding -> access modifier can be same or more visible
overloading -> access modifier can be different

overriding -> return type must be same or sub type(covariant)
overloading -> return type can be different

overriding -> method must be inherited
overloading -> method can be in same class or inherited
==============================

Method overriding -> 2 methods with SAME name and SAME parameters. Used in inherited method

Method overloading -> 2 methods with SAME name and DIFFERENT parameters.
==============================

In Automation:
Method overloading can used in page object classes.
public class LoginPage {
//weblements
public void login(String role) {
//switch (role){
case "admin" :
case "guest" :
}
}

		public void login(String userName, String password) {
			//switch (role){
				case "admin" :
				case "guest" :	
			}
		}

	}
In Util methods DbUtil. read value from column name or column index number.

===============================

Overriding: can also be used in page objects.

public class BasePage {
//common elements and methods here
public void closePopUp() {
//close sign up for news popup
}
}

public class InstructorsPage extends BasePage {
public void closePopUp() {
//close sign up for jobs notification popup
//this one can be different, close button locator is different etc
}
}
=========================

public class TestBase {
@Before
public void setUp(){
//general set up. goto homepage
}

	public void verifyText(String exp, String act){}
}

public class SearchTests extends TestBase {
@Before
public void setUp(){
super.setUp();
//specific set up for page, novigation etc
}
@Override
public void verifyText(String exp, String act){
//some extra string manipulation steps
then compare
}
}
public class SearchApiTests extends TestBase {
@Before
public void setUp(){
//specific set up for page, novigation etc
}
}
=========================

Method hiding:
-> static methods are hidden, not overridden.
-> based on where we can the method, it will refer to closest one

public class A {
public static void m1() {
println("A - m1");
}

	public void m2() {
		m1();
	}
}
public class B extends A {
public static void m1() {
println("B - m1");
}
public void m3() {
m1();
}
}

A.m1(); => A - m1
B.m1(); => B - m1
-----------------

A.m2(); => A - m1
B.m3(); => B - m1
-----------------

Variable hiding:
We cannot override inherited variables, we can only hide them.

public class A {
int num = 10;
public void m2() {
println(num);
}
}
public class B extends A {
int num = 30;
public void m3() {
println(num);
println(super.num)
}
}

b.m3(); -> 30
-> 10
==============================

Exceptions in java:

In Java exceptions are objects.
They have certain hierarchy.
Throwable is parent of all exceptions and errors.
Exception is parent of all checked exceptions
RuntimeException is parent of all un-checked exceptions

checked vs unchecked?

checked also called compile time exception, need to be handled or declared for code to compile.

Ex: SQLException, IOException, FileNotFoundException etc

unchecked also called Runtime exceptions, happen during runtime of code, they are optional to handle, normally we need to prevent them.

Ex: NullpointerException, Outofbounds, NoSuchElement, StaleElementException,

=======================

CheckedExceptions


Thread.sleep(3000);

It throws a checked InterruptedException.
So we have two options:

1) handle using try catch

try {
Thread.sleep(3000);
}catch (InterruptedException e) {
e.printStackTrace();
}

2) declare using throws in method
   main(String[] args) throws InterruptedException {
   =======================================
   Unchecked : StringIndexOutOfBounds Exception

String str = "exception";
System.out.println(str.charAt(55));

Above lines will compile and throw exception during runtime.

We need to fix our code to prevent it, so change index.
Instead of try catch.
=======================================

in below example, even though api call does not have CHECKED exception, I am using try catch to prevent RuntimeException.
Because I am not in control of API service in this case.

class SMSVerificationService {
public static String getSmsCode(int accountId) {
try{
Api call to endpoint adn extract sms code
and return
}catch(RuntimeException e) {
return "";
}
}
}
=======================================

Day 08:

Handling exceptions:

try{
//code
}catch(Exception e) {
e.printStackTrace();
e.getMessage() ==> print
}

try{
//code
}catch(Exception e) {
e.printStackTrace();
e.getMessage() ==> print
}finally {
//code always runs, error or no error
}

try{
//code that might throw exp, but we dont want to handle
}finally{
//code always runs
}


try{

}catch(NullpointerException e) {

}catch(RunTimeException e) {

}
==================================

throw vs throws:
-> throw is used to create exception manually.
if(age < 18) {
throw new IllegalArgumentException("age is too low");
}

throws -> is used to declare exception in method signature

public static void main(String[] args) throws InterruptedException {} {}
======
For checked exceptions, we either handle using try catch, or declare using throws.

=========================

final, finally, finalize()

final:
final variable -> constant variable, cannot change value
final method -> cannot override in sub class
final class -> cannot extend to other classes

finally -> is block in exception handling, that contains code that always runs, exception happens or no.
-> System.exit(0) or some memory error etc

finalize
-> is a method that GC(garbage collector) calls when removing object from memory
=====================

Encapsulation: data hiding, making variables/data private and providing public getter and setters.

==========================

Abstraction -> is focusing on what todo instead of How todo.

In java:
-> abstract class
-> interface

Abstract class :
-> abstract keyword is used
-> cannot create object
-> methods -> can have abstract, non abstract methods, constructors , blocks
-> variables -> all types: instance , static, final etc
-> class can extend only one abstract class

Interface:
-> interface keyword
-> cannot create object
-> methods: PUBLIC abstract, static , default methods
-> variables -> Public static final variables only
-> class can implement multiple interfaces

What is difference between abstract class and interface?

-Both are used to achieve Abstraction in java.and cannot create object
-Class can extend one abstract class and can implement multiple interfaces.
-methods:
abstract class -> can have abstract, non abstract methods, constructors , blocks
interface -> PUBLIC abstract, static , default methods
-variables:
abstract class ->all types: instance , static, final etc
interface -> Public static final variables only
=========================

How to achieve multiple inheritance in java?

In java , a sub class can inherit/extend only one super class.

So java does not support multiple inheritance for classes.
We can use multiple inheritance with interfaces, a sub class can implement multiple interfaces.

public abstract class A {

}

public interface B{

}

public interface C{

}

public interface E extends B, C{

}

public class D extends A implements B,C {}
===========================================


public abstract class A implements B{
public abstract void mA1();

}

public interface B{
public abstract void mB1();
}

public interface C{

}

public interface E extends B, C{

}

public class D extends A implements B,C {
public void mA1(){///}
public void mB1(){///}
}
===========================================

First Non-abstract class/concrete class is responsible for implementing all inherited abstract methods from abstract classes or interfaces.

===========================================

polymorphism:
ability of object to take many forms:

	reference type for object can be parent class or parent interface.

	Person p1=new Student();

	object is student
	reference is parent class
==================================

public class A {}
public class B extends A {}
public class C extends B {}

A obj = new B();
A obj = new C();
B obj = new C()
==================================

public class A {
int num = 10;
public void m1() {
println("A-m1");
}
}
public class B extends A {
int num = 20;
String str = "java";
public void m2() {
println("B-m2");
}
@Override
public void m1() {
println("B-m1");
}
}

A a = new B();
println(a.num); => 10
a.m1(); => "B-m1"

Below are not accessible:
a.str
a.m2();
=============================

public interface WebDriver{
get,findElement, close, quit
}
public interface TakesScreenshot{
getScreenshotAs(..)..
}

public class ChromeDriver implements WebDriver,TakesScreenshot

WebDriver driver = new ChromeDriver();
driver.get(url)
Error: driver.getScreenshotAs()

So we need to downcast to TakesScreenshot.

((TakesScreenshot)driver).getScreenshotAs();

TakesScreenshot screenshotDriver = (TakesScreenshot)driver;
screenshotDriver.getScreenshotAs(A);
screenshotDriver.getScreenshotAs(B);

=======================================

IQ: how can you handle large of amounts of Data?

In my project, there are modules that generate large amount of data in different formats.

I normally analyze the data formats that i am working with, and choose the most efficient approach.

Pojo/model class with Java collections.

If I can implement POJO classes/Model to match the data I am working with, I add model/pojo classes and use java collections to manipulate large amount of data.

Data pipeline:
JanusGraph --> Format using pojo and collections -> kafka -> Datascience team score -> kafka -> Format using pojo and collections -> elastic search database -> Client companies

ETL pipeline -> Extract, Transform, Load
================================================

Big data -> millions of records
Big data ETL tools -> Hadoop, Spark, Informatica etc
Data engineering

================================================

IQ:Common question different between Collection / Collections

Collection is an interface is parent interface for List, Set, Queue. It contains common methods for all collection types like
add, remove, size etc

Collections is a utility class that has useful methods when working with collections like sort, binarySearch, reverse, max, min etc

List:
-> preserves insertion order
-> allows duplicates
-> get read values using indexes
-> allows null values

List has several implementations:
ArrayList -> resizable array, most common we use, based on array internally.
Vector -> is also resizable array but it is syncronized
linkedList -> based on nodes connected to each other.
node:
its value ,  prev and next reference.
if prev is null and next is not -> we are at beginning node(index 0)
if prev is not null but next one is null -> we are at the end. index is length()-1
========================================

which one to use LinkedList or Arraylist?

ArrayList is more commonly used.

Reading:
get(5) -> arraylist -> faster -> Time complexity O(1)
-> linkedList -> slower -> Time complexity O(n):
Unless first or last then O(1)

Adding:
add(value) or add(index, value)
->arraylist -> O(1) if arrays does not need to be resized. O(n) if needs to be resized(common)
->linkedList -> O(1) addFirst, addLast.
inserting to middle is O(n)

Remove:
remove(Elem):
-> arraylist -> O(n) -> needs to remove and resize array
-> linkedList -> O(1) -> if first or last elements.
O(n) -> all other elements

Big O notation describes time and space complexity
time complexity how long it takes for code to run based on input

space complexity - how much memory it will take

O(1) -> regardless how much input we have , it takes same exact time
O(n) -> depending on input, time it takes to complete also grows
================================

SET -> collection of unique values

	-> does not allow duplicate data
	-> does not preserve insertion order
	-> allow null value
	-> no indexes

Implementations:
Hashset -> most common implementation.
ex: Selenium window handles

	LinkedHashSet -> preserves insertion order

	TreeSet -> implements SortedSet-> sorts values

Set implementations use Hashmap keys internally
==========================









