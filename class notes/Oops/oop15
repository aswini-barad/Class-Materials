Wrapper  class
___________________

Integer
Float
Double
String
Short
.
.
.



(1)primitive convert to wrapper(int to Integer)
String convert to wrapper 



		(a)using constructor
		int a=10;
		Integer i=new Integer(a);
		sop(i);

		Integer I = new Integer(10); 
		Integer II = new Integer("10");

		(b) using valueOf method

		Integer I = Integer.valueOf("10");
		int x=20;
		Integer II=Integer.valueOf(x);

p1:
class Test
{
     public static void main(String[] args) 
     { 
                int a=10;
                Integer i=new Integer(a);
                Integer ii=Integer.valueOf(a);
                System.out.println(i);
                 System.out.println(ii);

                 ////
                 String b="10";
                  Integer iii=new Integer(b);
                Integer iv=Integer.valueOf(b);
                System.out.println(iii);
                 System.out.println(iv);
     } 
} 





(2)wrapper  convert to  primitve(Intgeer to int)

		Integer i=Integer.valueOf(150); 
		int x=i.intValue();
		sop(x);
System.out.println("byte value :"+i.byteValue());//-106 
System.out.println("short value :"+i.shortValue());//150
System.out.println("int value :"+i.intValue());//150 
System.out.println("long value :"+i.longValue());//150
System.out.println("float value :"+i.floatValue());//150.0
System.out.println("double value :"+i.doubleValue());//150.0

p2:

class Test
{
     public static void main(String[] args) 
     { 
               
                Integer i=new Integer(10);
                int x=i.intValue();
                System.out.println(x);
                
     } 
} 

o/p:
10


(3)String convert to  (primitive type) int

  String s="125";
  int no=Integer.parseInt(s);

   String convert to double 
   String s1="12.34";
   double d=Double.parseDouble(s1);
   sop(d);



   ////

   class Test
{
     public static void main(String[] args) 
     { 
               
                 String s="125";
         int no=Integer.parseInt(s);
         System.out.println(no);
     } 
} 


(4)Wrapper to  String

Integer i=new Integer(10);
sop(i);//i.toString()
sop(i.toString());

String s=i.toString();
sop(s);
o/p:
10
10
10



class Test
{
     public static void main(String[] args) 
     { 
               Integer i=new Integer(10);
            System.out.println(i);//i.toString()
            System.out.println(i.toString());
            String s=i.toString();
            System.out.println(s);
     } 
} 


(5)int  to  String
_______________________

String s = Integer.toString(10);

sop(s);

class Test
{
     public static void main(String[] args) 
     { 
              int a=10;
           String s=Integer.toString(a);
            System.out.println(s);

     } 
} 

o/p:
10


autoboxing  (primitive convert to wrapper)
____________
int a=10;
Integer i=a; //internally Integer i=Integer.valueOf(a);

boxing 
_____________

jdk 1.5 before 

int a=10;
Integer i=Integer.valueOf(a);


autounboxing
__________________
Integer i=10;
int a=i;  //indirectly int a=i.intValue();

unboxing
____________
befoer jdk 1.5 
Integer i=10;
int a=i.intvalue();


Autoboxing and Autounboxing:-(introduced in the 1.5 version)
Until 1.4 version we are not allowed to place primitive in the place wrapper and wrapper in the place 
of primitive. 
Autoboxing:-
The auto conversion of the primitive into the Wrapper object is called the autoboxing these 
conversions done by compiler at the time of compilation.
Integer i=10; 
//after compilation this line will become Integer i=Integer.valueof(10);
System.out.println(i);
Autoboxing concept internally implemented by using valueOf();
Autounboxing:-
The auto conversion of the wrapper object to the primitive value is called autounboxing and 
these conversions are done by compiler at the time of compilation.
Integer ob=new Integer(10);
Int a=ob;
//after compilation this line will become int a=ob.intValue();
System.out.println(a);
Automatic conversion of the primitive to wrapper and wrapper to the primitive:-




generic

io

util

sql

regs



awt
applet
swing
net