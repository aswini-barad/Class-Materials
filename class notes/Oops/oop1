modifier class  classname
{
    releated data and method ;
    constructor
    nested class
    ....
}

How to create object
____________________

new classname(argument);  //nameless object

classname objectrefernce;
objectrefernce=new classname(argument);

or
classname objectrefernce=new classname(argument);

Hot to acess data and method 
_________________________________________
objectrefernce.data;
objectrefernce.methodname(args);

modifier
___________
public
private
protected
default(no keyword)
final
static
native


....11


without oops
_____________
class Test1
{
	public static void main(String arg[])
	{
	  String name="muna";
	  int roll=1;
	  double mark=90.50;
	  System.out.println("my name="+name);
	  System.out.println("my roll="+1);
	  System.out.println("my mark="+mark);
	}
}



class Test2
{
	public static void main(String arg[])
	{
	  String name="muna";
	  int roll=1;
	  double mark=90.50;
	  name="kuna";
	  roll=2;
	  mark=59.50;
	  System.out.println("my name="+name);
	  System.out.println("my roll="+roll);
	  System.out.println("my mark="+mark);
	}
}

first student data loss


class Test3
{
	public static void main(String arg[])
	{
	  String name="muna";
	  int roll=1;
	  double mark=90.50;
	 String name1="kuna";
	  int roll1=2;
	 double  mark1=59.50;
	  System.out.println("my name="+name);
	  System.out.println("my roll="+1);
	  System.out.println("my mark="+mark);
	   System.out.println("my name="+name1);
	  System.out.println("my roll="+roll1);
	  System.out.println("my mark="+mark1);
	}
}



5 student 5 name 5 rollno 5 mark  program .
oops same memory but easy way


class Student
{
	String name;
	int roll;
	double mark;
}
class Opp1
{
	public static void main(String arg[])
	{
	 Student s=new Student();
	 System.out.println("my name="+s.name);
	  System.out.println("my roll="+s.roll);  
	   System.out.println("my mark="+s.mark);

	}
}




class Student
{
	String name;
	int roll;
	double mark;
}
class Opp2
{
	public static void main(String arg[])
	{
	 Student s=new Student();
	 s.name="muna";
	 s.roll=1;
	 s.mark=90.50;
	 System.out.println("my name="+s.name);
	  System.out.println("my roll="+s.roll);  
	   System.out.println("my mark="+s.mark);
	}
}






class Student
{
	String name;
	int roll;
	double mark;
}
class Opp3
{
	public static void main(String arg[])
	{
	 Student s=new Student();
	 s.name="muna";
	 s.roll=1;
	 s.mark=90.50;
	 System.out.println("my name="+s.name);
	  System.out.println("my roll="+s.roll);  
	   System.out.println("my mark="+s.mark);
	   Student s1=new Student();
	 s1.name="muna";
	 s1.roll=1;
	 s1.mark=90.50;
	 System.out.println("my name="+s1.name);
	  System.out.println("my roll="+s1.roll);  
	   System.out.println("my mark="+s1.mark);
	}
	}
}






class Student
{

	private String name;
	private int roll;
	 private double mark;
}
class Opp4
{
	public static void main(String arg[])
	{
	 Student s=new Student();  //object create 
	 s.name="muna"; // private not acess outside class
	 s.roll=1;  // error
	 s.mark=90.50; // error
	 System.out.println("my name="+s.name);  // private not acess outside class
	  System.out.println("my roll="+s.roll);  
	   System.out.println("my mark="+s.mark);
	
	  
	}
	}
}

o/p:
error

solve using method

class Student
{

	private String name;
	private int roll;
	 private double mark;
	 void init()
	 {
         name="muna";
         roll=1;
         mark=90.50;
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }

}
class Oop5
{
	public static void main(String arg[])
	{
	      Student s=new Student();
	     // s.name="muna"; error
	     s.init();
	     s.disp();
	}
}










class Student
{
	private String name;
	private int roll;
	 private double mark;
	 void init()
	 {
         name="muna";
         roll=1;
         mark=90.50;
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }
}
class Oop5
{
	public static void main(String arg[])
	{
	      Student s=new Student();
	    
	     s.init();
	     s.disp();
	       Student s1=new Student();
	      s1.init();
	      s1.disp();

	}
}



here all student data same. 
(1)solve take input from keyboard


import java.util.*;
class Student
{
	private String name;
	private int roll;
	 private double mark;
	 void init()
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter name roll and mark ");
         name=sc.nextLine();
         roll=sc.nextInt();
         mark=sc.nextDouble();
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }
}
class Oop6
{
	public static void main(String arg[])
	{
	      Student s=new Student();
	    
	     s.init();
	     s.disp();
	       Student s1=new Student();
	      s1.init();
	      s1.disp();

	}
}





(2)solve using argument


class Student
{
	private String name;
	private int roll;
	 private double mark;
	 void init(String n,int r,double mark)
	 {
	  
         name=n;
         roll=r;   //by default  this.roll=r;
         this.mark=mark;
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }
}
class Oop6
{
	public static void main(String arg[])
	{
	      Student s=new Student();
	    
	    s.init("muna",1,90.50);
	     s.disp();
	       Student s1=new Student();
	      s1.init("kuna",2,80.50);
	      s1.disp();
	}
}






class Student
{
	private String name;
	private int roll;
	 private double mark;
	 Student(String n,int r,double mark)  //constructor call when object create
	 {
	  
         name=n;
         roll=r;   //by default  this.roll=r;
         this.mark=mark;
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }
}
class Oop7
{
	public static void main(String arg[])
	{
	      Student s=new Student("muna",1,90.50);
	     s.disp();
	       Student s1=new Student("kuna",2,80.50);
	      s1.disp();
	}
}


Ooop7.java

javac Oop7.java
java Oop7