https://github.com/Cydeo-Alumni/JavaProgrammingFastTrack7.git

Day 01:

How is your java experience?How do you rate your java skill? Do you have experience with java? etc

I have 5 years of java programming experience. I used java for building automation frameworks and test automation development.
I am comfortable with core java, flow control, string manipulation, collections, Object oriented programming, exception handling using java.

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



































