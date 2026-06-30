1. What is a Wrapper Class?

A Wrapper Class is a predefined Java class that converts (wraps) a primitive data type into an object.

It allows primitive values to be used where objects are required.

Definition (Interview):

A wrapper class is a class that encapsulates a primitive data type into an object.

2. Primitive Types and Wrapper Classes
Primitive	Wrapper Class
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean
3. Why Do We Need Wrapper Classes?

Wrapper classes are used because:

Collections (ArrayList, HashMap, etc.) store only objects.
Provide many utility methods.
Allow conversion between String and primitive types.
Can represent null values.
Required for Generics.
4. Example
public class Demo {

    public static void main(String args[]) {

        int num = 100;

        Integer obj = Integer.valueOf(num);

        System.out.println(obj);
    }
}

Output

100
5. Boxing

Converting a primitive into its wrapper object is called Boxing.

int x = 10;

Integer obj = Integer.valueOf(x);
6. Unboxing

Converting a wrapper object into a primitive is called Unboxing.

Integer obj = Integer.valueOf(20);

int x = obj.intValue();
7. Autoboxing (Java 5)

Automatic conversion of a primitive into a wrapper object.

Integer obj = 100;

Compiler converts it to

Integer obj = Integer.valueOf(100);
8. Auto-Unboxing

Automatic conversion of a wrapper object into a primitive.

Integer obj = 100;

int x = obj;

Compiler converts it to

int x = obj.intValue();
9. Wrapper Class Methods
Integer
Integer.parseInt("100");

Converts String → int

Integer.valueOf("100");

Converts String → Integer

Integer.toString(100);

Converts int → String

Integer.MAX_VALUE

Returns

2147483647
Integer.MIN_VALUE

Returns

-2147483648
Double
Double.parseDouble("25.5");

String → double

Boolean
Boolean.parseBoolean("true");

String → boolean

Character

Useful methods

Character.isDigit('5');

Character.isLetter('A');

Character.isUpperCase('A');

Character.isLowerCase('a');

Character.toUpperCase('a');

Character.toLowerCase('A');
10. Wrapper Classes with ArrayList

❌ Invalid

ArrayList<int> list = new ArrayList<>();

Primitive types are not allowed.

✅ Valid

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);

System.out.println(list);

Output

[10, 20]
11. Why Wrapper Classes are Used in Generics?

Generics work only with objects, not primitive types.

❌ Invalid

ArrayList<int> list;

✅ Valid

ArrayList<Integer> list;
12. Advantages of Wrapper Classes
Converts primitives into objects.
Required for Collections.
Required for Generics.
Provides useful methods.
Supports Autoboxing and Auto-Unboxing.
Can store null.
13. Limitations
Uses more memory than primitives.
Slightly slower than primitive types because objects are created.
14. Primitive vs Wrapper Class
Primitive	Wrapper Class
Not an object	Object
Faster	Slightly slower
Less memory	More memory
Cannot store null	Can store null
No methods	Many utility methods