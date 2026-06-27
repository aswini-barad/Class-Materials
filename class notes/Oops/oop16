==============
Generics In Java
==============

-> Generics introduced in java 1.5 version

-> Using Generics, we can write our classes / variable / methods which are
	 indendent of data type

-> Generics are used to achieve type safety

public void m1 ( Integer i ){

}

m1 (10) ;  // valid

m1 ("hi") ; // in-valid

-> The above method is taking Integer as a parameter (It is tightly coupled).
 If we want to pass String as a parameter for m1 ( ) method it is not possible.
 Compiler will not accept it.


public void m1 ( Integer i ){

}
public void m1 ( String i ){

}
m1 (10) ;  // valid

m1 ("hi") ; // in-valid


-> To overcome above problem we can use Generics in Java.






public class Demo<T> {
	public void m1(T arg) {
		System.out.println("Param Recieved : " + arg);
	}
	public static void main(String[] args) throws Exception {
		Demo d = new Demo();

		d.m1(10); // passing int value
		d.m1("hi"); // passing String value
		d.m1(100.51); // passing double value
		d.m1(true); // passing boolean value
	}
}

// Java program with Generic Type to achieve Type Safety



public class Demo<T> {

	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	public static void main(String[] args) throws Exception {

		Demo<Integer> d1  = new Demo<>();
		d1.add(10);
		System.out.println(d1.get());
		
		Demo<String> d2 = new Demo<>();
		d2.add("Hi");
		System.out.println(d2.get());
	}
}


// Java Program with Generic Parameters for Constructor

public class Demo<T1, T2> {
	T1 obj1;
	T2 obj2;
	Demo(T1 obj1, T2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	void print() {
		System.out.println(obj1 + ", " + obj2);
	}
	public static void main(String[] args) throws Exception {
		Demo<Integer, String> d1 = new Demo<>(101, "Ram");
		d1.print();

		Demo<String, Long> d2 = new Demo<>("Ashok", 798686868l);
		d2.print();

		Demo<String, Boolean> d3 = new Demo<>("Raju", true);
		d3.print();
	}
}

=====================

BoundedTypes
We can bound the type parameter for a particular range. Such type of types is called bounded 
types. We can achieve this by using extends keyword.

Generics with wild Cards
======================

Demo< ? extends Number > 

=> The above wild card represents Demo class should take any class obj which is 
extending from Number class.

Ex:
class Gen<T>
{
}
Here we can pass any types as the type parameter and there are no restrictions.
Gen<String> g1 = new Gen<String>();
Gen<Integer> g2 = new Gen<Integer>();
Ex:
Class Gen<T extends X>
If ‘X’ is a class then any type which is the child class of ‘X’ is allowed as the type parameter.
If ‘X’ is an interface then any type which is the implementation class of ‘X’ is allowed as
the type parameter.
Ex:
class Gen<T extends Number>
{
}



In this case as the type parameter we can take either number or it’s child classes.
}
EXAMPLE:
class Gen<T extends Number>
{
T ob; 
Gen(T ob)
{
this.ob = ob;
}
void show()
{
System.out.println("The int value is :" + ob.intValue());
}
}
class GenDemo
{
public static void main(String arg[])
{
Gen<Integer> t1 = new Gen<Integer>(new Integer(10)); t1.show();
Gen<Double> t2 = new Gen<Double>(20.5); t2.show();
Gen<Number> t4 = new Gen<Number>(20.5); t4.show();
//Gen<String> t3 = new Gen<String>("raju"); t3.show(); error
}
}





=============
Enums in Java
=============

-> Enum introduced in java 1.5v

-> Enum is a special data type in java

-> Enum data type is used to create pre-defined Constants

-> To declare constants using Enum we will use 'enum" keyword

-> Enum stands for Enumeration

	enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	}

	enum WEEKENDDAYS {
		SATURDAY, SUNDAY;
	}


-> When we want to declare pre-defined constants then we will use Enums concept.


======================================
Few Points To Remember Related To Enums
======================================

1) Enum constants we can't override
2) Enum doesn't support object creation
3) Enum can't extend classes
4) Enum can be created in seperate file or we can create in existing class also




public enum Course {

	JAVA, PYTHON, DEVOPS, AWS, DOCKER, KUBERNETES;

}


public class Demo {

	enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	}

	enum WEEKENDDAYS {
		SATURDAY, SUNDAY;
	}

	public static void main(String[] args) throws Exception {

		Course[] values = Course.values();
		
		for (Course c : values) {
			System.out.println(c);
		}
	}
}