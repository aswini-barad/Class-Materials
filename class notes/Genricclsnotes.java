1. What are Generics?

Generics are a feature introduced in Java 5 that allow classes, interfaces, and methods to work with different data types while maintaining type safety.

Advantages
Type Safety
Compile-time Error Checking
No Explicit Type Casting
Better Readability
Reusable Code
Reduces Runtime Errors
2. ArrayList Without Generics
ArrayList list = new ArrayList();

list.add("Java");
list.add(100);

String s = (String) list.get(0);   // Valid

String s2 = (String) list.get(1);  // Runtime Error
Problems
Stores any object.
Explicit type casting required.
May throw ClassCastException.
3. ArrayList With Generics
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

String s = list.get(0);
Advantages
No type casting.
Only String objects allowed.
Compile-time checking.
4. Type Safety
ArrayList<String> list = new ArrayList<>();

list.add("Java");

list.add(100);    // Compile-Time Error

Compiler immediately reports an error because only String objects are allowed.

5. Generic Syntax
ClassName<DataType> object = new ClassName<DataType>();

Example

ArrayList<String> list = new ArrayList<>();

HashSet<Integer> hs = new HashSet<>();

LinkedList<Double> ll = new LinkedList<>();

Vector<Character> v = new Vector<>();
6. Diamond Operator (Java 7)

Instead of

ArrayList<String> list = new ArrayList<String>();

Use

ArrayList<String> list = new ArrayList<>();

Compiler automatically understands the type.

7. Generics Work Only with Objects

❌ Invalid

ArrayList<int> list = new ArrayList<>();

✅ Valid

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
8. Wrapper Classes
Primitive	Wrapper
int	Integer
double	Double
float	Float
char	Character
boolean	Boolean
byte	Byte
short	Short
long	Long
9. Generic Class
class Test<T> {

    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }
}

public class Demo {

    public static void main(String args[]) {

        Test<String> t1 = new Test<>("Java");
        t1.display();

        Test<Integer> t2 = new Test<>(100);
        t2.display();
    }
}

Output

Java
100
Advantages
Reusable class
Type safe
No casting
10. Generic Method
class Demo {

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String args[]) {

        print("Java");
        print(100);
        print(25.5);
        print(true);
    }
}

Output

Java
100
25.5
true
11. Advantages of Generics
Type Safety
Compile-time error checking
Eliminates explicit type casting
Better readability
Code reusability
Reduces ClassCastException
12. Limitations of Generics
Only objects are allowed
ArrayList<int> list;      // Invalid

ArrayList<Integer> list;  // Valid
Cannot create object of type parameter
class Test<T> {

    T obj = new T();   // Error
}
Static members cannot use type parameter
class Test<T> {

    static T obj;      // Error
}
13. Generic Type Parameters
Type	Meaning
T	Type
E	Element
K	Key
V	Value
N	Number
R	Result
T (Type)
class Box<T>{

    T value;

    Box(T value){
        this.value = value;
    }
}

Example

Box<String> b1 = new Box<>("Java");

Box<Integer> b2 = new Box<>(100);
E (Element)

Used in Collections.

ArrayList<String> list = new ArrayList<>();
K and V

Used in Map.

HashMap<Integer,String> map = new HashMap<>();

Here

K → Integer

V → String
14. What Happens Internally?

Source Code

ArrayList<String> list = new ArrayList<>();

During Compilation

Compiler checks only String objects are added.

After Compilation

Generics are removed (Type Erasure).

15. Wildcard (?)
Definition

A wildcard (?) represents an unknown type.

Used when exact generic type is not known.

Types of Wildcards
1. Unbounded Wildcard
List<?>

Accepts

List<String>
List<Integer>
List<Double>
List<Character>

Example

static void display(List<?> list){

    for(Object obj : list){
        System.out.println(obj);
    }
}
Limitation
list.add("Java");

❌ Compile-Time Error

Only reading is allowed.

2. Upper Bounded Wildcard
<? extends Number>

Accepts

Integer
Double
Float
Long
Short

Example

static void print(List<? extends Number> list){
    for(Number n : list){
        System.out.println(n);
    }
}

Cannot add elements.

3. Lower Bounded Wildcard
<? super Integer>

Accepts

Integer
Number
Object

Example

static void addNumbers(List<? super Integer> list){

    list.add(10);
    list.add(20);
}

Adding elements is allowed.

16. Wildcard Summary
Wildcard	Read	Write
<?>	✅	❌
<? extends T>	✅	❌
<? super T>	✅ (as Object)	✅

17. PECS Rule

Producer Extends → Read data

List<? extends Number>

Consumer Super → Add data

List<? super Integer>