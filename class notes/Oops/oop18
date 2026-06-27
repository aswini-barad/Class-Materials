class Test
{
	public static void main(String arg[])
	{
	    System.out.println("A");
         try 
         {
         	System.out.println(10/0);
         	System.out.println("try end ");
         }
         catch(ArithmeticException e)
         {
         	   System.out.println(e);
         	   System.out.println("Exception caught");
         }
	    
	    System.out.println("program end");
	}
}

o/p:
A
java.lang.ArithmeticException: / by zero
Exception caught
program end

class Test
{
	public static void main(String arg[])
	{
	    System.out.println("A");
         try 
         {
         	System.out.println(10/2);
         	System.out.println("try end ");
         }
         catch(ArithmeticException e)
         {
         	   System.out.println(e);
         	   System.out.println("Exception caught");
         }
	    
	    System.out.println("program end");
	}
}


o/p:
A
5
try end
program end


class Test
{
	public static void main(String arg[])
	{
	    System.out.println("A");
         try 
         {
         	System.out.println(10/2);
         	System.out.println("try end ");
         }
         catch(NullPointerException e)
         {
         	   System.out.println(e);
         	   System.out.println("Exception caught");
         }
	    
	    System.out.println("program end");
	}
}


o/p:
A
5
try end
program end

class Test
{
	public static void main(String arg[])
	{
	    System.out.println("A");
         try 
         {
         	System.out.println(10/0);
         	System.out.println("try end ");
         }
         catch(NullPointerException e)
         {
         	   System.out.println(e);
         	   System.out.println("Exception caught");
         }
	    
	    System.out.println("program end");
	}
}

o/p:
A
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(1.java:8)

 class Test
{
	public static void main(String arg[])
	{
	    System.out.println("A");
         try 
         {
         	System.out.println(10/0);
         	System.out.println("try end ");
         }
         catch(Exception e)
         {
         	   System.out.println(e);
         	   System.out.println("Exception caught");
         }
	    
	    System.out.println("program end");
	}
}


o/p:
A
java.lang.ArithmeticException: / by zero
Exception caught
program end

class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,7,8};
         try 
         {
	    System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught "+e);
		}
	    System.out.println("program end");
	}
}


o/p:
8
program end 

class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,7,8};
         try 
         {
	    System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught "+e);
		}
	    System.out.println("program end");
	}
}


o/p:
C:\Users\HP\Desktop>java Test
exception caught java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
program end

class Test
{
	public static void main(String arg[])
	{
	   int arr[]=null;
        System.out.println(arr.length);
	}
}
Exception in thread "main" java.lang.NullPointerException
        at Test.main(1.java:6)

class Test
{
	public static void main(String arg[])
	{
	   String s="hi";
	   System.out.println(s.charAt(0));
	   System.out.println(s.charAt(2));
	}
}

h
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 2
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
        at java.base/java.lang.String.charAt(String.java:693)
        at Test.main(1.java:7)
class Test
{
	public static void main(String arg[])
	{
	   String s="123";
	   int no=Integer.parseInt(s);
	   System.out.println(no);
	}
}


o/p:
123

class Test
{
	public static void main(String arg[])
	{
	   String s="one";
	   int no=Integer.parseInt(s);
	   System.out.println(no);
	}
}

o/p:
Exception in thread "main" java.lang.NumberFormatException: For input string: "one"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at Test.main(1.java:6)
class Test
{
	public static void main(String arg[])
	{
	   String s="one";
	   int no=Integer.parseInt(s);
	   System.out.println(no);
	}
}

try with multiple catch
____________________________


try 
{

}
catch(Exceptionname e)
{

}
catch(Exceptionname e)
{
	
}


class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,5,8};
	   try 
	   {
	   	 System.out.println(arr[2]/2);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
	   	System.out.println("exception caught 1 "+e);
	   }
	   catch(ArithmeticException e)
	   {
	   	 System.out.println("exception caught 2 "+e);
	   }
	   
	}
}



o/p:
4


class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,5,8};
	   try 
	   {
	   	 System.out.println(arr[2]/2);
	   }
	   catch(Exception e)
	   {
	   	System.out.println("exception caught 1 "+e);
	   }
	   catch(ArithmeticException e)
	   {
	   	 System.out.println("exception caught 2 "+e);
	   }
	   
	}
}

C:\Users\HP\Desktop>javac 1.java
1.java:14: error: exception ArithmeticException has already been caught
           catch(ArithmeticException e)
           ^
1 error

C:\Users\HP\Desktop


class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,5,8};
	   try 
	   {
	   	 System.out.println(arr[2]/2);
	   }
	   
	   catch(ArithmeticException e)
	   {
	   	 System.out.println("exception caught arith "+e);
	   }
	   catch(Exception e)
	   {
	   	System.out.println("exception caught all type "+e);
	   }
	}
}


o/p:
4

class Test
{
	public static void main(String arg[])
	{
	   int arr[]={10,5,8};
	   try 
	   {
	   	 System.out.println(arr[3]/2);
	   }
	   
	   catch(ArithmeticException e)
	   {
	   	 System.out.println("exception caught arith "+e);
	   }
	   catch(Exception e)
	   {
	   	System.out.println("exception caught all type "+e);
	   }
	}
}


o/p:
exception caught all type java.lang.ArrayIndexOutOfBoundsException: Index 3 out of b


class Test
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	 System.out.println(10/2);
	   }
	   finally
	   {
	   	  System.out.println("must executed ");
	   }
	   
	   System.out.println("program end");
	}
}


o/p:
5
must executed
program end

class Test
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	 System.out.println(10/0);
	   }
	   finally
	   {
	   	  System.out.println("must execute");
	   }
	   
	   System.out.println("program end");
	}
}

must execute
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(1.java:8)

 class Test
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	 System.out.println(10/0);
	   }
	   catch(Exception e)
	   {
	   	 System.out.println("exception caught "+e);
	   }
	   finally
	   {
	   	  System.out.println("must execute");
	   }
	   
	   System.out.println("program end");
	}
}
exception caught java.lang.ArithmeticException: / by zero
must execute
program end


class Test
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	 System.out.println(10/2);
	   }
	   catch(Exception e)
	   {
	   	 System.out.println("exception caught "+e);
	   }
	   finally
	   {
	   	  System.out.println("must execute");
	   }
	   
	   System.out.println("program end");
	}
}

o/p:
5
must execute
program end





class Test
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	  if(true)
	   	  {
	   	  	return ;
	   	  }
	   	 System.out.println(10/0);
	   	 
	   }
	   catch(Exception e)
	   {
	   	 System.out.println("exception caught "+e);
	   }
	   finally
	   {
	   	  System.out.println("must execute");
	   }
	   
	   System.out.println("program end");
	}
}

o/p:
must execute


throw  and throws 
___________________

throw : it is used to create exception explictly.
         inside method and constructor

throws :responsblity return to the caller method 
		method defination write side .  

) try: To maintain risky code. 
2) catch: To maintain handling code. 
3) finally: To maintain cleanup code. 
4) throw: To handover our created exception object to the JVM manually. 
5) throws: To delegate responsibility of exception handling to the caller method.




class X 
{
	 static 
	 {
	 	System.out.println("static block x");
	 }
}
class Test
{
	public static void main(String arg[])
	{
	    Class.forName("x");
	}
}
C:\Users\HP\Desktop>javac 1.java
1.java:13: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
            Class.forName("x");
                         ^
1 error

 must be caught    try catch  

class X 
{
	 static 
	 {
	 	System.out.println("static block x");
	 }
}
class Test
{
	public static void main(String arg[])throws ClassNotFoundException
	{
	    Class.forName("X");
	}
}

o/p: 
static block x



class X 
{
	 static 
	 {
	 	System.out.println("static block x");
	 }
}
class Test
{
	public static void main(String arg[])throws ClassNotFoundException
	{
	    Class.forName("Y");
	}
}

C:\Users\HP\Desktop>javac 1.java

C:\Users\HP\Desktop>java Test
Exception in thread "main" java.lang.ClassNotFoundException: Y
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:315)
        at Test.main(1.java:12)

class X 
{
	 static 
	 {
	 	System.out.println("static block x");
	 }
}
class Test
{
	 static void show()throws ClassNotFoundException
	 {
	 	Class.forName("Y");
	 }
	public static void main(String arg[])
	{
		  try 
		  {
		  	show();
		  }
	      catch(Exception e)
	      {
	      	System.out.println("exception caught "+e);
	      }
	}
}

o/p:

exception caught java.lang.ClassNotFoundException: Y



class Test
{
	
	public static void main(String arg[])
	{
		throw new ArithmeticException();  
	}
}


Exception in thread "main" java.lang.ArithmeticException
        at Test.main(1.java:7)