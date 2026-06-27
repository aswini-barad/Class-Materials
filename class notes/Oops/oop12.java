nested class
_________________

(1)regular nested class  //non static inner class

class Outer
{
	datamember;
	class Inner
	{

	}
}

how to create innerclass object

Outer obj=new Outer()
Outer.Inner ob=obj.new Inner();

 class A
{
	 int x=10;
  class B
	{
         int y=20;
         void show()
         {
         	System.out.println(x+" "+y);
         }
	}

}
class Test
{
	public static void main(String arg[])
	{
      A ob=new A();
      A.B obj=ob.new B();
      obj.show();
      System.out.println(obj.y);
      //System.out.println(obj.x); error
      System.out.println(ob.x); 
	}
}


(2)static inner class 
________________________
class Outer
{
	datamember;
	static class Inner
	{

	}
}


Outer.Inner obj=new Outer.Inner();


 class A
{
	 
 static  class B
	{
        
        static void show()
         {
         	System.out.println("show method ");
         }
	}

}
class Test
{
	public static void main(String arg[])
	{
      A.B.show();

	}
}

o/p:
show method









 class A
{
	 
 static  class B
	{
         int y=20;
         void show()
         {
         	System.out.println(y);
         }
	}

}
class Test
{
	public static void main(String arg[])
	{
      A.B obj=new A.B();
      obj.show();

	}
}





(3)method inner class
________________________

a class defined inside the method 





 class A
{
	 
         void show()
         {
         	   int x=10;
               class B
               {
                    int y=20;
                    void disp()
                    {
                        System.out.println(x+" "+y);
                     }
               }
               class C
               {
               	
               }
               B obj=new B();
               obj.disp();
         }
	

}
class Test
{
	public static void main(String arg[])
	{
        A ob=new A();
        ob.show();
	}
}

Test.class
A.class
01-08-2025  10:05             1,025 A$1B.class
01-08-2025  10:05               327 A$1C.class


final   modigier
___________________

class Test
{
	public static void main(String arg[])
	{
     final int a=10;
   //  a=20; // error
   System.out.println(a);
	}
}

final method never overriding


final class not inhertiance
________________________________



final class A
{

}
class B  extends A
{

}
class Test
{
	public static void main(String arg[])
	{
     
     }
}


5.java:5: error: cannot inherit from final A
class B  extends A
                 ^
1 error

predefined final class   String Math 





package
__________

package is a folder.
every folder is not package

package is collection releated classes and interface enum.

package are 2 types
____________________
(1)predefined  package

java.lang.*; //by default every program top avaliable     String Math System ,.....

lang
util
awt
io
sql
net
reg
...
...


(2)userdefined package 
created by programmer


using package keyword we create package

package packagename;
import ....
public class classname
{
	
}


How to acess  class inside package
_________________






javaprogramoops->x->y
MyMath.java

package pk;
public class MyMath
{
   int no1,no2;
	public MyMath(int x,int y)
	{
        no1=x;
        no2=y;
	}
	public void add()
	{
        System.out.println("sum="+(no1+no2));
	}
	public static void show()
	{
	  System.out.println("math show ");
	}
	static void look()
	{
	  System.out.println("look method ");
	}
}


open command prompt here 
C:\Users\LENOVO\OneDrive\Desktop\JAVAPROGRAMOOPS\x\y>javac -d . MyMath.java

after compile package pk create  inside package   MYMath.class  




How to acess that MYMath class outside  package 

javaprogramoops->

class MyTest
{
	public static void main(String arg[])
	{
	   pk.MyMath.show();
	}
} 


set classpath=C:\Users\LENOVO\OneDrive\Desktop\JAVAPROGRAMOOPS\x\y;.
 

 javac MyTest.java
 java MyTest


o/p:
math show


(1)full qulify name
class MyTest
{
	public static void main(String arg[])
	{
	   pk.MyMath.show();
	   pk.MyMath p=new pk.MyMath(10,20);
	  p.add();
	  // pk.MyMath.look(); not public
	}
}



(2) import 
import pk.MyMath;
class MyTest
{
	public static void main(String arg[])
	{
	   MyMath.show();
	   MyMath p=new MyMath(10,20);
	  p.add();
	  // pk.MyMath.look(); not public
	}
}



javaprogramoops->x->y
MyUtil.java

package pk;
public class MyUtil
{
	 static public void sub(int x,int y)
	 {
	    System.out.println(x-y);
	 }
}

C:\Users\LENOVO\OneDrive\Desktop\JAVAPROGRAMOOPS\x\y>javac -d . MyUtil.java





import pk.MyMath;
import pk.MyUtil;
class MyTest
{
	public static void main(String arg[])
	{
	   MyMath.show();
	   MyMath p=new MyMath(10,20);
	  p.add();
	  // pk.MyMath.look(); not public
	  MyUtil.sub(30,20);
	}
}



or


import pk.*;
class MyTest
{
	public static void main(String arg[])
	{
	   MyMath.show();
	   MyMath p=new MyMath(10,20);
	  p.add();
	  // pk.MyMath.look(); not public
	  MyUtil.sub(30,20);
	}
}



del  MyMath.java MYUtil.java that location   (bad file )