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
