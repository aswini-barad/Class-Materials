class classname
{
	
	releated data or properties 

	releated method 
	releated block
	..
	..
	constructor

}


how to create object
________________________

new classname(argument);   //object create    nameless object


classname objectrefernce;
objectrefence=new classname(argument);

or
classname objectrefernce=new classname(argument);


based on static modifer method are 2 types

(1)static  method
(2)non static method

class classname
{
	
	static returntype methodname(argument) //static method
	{

	}
	returntype methodname(argument)   //non static method
	{

	}
	static returntype methodname(argument)
	{

	}
}


how to acess static and non static method  inside static method in same class
______________________________

(1)access static method

(a)directly
(b)by classname
(c)by objectrefernce or by object

(2)access non static method 

(a)by objectrefernce or by object

class Test
{
	static void show()
	{
	    System.out.println("static show method ");
	}
	public static void main(String arg[])
	{
	      show(); //by directly     better   
	      Test.show(); //by classname
	      Test t=new Test();
	      t.show(); //by objectrefernce
	      new Test().show() ; //by object
	}
}

o/p:
static show method
static show method
static show method
static show method




static call non static by object or object refernce
__________________________________________________________

class Test
{
	 void show()
	{
	    System.out.println("nonstatic show method ");
	}
	public static void main(String arg[])
	{
	     // show(); error  
	      //Test.show(); error 
	      Test t=new Test();
	      t.show(); //by objectrefernce
	      new Test().show() ; //by nameless object
	}
}

o/p:
nonstatic show method
nonstatic show method



how to acess static and non static method  inside non static method in same class
______________________________

(1)access static method

(a)directly   (better )
(b)by classname
(c)by objectrefernce or by object  (not requried )

(2)access non static method 
(a) directly  (better)
(b)by objectrefernce or by object (not requried  extra object  created )



class Test
{
    void f1()
    {

	  System.out.println("f1 method non static ");
    }
     static void f2()
    {

	  System.out.println("f2 method static ");
    }
    void show()
	{
	    System.out.println("nonstatic show method ");
	    f2(); // directly
	    Test.f2(); //by classname
	    Test t1=new Test(); // valid    (not requried)
	    t1.f2(); // not requried
        System.out.println("");
        f1(); //direct  better
        t1.f1(); //not reuired

	}
	public static void main(String arg[])
	{
	      
	      Test t=new Test();
	      t.show(); //by objectrefernce
	     
	}
}

o/p:
nonstatic show method
f2 method static
f2 method static
f2 method static
f1 method non static
f1 method non static


how to acess static and non static method  outside  static method in differnt class
______________________________

(1)access static method
(a)by classname
(c)by objectrefernce or by object(valid    not requried)

(2)access non static method 
(a)by objectrefernce or by object


class A
{
	static void show()
	{
	    System.out.println("static show method ");
	}
	
}

class Test
{
	public static void main(String arg[])
	{
	     // show(); //by directly     error
          A.show();  //    by classname  better    
          A ob=new A();
          ob.show();  // valid not required
	}  

}

o/p:
static show method
static show method


class Test
{
	public static void main(String arg[])
	{

	     System.out.println(Math.pow(2,3));
	     System.out.println(Math.PI);
	}  

}



(2)access non static method  outside class
(a)by objectrefernce or by object


class A
{
	 void show()
	{
	    System.out.println("nonstatic show method ");
	}
	
}
class Test
{
	public static void main(String arg[])
	{
	    // A.show(); // error
          A ob=new A();
          ob.show();  
	}  
}



predefined class   Scanner class      nextInt(),....    non static method



import java.util.Scanner;
class Test
{
	public static void main(String arg[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number ");
	   int no=sc.nextInt();
	   System.out.println(no);
	}  
}





how to acess static and non static method  outside  non static method in differnt class



(1)access static method
(a)by classname   (better)
(b)by objectrefernce or by object(valid    not requried)

(2)access non static method 
(a)by objectrefernce or by object



class A
{
	static void show()
	{
	    System.out.println("static show method ");
	}
  void look()
	{
	    System.out.println(" non static look method ");
	}
	
}

class Test
{

     void disp()
     {
           A.show(); 
           //A.look();  error
           A ob=new A();
           ob.show(); //valid not recommand
           ob.look();
     }
	public static void main(String arg[])
	{
	     Test t=new Test();
	     t.disp();
	}  

}


o/p:
static show method
static show method
non static look method


//wap store one student name rollno and mark display it without oops

class Test
{
	public static void main(String arg[])
	{
	     String name="muna";
	     int rollno=1;
	     double mark=90.50;
	     System.out.println("my name="+name);
	     System.out.println("my rollno="+rollno);
	     System.out.println("my mark="+mark);
	}
}


o/p:
my name muna
my rollno=1
my mark =90.50

here all information of student data store differnt location .
by using oops we store all data continously that concept is known as encapsulation

//wap store two student name rollno and mark display it without oops

class Test
{
	public static void main(String arg[])
	{
	     String name="muna";
	     int rollno=1;
	     double mark=90.50;
	      name="kuna";
	     rollno=2;
	     mark=80.50;
	     System.out.println("my name="+name);
	     System.out.println("my rollno="+rollno);
	     System.out.println("my mark="+mark);
	    

	}
}

o/P;
my name=kuna
my rollno=2
my mark=80.50

here first student data loss 
if we store both student data we can create 2 name 2 rollno 2mark


class Test
{
	public static void main(String arg[])
	{
	     String name="muna";
	     int rollno=1;
	     double mark=90.50;
	      String name1="kuna";
	     int rollno1=2;
	     double mark1=80.50;
	     System.out.println("my name="+name);
	     System.out.println("my rollno="+rollno);
	     System.out.println("my mark="+mark);
	     System.out.println("my name="+name1);
	     System.out.println("my rollno="+rollno1);
	     System.out.println("my mark="+mark1);

	}
}

o/P;
my name=muna
my rollno=1
my mark=90.50
my name=kuna
my rollno=2
my mark=80.50

2 student   2 name variable    2 rollno varibale 2 mark  variable created

100 student 100 name variable  100 rollno 100 mark created ()
if choose above style program length big.
slove these problem using oops concept  


by using oops concept 

class Test
{
         String name="muna";  //instance variable
	     int rollno=1;
	     double mark=90.50;
	public static void main(String arg[])
	{
	     Test t=new Test();
	     System.out.println("my name="+t.name);
	     System.out.println("my rollno="+t.rollno);
	     System.out.println("my mark="+t.mark);
	}
}


o/p
my name =muna
my rollno=1
my mark=90.50

class Student
{
	  String name="muna";  //instance variable
	     int rollno=1;
	     double mark=90.50;
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   System.out.println("my name="+s.name);
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	}
}
o/p:
my name=muna
my rollno=1
my mark=90.50

class Employee
{
	String nm="Kuna";
	String id="E201";
	int sal=50000;
	int ex=5;
	String br="IT";
}
class Test
{
	public static void main(String arg[])
	{
		Employee e=new Employee();
		System.out.println("Employee name="+e.nm);
		System.out.println("Employee id="+e.id);
		System.out.println("Employee salary="+e.sal);
		System.out.println("Employee experience="+e.ex);
		System.out.println("Employee branch="+e.br);
	}
}






class Student
{
	  String name="muna";  //instance variable
	     int rollno=1;
	     double mark=90.50;
}

class Test
{
	public static void main(String arg[])
	{
        
	   Student s=new Student();
	   System.out.println("my name="+s.name);
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	    Student s1=new Student();
	   System.out.println("my name="+s1.name);
	   System.out.println("my rollno="+s1.rollno);
	   System.out.println("my mark="+s1.mark);
	}
}
o/p:
my name=muna
my rollno=1
my mark=90.50
my name=muna
my rollno=1
my mark=90.50

here both student data same    
not initlize    instance variable


class Student
{
	  String name;  //instance variable    not initlize here
	     int rollno;
	     double mark;
	      //bollean default value   false
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   System.out.println("my name="+s.name);
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	}
}

o/p:
my name=null
my rollno=0
my mark=0.0



class Student
{
	  String name;  //instance variable    not initlize here
	     int rollno;
	     double mark;
	      //bollean default value   false
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.name="muna";
	   s.rollno=1;
	   s.mark=90.50;
	   System.out.println("my name="+s.name);
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	}
}

o/p:
my anme=muna
my rollno=1
my mark=90.50



class Student
{
	  String name;  //instance variable    not initlize here
	     int rollno;
	     double mark;
	      //bollean default value   false
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.name="muna";
	   s.rollno=1;
	   s.mark=90.50;
	   System.out.println("my name="+s.name);
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	   Student s1=new Student();
	   s1.name="kuna";
	   s.rollno=2;
	   s.mark=80.50;
	   System.out.println("my name="+s1.name);
	   System.out.println("my rollno="+s1.rollno);
	   System.out.println("my mark="+s1.mark);
	}
}


o/p:
my name=muna
my rollno=1
my mark=90.50
my name=kuna
my rollno=2
my mark=80.50


Q.above  style  2 emp  object  5 data   initlize display 


class Student
{
	 private String name;  //instance variable    not initlize here
	  private   int rollno;
	   private   double mark;
	      //bollean default value   false
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.name="muna";// error
	   s.rollno=1; // error ....
	   s.mark=90.50;
	   System.out.println("my name="+s.name); // error
	   System.out.println("my rollno="+s.rollno);
	   System.out.println("my mark="+s.mark);
	   Student s1=new Student();
	   s1.name="kuna";
	   s.rollno=2;
	   s.mark=80.50;
	   System.out.println("my name="+s1.name);
	   System.out.println("my rollno="+s1.rollno);
	   System.out.println("my mark="+s1.mark);
	}
}



o/p:
error
private acess inside Student not acess outside class


slove using method 

class Student
{
	 private String name;  
	  private   int rollno;
	   private   double mark;
     void set()    //initlization
     {
         name="muna";
         rollno=1;
         mark=90.50;
     }
     void disp()
     {
        System.out.println("my name= "+name);
         System.out.println("my rollno= "+rollno);
          System.out.println("my mark= "+mark);
     }
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	  // s.name="muna";// error
	   s.set();
	  // System.out.println("my name="+s.name); // error
	  s.disp();
	   
	}
}

o/p:
my name=muna
my rollno=1
my mark=90.50


Q.above  style  1 emp  object  5 data   initlize display 

class Student
{
	 private String name;  
	  private   int rollno;
	   private   double mark;
     void set()    //initlization
     {
         name="muna";
         rollno=1;
         mark=90.50;
     }
     void disp()
     {
        System.out.println("my name= "+name);
         System.out.println("my rollno= "+rollno);
          System.out.println("my mark= "+mark);
     }
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.set();
	  s.disp();
	  Student s1=new Student();
	   s1.set();
	  s1.disp();
	   
	}
}

o/p:
my name=muna
my rollno=1
my mark=90.50
my name=muna
my rollno=1
my mark=90.50



here all student data  are same 
if we provide differnt student differnt data 
it is possible using 2 concept
(1)using Scanner class take input
(2)take method argument 

(1)using Scanner class take input

import java.util.Scanner;
class Student
{
	 private String name;  
	  private   int rollno;
	   private   double mark;
     void set()    //initlization
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter name rollno and mark ");
         name=sc.nextLine();
         rollno=sc.nextInt();
         mark=sc.nextDouble();
         sc.nextLine();
     }
     void disp()
     {
        System.out.println("my name= "+name);
         System.out.println("my rollno= "+rollno);
          System.out.println("my mark= "+mark);
     }
}

class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.set();
	 
	  Student s1=new Student();
	   s1.set();
	    s.disp();
	  s1.disp();
	   
	}
}

o/p:
enter name rollno and mark
a das
1
90.50

enter name rollno and mark
b das
2
80.50
my name= a das
my rollno= 1
my mark= 90.5
my name= b das
my rollno= 2
my mark= 80.5


Q  2 emp object 5 data above style

(2)slove take method argument 




class Student
{
	 private String name;  
	  private   int rollno;
	   private   double mark;
     void set(String n,int r,double m)    //initlization
     {
          
         name=n;
         rollno=r;
         mark=m;
     }
     void disp()
     {
        System.out.println("my name= "+name);
         System.out.println("my rollno= "+rollno);
          System.out.println("my mark= "+mark);
     }
}
class Test
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.set("muna",1,90.50);
	 
	  Student s1=new Student();
	   s1.set("kuna",2,80.50);
	    s.disp();
	  s1.disp();
	   
	}
}

Q  above style    emp  2 object 5 data