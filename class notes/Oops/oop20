import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test
{
	static void check(int no)
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();
	check(no);
     System.out.println("main end ");
	}

}

C:\Users\DELL\Desktop\java program>javac 1.java

C:\Users\DELL\Desktop\java program>java Test
enter a no
5
+ve
main end

C:\Users\DELL\Desktop\java program>java Test
enter a no
-2
Exception in thread "main" NegativeNumberException: negative number
        at Test.check(1.java:20)
        at Test.main(1.java:28)



import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test
{
	static void check(int no)
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();
	try 
	{
		check(no);
	}
	catch(NegativeNumberException e)
	{
		System.out.println(e);
	}
	
     System.out.println("main end ");
	}

}

o/p:

enter a no
-2
NegativeNumberException: negative number
main end



How to create checked Exception
____________________________________
import java.util.Scanner;
class NegativeNumberException extends Exception
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test
{
	static void check(int no)
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();

		check(no);
	
	
	
	
     System.out.println("main end ");
	}

}


Users\DELL\Desktop\java program>javac 1.java
1.java:20: error: unreported exception NegativeNumberException; must be caught or declared to be thrown
                throw new NegativeNumberException("negative number");
                ^
1 error




import java.util.Scanner;
class NegativeNumberException extends Exception
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test
{
	static void check(int no)throws NegativeNumberException 
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])throws NegativeNumberException 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();

		check(no);
	
	
	
	
     System.out.println("main end ");
	}

}

o/p:
C:\Users\DELL\Desktop\java program>java Test
enter a no
5
+ve
main end

C:\Users\DELL\Desktop\java program>java Test
enter a no
-2
Exception in thread "main" NegativeNumberException: negative number
        at Test.check(1.java:20)
        at Test.main(1.java:29)


import java.util.Scanner;
class NegativeNumberException extends Exception
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test
{
	static void check(int no)throws NegativeNumberException 
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();
         try 
         {
         	check(no);
         }
		 catch(NegativeNumberException e)
		 {
		 	System.out.println(e);
		 }
     System.out.println("main end ");
	}

}

C:\Users\DELL\Desktop\java program>java Test
enter a no
5
+ve
main end

C:\Users\DELL\Desktop\java program>java Test
enter a no
-2
NegativeNumberException: negative number
main end






multthreading
____________

class Test
{
	public static void main(String arg[])
	{
		 System.out.println(Thread.currentThread().getName());
		 Thread th=Thread.currentThread();
		 System.out.println(th.getName());
	}
}

o/p:
main
main  

How to create thread 
______________________
we can create thread 2 way 
(1)extend Thread class
(2)implements Runnable interface 

C:\Users\DELL\Desktop\java program>javap java.lang.Runnable
Compiled from "Runnable.java"
public interface java.lang.Runnable {
  public abstract void run();
}

C:\Users\DELL\Desktop\java program>javap java.lang.Thread
Compiled from "Thread.java"
public class java.lang.Thread implements java.lang.Runnable {
  java.lang.ThreadLocal$ThreadLocalMap threadLocals;
  java.lang.ThreadLocal$ThreadLocalMap inheritableThreadLocals;
  volatile java.lang.Object parkBlocker;
  public static final int MIN_PRIORITY;   1
  public static final int NORM_PRIORITY;  5
  public static final int MAX_PRIORITY;  10
  long threadLocalRandomSeed;
  int threadLocalRandomProbe;
  int threadLocalRandomSecondarySeed;
  void blockedOn(sun.nio.ch.Interruptible);
  public static native java.lang.Thread currentThread();
  public static native void yield();
  public static native void sleep(long) throws java.lang.InterruptedException;
  public static void sleep(long, int) throws java.lang.InterruptedException;
  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public java.lang.Thread();
  public java.lang.Thread(java.lang.Runnable);
  java.lang.Thread(java.lang.Runnable, java.security.AccessControlContext);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable);
  public java.lang.Thread(java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.String);
  public java.lang.Thread(java.lang.Runnable, java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long);
  public synchronized void start();
  public void run();
  public final void stop();
  public final synchronized void stop(java.lang.Throwable);
  public void interrupt();
  public static boolean interrupted();
  public boolean isInterrupted();
  public void destroy();
  public final native boolean isAlive();
  public final void suspend();
  public final void resume();
  public final void setPriority(int);
  public final int getPriority();
  public final synchronized void setName(java.lang.String);
  public final java.lang.String getName();
  public final java.lang.ThreadGroup getThreadGroup();
  public static int activeCount();
  public static int enumerate(java.lang.Thread[]);
  public native int countStackFrames();
  public final synchronized void join(long) throws java.lang.InterruptedException;
  public final synchronized void join(long, int) throws java.lang.InterruptedException;
  public final void join() throws java.lang.InterruptedException;
  public static void dumpStack();
  public final void setDaemon(boolean);
  public final boolean isDaemon();
  public final void checkAccess();
  public java.lang.String toString();
  public java.lang.ClassLoader getContextClassLoader();
  public void setContextClassLoader(java.lang.ClassLoader);
  public static native boolean holdsLock(java.lang.Object);
  public java.lang.StackTraceElement[] getStackTrace();
  public static java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> getAllStackTraces();
  public long getId();
  public java.lang.Thread$State getState();
  public static void setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler);
  public static java.lang.Thread$UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();
  public java.lang.Thread$UncaughtExceptionHandler getUncaughtExceptionHandler();
  public void setUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler);
  static void processQueue(java.lang.ref.ReferenceQueue<java.lang.Class<?>>, java.util.concurrent.ConcurrentMap<? extends java.lang.ref.WeakReference<java.lang.Class<?>>, ?>);
  static {};
}


Thread program using extend Thread class
___________________________________________
step1 : your class extends Thread
step2 : override run()  method (child thread logic )

step3 : create your class object 

step4 : call start() method  




class MyThread extends Thread 
{
	public void run()
	{
		 System.out.println("child thread");
	}
}
class Test
{
	public static void main(String arg[])
	{
		 System.out.println("main thread");
		 MyThread th=new MyThread();
		 th.start();
	}
}
o/p:
main thread 
child thread 

class MyThread extends Thread 
{
	public void run()
	{
		 int i; 
		 for(i=1;i<=5;i++)
		 {
		 System.out.println("child thread "+i);
		}
	}
}
class Test
{
	public static void main(String arg[])
	{
		
		 MyThread th=new MyThread();
		 th.start();
		 int i; 
		 for(i=1;i<=5;i++)
		 {
		 System.out.println("main thread "+i);
		}
	}
}

o/p:
C:\Users\DELL\Desktop\java program>java Test
main thread 1
main thread 2
child thread 1
main thread 3
main thread 4
child thread 2
main thread 5
child thread 3
child thread 4
child thread 5





Thread program using implement Runnable interface
___________________________________________
step1 : your class implmenets Runnable
step2 : override run()  method (child thread logic )

step3 : create your class object (Runnable type)

step4 : create Thread class object 
         inside Thread class constructor (your runnable class object refence)
step5 : call start() method  using Thread
  

  class MyRunnable implements Runnable
{
	public void run()
	{
		 System.out.println("child thread");
	}
}
class Test
{
	public static void main(String arg[])
	{
		 System.out.println("main thread");
		 MyRunnable r=new MyRunnable();
		 Thread th=new Thread(r);
		 th.start();
	}
}


How to check thread name and chage the thread name 

class MyThread extends Thread 
{
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());
	}
}
class Test
{
	public static void main(String arg[])
	{
		System.out.println(Thread.currentThread().getName());
		 MyThread th=new MyThread();
		 th.start();
	}
}

o/p: 
main
Thread-0


class MyThread extends Thread 
{
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());
	}
}
class Test
{
	public static void main(String arg[])
	{
		Thread.currentThread().setName("ram");
		System.out.println(Thread.currentThread().getName());
		 MyThread th=new MyThread();
		 th.setName("sita");
		 th.start();
	}
}


o/p: 
ram 
sita 



class MyThread extends Thread 
{
	MyThread(String s)
	{
		super(s);
	}
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());
	}
}
class Test
{
	public static void main(String arg[])
	{
		Thread.currentThread().setName("ram");
		System.out.println(Thread.currentThread().getName());
		 MyThread th=new MyThread("sita");
		 //th.setName("sita");
		 th.start();
	}
}

o/p:
ram 
sita 


How to acess Priority and change the Priority 
________________________________________________
class MyThread extends Thread 
{
	
	public void run()
	{
		 System.out.println(Thread.currentThread().getPriority());
	}
}
class Test
{
	public static void main(String arg[])
	{
		
		System.out.println(Thread.currentThread().getPriority());
		 MyThread th=new MyThread();
		 th.setPriority(10);
		 //th.setPriority(Thread.MAX_PRIORITY);
		 th.start();
	}
}

o/p :
5
10
/*
public static final int MIN_PRIORITY;   1
  public static final int NORM_PRIORITY;  5
  public static final int MAX_PRIORITY;  10

  */

class MyThread extends Thread 
{
	public void run()
	{
		 int i; 
		 for(i=1;i<=5;i++)
		 {
		 System.out.println("child thread "+i);
		}
	}
}
class Test
{
	public static void main(String arg[])
	{
		 MyThread th=new MyThread();
		  th.setPriority(10);
		 th.start();
		 int i; 
		 for(i=1;i<=5;i++)
		 {
		 System.out.println("main thread "+i);
		}
	}
}

o/p: 
main thread 1
main thread 2
child thread 1
child thread 2
child thread 3
child thread 4
child thread 5
main thread 3
main thread 4
main thread 5