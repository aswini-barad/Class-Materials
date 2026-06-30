Imp Questions in Java
________________________
Q1. What is a Wrapper Class?

A wrapper class is a predefined Java class that converts a primitive data type into an object.

Q2. Why do we use Wrapper Classes?
To use primitive values as objects.
To work with Collections and Generics.
To use utility methods.
Q3. Difference Between Boxing and Autoboxing
Boxing	Autoboxing
Manual conversion	Automatic conversion
Integer.valueOf(10)	Integer obj = 10
Q4. Difference Between Unboxing and Auto-Unboxing
Unboxing	Auto-Unboxing
Manual conversion	Automatic conversion
obj.intValue()	int x = obj
Q5. Can Generics use primitive data types?

No. Generics work only with objects, so wrapper classes such as Integer, Double, and Character must be used instead of primitive types.



What are Generics?

Generics allow classes, interfaces, and methods to work with different object types while providing compile-time type safety.

Why use Generics?
Type Safety
No Type Casting
Compile-time Error Checking
Reusable Code
Difference Between T and ?
T	?
Named type parameter	Unknown type
Used while defining generic classes/methods	Used while using generic types
Types of Wildcards
<?> (Unbounded)
<? extends T> (Upper Bounded)
<? super T> (Lower Bounded)



Is Java a fully object-oriented language? Why?

Answer:
No, Java is not a fully object-oriented language because it supports primitive data types
 (int, char, boolean, etc.), which are not objects. However, Java supports all major OOP
  concepts such as encapsulation, inheritance, polymorphism, and abstraction, making 
  it an object-oriented language but not a fully object-oriented one.