Object
________

toString()
equals()
hashcode()
getclass()
finalize()

clone(): to create duplicate object

class Test  implements Cloneable
{
    int a,b;
    Test(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
	public static void main(String arg[]) throws Exception
	{
		 Test t=new Test(3,5);
		Test t1=(Test)t.clone();
		
		 System.out.println(t.a+" "+t.b);
		 System.out.println(t1.a+" "+t1.b);
		 t.a=7;
		 t.b=8;
		 		 System.out.println(t.a+" "+t.b);
		 System.out.println(t1.a+" "+t1.b);
	}
}

o/P:
C:\Users\HP\Desktop>java Test
3 5
3 5
7 8
3 5

Exception handling
________________________


class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 System.out.println(10/2);
		 System.out.println("B");
	}
}


o/p:
A
5
B


class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 System.out.println(10/0);
		 System.out.println("B");
	}
}
C:\Users\HP\Desktop>javac 1.java

C:\Users\HP\Desktop>java Test
A
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(1.java:7)

what is exception
_________________
A unwated event that distrube normal flow of execution is called is exception.

exception handling
___________________

it provides alternate way to execute rest of the program.

it is possible  using some keyword

try
catch
finally
throw
throws


exception are 2 types
______________________
(1)checked exception
(2)uncheked exception

checked exception
___________________
the exception is checked in complile time 


unchecked  exception
______________________
the exception at runtime.





try 
{
	 risk code
}
catch(Exceptioname e)
{
	handle code
}


class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 try 
		 {
		 	   System.out.println(10/0);
		 	   System.out.println("try end");
		 }
		 catch(ArithmeticException e)
		 {
		 	   System.out.println("exception handle  d never zero");
		 }
		 System.out.println("B");
		 System.out.println("main end");
	}
}

o/p:
A
exception handle  d never zero
B
main end



class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 try 
		 {
		 	   System.out.println(10/2);
		 	   System.out.println("try end");
		 }
		 catch(ArithmeticException e)
		 {
		 	   System.out.println("exception handle  d never zero");
		 }
		 System.out.println("B");
		 System.out.println("main end");
	}
}

C:\Users\HP\Desktop>javac 1.java

C:\Users\HP\Desktop>java Test
A
5
try end
B
main end

C:\Users\HP\Desktop>



class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 try 
		 {
		 	   System.out.println(10/0);  
		 	   System.out.println("try end");
		 }
		 catch(NullPointerException e)
		 {
		 	   System.out.println("exception handle  d never zero");
		 }
		 System.out.println("B");
		 System.out.println("main end");
	}
}



o/p:

A
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(1.java:9)

class Test  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 try 
		 {
		 	   System.out.println(10/0);  
		 	   System.out.println("try end");
		 }
		 catch(Exception e)
		 {
		 	   System.out.println("exception handle  d never zero");
		 }
		 System.out.println("B");
		 System.out.println("main end");
	}
}

o/p:
C:\Users\HP\Desktop>java Test
A
exception handle  d never zero
B
main end