Functional interfaces:

Functional interfaces are new additions in Java 8. As a rule, a functional interface can contain exactly one abstract method. These functional interfaces are also called Single Abstract Method interfaces (SAM Interfaces).

or



A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of the examples of functional interfaces. 

Functional Interface is additionally recognized as Single Abstract Method Interfaces. In short, they are also known as SAM interfaces. Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming. 

Functional interfaces are included in Java SE 8 with Lambda expressions and Method references in order to make code more readable, clean, and straightforward. Functional interfaces are interfaces that ensure that they include precisely only one abstract method. Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface. As described earlier, functional interfaces can contain only one abstract method. However, they can include any quantity of default and static methods
interface A
{
	void show();
}



EX:
public interface java.lang.Runnable {
  public abstract void run();
}


Compiled from "ActionListener.java"
public interface java.awt.event.ActionListener extends java.util.EventListener {
  public abstract void actionPerformed(java.awt.event.ActionEvent);
}




nested class
________

(1)regular nest class (non static )
(2)static nested class
(3)local inner class
(4)Annomus inner class (very very imp)

(1)regular nest class (non static )
class Outer  //default //public
{
	void show()
	{
	 System.out.println("show ");
	}
	class Inner   //private//default/protected/public
	{
		void disp()
		{
		 System.out.println("disp ");
		}
	}
}
class Test
{
	public static void main(String arg[])
	{
	  Outer o=new Outer();
	  o.show();
	  Outer.Inner i=o.new Inner();
	  i.disp();
	}
}

after compile

Outer.class
 Outer$Inner.class
 Test.class


 o/p:
 show
disp


(2)static nested class
class Outer  //default //public
{
	static void show()
	{
	 System.out.println("show ");
	}
	static class Inner   //private//default/protected/public
	{
		void disp()
		{
		 System.out.println("disp ");
		}
	}
}
class Test
{
	public static void main(String arg[])
	{
	  
	  Outer.show();
	  Outer.Inner i=new Outer.Inner();
	  i.disp();
	}
}

after compile

Outer.class
 Outer$Inner.class
 Test.class


 o/p:
 show
disp



(3)local inner class

a class inside method that class is 

class Outer  
{
     void show()
    {
      
        System.out.println("show ");
         class B
         {
             void disp()
             {
                 System.out.println("disp method ");
             }
         }
         B obj=new B();
         obj.disp();
         class C
         {
            
         }
    }
    
    
}
class Test
{
    public static void main(String arg[])
    {
      
     Outer o=new Outer();
     o.show();
    }
}


o/p:
show
disp method

after compile 
____
Outer$1B
Outer$1C
Outer.class
Test.class


(4)Annomus inner class (very very imp)


classname objrefence=new classname()
{
	
};




class A
{
	
}

A ob=new A();   //A class Object 

A ob=new A()
{
	
};  // annoums innclass Object 





class Test
{
    public static void main(String arg[])
    {
      
      Test t=new Test();
      Test t1=new Test()
      {

      };
      Test t2=new Test()
      {

      };
    }
}

after Compile

Test.class 
Test$1.class 
Test$2.class 

C:\Users\HP\Desktop\oops java>javap Test$1
Compiled from "1.java"
class Test$1 extends Test {
  Test$1();
}

C:\Users\HP\Desktop\oops java>javap Test$2
Compiled from "1.java"
class Test$2 extends Test {
  Test$2();
}



class A 
{

}
class Test
{
    public static void main(String arg[])
    {
      
      A t=new A();
      A t1=new A()
      {

      };
      A t2=new A()
      {

      };
    }
}


after Compile
A.class
Test.class 
Test$1.class 
Test$2.class 

Compiled from "1.java"
class Test$1 extends A {
  Test$1();
}

C:\Users\HP\Desktop\oops java>javap Test$2
Compiled from "1.java"
class Test$2 extends A {
  Test$2();
}



abstract class A
{
    abstract void show();
}
class Test
{
    public static void main(String arg[])
    {
       A ob=new A()
       {
             void show()
             {
                System.out.println("show override");
             }

       };
       ob.show();
    }
}
o/p:
show override




abstract class A
{
    abstract void show();
    
}
class Test
{
    public static void main(String arg[])
    {
      new A()
       {
             void show()
             {
                System.out.println("show override");
             }
             
       }.show();
    }
}
o/p:
show override



interface A
{
    abstract void show();
}
class Test
{
    public static void main(String arg[])
    {
       A ob=new A()
       {
             void show()
             {
                System.out.println("show override");
             }

       };
       ob.show();
    }
}

o/p:
show override





interface A
{
    abstract void show();
}
class B
{
    void disp(A x)
    {
        x.show();
    }
}
class Test
{
    public static void main(String arg[])
    {
       A ob=new A()
       {
            public void show()
             {
                System.out.println("show override");
             }

       };
       B obj=new B();
       obj.disp(ob);
    }
}
o/p:
show override




interface A
{
    abstract void show();
}
class B
{
    void disp(A x)
    {
        x.show();
    }
}
class Test
{
    public static void main(String arg[])
    {
       
       B obj=new B();
       obj.disp(

        new A()
       {
            public void show()
             {
                System.out.println("show override");
             }

       });
    }
}
o/p:
show override

lambda function
_____

with lambda using class
__________
interface Arith
{
    abstract int add(int x,int y);
}
class B implements Arith
{
    public int add(int x,int y)
            {
                return x+y;
            }
}
class Test
{
    public static void main(String arg[])
    {
       Arith a=new B();
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}
without lamda  using annoums class
__________
interface Arith
{
    abstract int add(int x,int y);
}

class Test
{
    public static void main(String arg[])
    {
       Arith a=new Arith()
       {

            public int add(int x,int y)
            {
                return x+y;
            }
       };
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}


using lambda
_______

interface Arith
{
    abstract int add(int x,int y);
}

class Test
{
    public static void main(String arg[])
    {
       Arith a=(x,y)->x+y;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}
o/p:
sum=30

interface A
{
    abstract void show();
}

class Test
{
    public static void main(String arg[])
    {
       A ob=()->System.out.println("hi");
       ob.show();
    }
}
o/p:
hi


static method refernce
________
interface A
{
    abstract void show();
}
class B
{
    static void disp()
    {
        System.out.println("hi");
    }
}
class Test
{
    public static void main(String arg[])
    {
        A ob=B::disp;
        ob.show();
    }
}
o/p:
hi




interface Arith
{
    abstract int add(int x,int y);
}
class B
{
    static int f1(int x,int y)
    {
        return x+y;
    }
}
class Test
{
    public static void main(String arg[])
    {
       Arith a=B::f1;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}
o/p:
sum =30




non static method refernce
_________
interface Arith
{
    abstract int add(int x,int y);
}
class B
{
     int f1(int x,int y)
    {
        return x+y;
    }
}
class Test
{
    public static void main(String arg[])
    {
        B ob=new B();
       Arith a=ob::f1;
       int res=a.add(10,20);
       System.out.println("sum="+res);
    }
}


o/p:
sum=30


interface A
{
    abstract void show();
}
class B
{
     void disp()
    {
        System.out.println("hi");
    }
}
class Test
{
    public static void main(String arg[])
    {
        B obj=new B();
        A ob=obj::disp;
        ob.show();
    }
}


o/p:
hi




constructor method refernce
___________
interface A
{
    abstract void show();
}
class B
{
    B()
    {
        System.out.println("hi");
    }
}
class Test
{
    public static void main(String arg[])
    {
    
        A ob=B::new;
        ob.show();
    }
}








interface Arith
{
    abstract void add(int x,int y);
}
class B
{
    B(int x,int y)
    {
           System.out.println(x+y);
    }
}
class Test
{
    public static void main(String arg[])
    {
       Arith ob=B::new;
       ob.add(10,20);

    }
}