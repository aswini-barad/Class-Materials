if else   statement
_______________________

if(condtion)
{
   true block 
}
else
{
    else block; 

}

//common


class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(true)
        { 
           System.out.println("B");
        }
        else 
        {
            System.out.println("C");
        }
       System.out.println("D");
        
    }
}
o/p:
A
B
D



class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(false)
        {
            System.out.println("B");
        }
        else 
        {
            System.out.println("C");
        }
       System.out.println("D");
        
    }
}


o/p:
A
C
D



class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(false)
        
            System.out.println("B");
        
        else 
        
            System.out.println("C");
        
       System.out.println("D");
        
    }
}



o/p:
A
C
D




class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(false)
            System.out.println("B");
            System.out.println("C");

        else 
        
            System.out.println("D");
            System.out.println("E");
        
       System.out.println("F");
        
    }
}


o/p:
1.java:12: error: 'else' without 'if'
        else
        ^
1 error





class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(false)
        {
            System.out.println("B");
            System.out.println("C");
        }
        else 
        
            System.out.println("D");
            System.out.println("E");
        
       System.out.println("F");
        
    }
}

o/p:
A
D
E
F





class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(true)
        {
            System.out.println("B");
            System.out.println("C");
        }
        else 
        
            System.out.println("D");
            System.out.println("E");
        
       System.out.println("F");
        
    }
}

o/p:
A
B
C
E
F




class Test
{
    public static void main(String arg[])
    {

        System.out.println("A");
        if(true)
        {
            System.out.println("B");
            System.out.println("C");
        }
        else 
        {
            System.out.println("D");
            System.out.println("E");
        }
        
       System.out.println("F");
        
    }
}


o/p:
A
B
C
F


class Test
{
    public static void main(String arg[])
    {

       int a=3,b=5;
       if(a<b)
       {
            a=10;
            b=20;
        }
       else 
       {
        a=30;
       b=40;
   	}
       System.out.println(a+" "+b);
        
    }
}


//wap take a number from keyboad check no is +ve or -ve

import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int no=sc.nextInt();
       if(no>=0)
       	System.out.println("+ve no");
       else
       	System.out.println("-ve no");
    }
}



//even odd
import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int no=sc.nextInt();
       if(no%2==0)
       System.out.println("even no");
       else
       System.out.println("odd no");
    }
}

/two no from keyboad check same or not same
import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int no1=sc.nextInt();
       System.out.println("enter another number ");
       int no2=sc.nextInt();
       if(no1==no2)
       System.out.println("same no");
       else
       System.out.println("different no");
    }
}


//wap take emp salary from keyboad if sal>=5000 da=30% hra=20% 
if sal<5000   da=10% hra=5%  then display basic sal ,da ,hra  totalsal.

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da=0,hra=0,total;
         if(sal>=5000)
         {
               da=sal*0.3;
               hra=sal*0.2;
         }
         else
         {
              da=sal*0.1;
              hra=sal*0.05;
         }
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);



     }
}





wap take a person age form keyboad check person is eligbilable voteing or not







ternary  operartor    or  condtional operator

exp1?exp2:exp3 

exp1  true    exp2  execute
exp1  false    exp3  execute

//check no is +ve or -ve  without using if else 
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        String msg;
        msg=no>=0?"+ve no":"-ve no";
        System.out.println(msg);
    }
}






//check no is even or odd without using if else 
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        String msg;
        msg=no%2==0?"even no":"odd no";
        System.out.println(msg);
    }
}



//wap take emp salary from keyboad if sal>=5000 da=30% hra=20% 
if sal<5000   da=10% hra=5%  then display basic sal ,da ,hra  totalsal.

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da,hra,total;
         da=sal>=5000?sal*0.3:sal*0.1;
         hra=sal>=5000>sal*0.2:sal*0.05;
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);

     }
}


//find bigest number

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two nos");
         int no1=sc.nextInt();
         int no2=sc.nextInt();
         int big;
         if(no1==no2)
         {
            System.out.println("all same number ")l
            System.exit(0);
         }
         big=no1>no2?no1:no2;
         System.out.println(big);

     }
}


nested if else 
__________________
syn1:
_______
if(c1)
{
    if(c2)
    {

    }
    else
    {

    }
}
//wap take a number from keyborad check no is +ve or -ve
import java.util.*;
class Test
{
	 public static void main(String arg[])
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a number ");
	     int no=sc.nextInt();
	     if(no!=0)
	     {
	         if(no>0)
	         {
                   System.out.println("+ve number ");
	         }
	         else
	         {
	               System.out.println("-ve number ");
	         }
	     }

	 }
}




syn2:
_______
if(c1)
{
    if(c2)
    {

    }
    else
    {

    }
}
else
{
    

}

//wap take a number from keyborad check no is +ve  -ve  zero
import java.util.*;
class Test
{
	 public static void main(String arg[])
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a number ");
	     int no=sc.nextInt();
	     if(no!=0)
	     {
	         if(no>0)
	         {
                   System.out.println("+ve number ");
	         }
	         else
	         {
	               System.out.println("-ve number ");
	         }
	     }
	     else
	     {
	          System.out.println("zero");
	     }

	 }
}

//wap take char from keyboard check char is alp  if alp check upper  or lower, not alp

import java.util.*;
class Test
{
	public static void main(String arg[])
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a char ");
	     char ch=sc.next().charAt(0);
	     if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
	     {
	         System.out.println("alp");
	         if(Ch>='A'&&ch<='Z')
	         {
                  System.out.println("uppercase");
	         }
	         else
	         {
	            System.out.println("lower case");
	         }
	     }
	     else
	     {
	        System.out.println("not alp");
	     }
      }
}

syn3:
if(c1)
{
    
}
else
{

      if(c2)
    {

    }
    else
    {

    }
    
}

//wap take a number from keyborad check no is zero +ve  -ve  zero
import java.util.*;
class Test
{
	 public static void main(String arg[])
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a number ");
	     int no=sc.nextInt();
	     if(no==0)
	     {
	           System.out.println("zero");
	         
	     }
	     else
	     {  
	         if(no>0)
	         {
                   System.out.println("+ve number ");
	         }
	         else
	         {
	               System.out.println("-ve number ");
	         }
	         
	     }

	 }
}



syn4:
if(c1)
{
      if(c2)
    {

    }
    else
    {

    }
    
}
else
{

      if(c3)
    {

    }
    else
    {

    }
    
}

//wap take three number from keyborad display the bigest number


import java.util.*;
class Test
{
	 public static void main(String arg[])
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter three numbers");
	     int no1=sc.nextInt();
	     int no2=sc.nextInt();
	     int no3=sc.nextInt();
	     if(no1>no2)
	     {
	         if(no1>no3)
	         {
                   System.out.println("first number is biger "+no1);
	         }
	         else
	         {
	            System.out.println("third number is biger "+no3);   
	         }
	     }
	     else
	     {
	          if(no2>no3)
	         {
                   System.out.println("second number is biger "+no2);
	         }
	         else
	         {
	            System.out.println("third number is biger "+no3);   
	         } 
	     }

	 }
}









//wap check  no is 0 +ve -ve using nested if else   syn3
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        if(no==0)
        {
          System.out.println("zero");
        }
        else
        {
           if(no>0)
           {
             System.out.println("+ve");
           }
           else
           {
              System.out.println("-ve");
           }
        }
    }
}





else if ladder statement
___________________
if(c1)
{
    
}
else if(c2)
    {

    }
else
    {

    }

where the condtion is true other condtion not checking.

//wap check  no is 0 +ve -ve using  else if ladder
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        if(no==0)
          System.out.println("zero");
        else if(no>0)
             System.out.println("+ve");
        else
            System.out.println("-ve"); 
    }
}


//wap take two no from keyboard check both number same ,1st>2nd  ,2nd>1st

import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number ");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        if(no1==no2)
          System.out.println("same number");
        else if(no1>no2)
             System.out.println("1st>2nd");
        else
            System.out.println("2nd>1st"); 
    }
}






//wap take a number from keyboad check no is sd dd td and od
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        //convert -ve to +ve
        if(no<0)
        {
          no=-no;
        }
        //check digit
        if(no<10)     //if(no/10==0)
          System.out.println("sd");
        else if(no<100)  //else if(no/100==0)
             System.out.println("dd");
        else if(no<1000) //else if(no/1000==0)
            System.out.println("td"); 
        else
            System.out.println("od");
    }
}



/*wap take emp salary from keyboad if sal>=8000 da=50% hra=40%
if sal<8000  and sal>=5000 da=40% hra=30%  if sal<5000 and sal>=3000
da=30% hra=20%  if sal<3000  da=20% hra=10%  then display basic sal ,da ,hra  totalsal*/

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da,hra,total;
         if(sal>=8000)
         {
            da=sal*0.5;
            hra=sal*0.4;
         }
         else if(sal>=5000)
         {
               da=sal*0.4;
               hra=sal*0.3;
         }
         else if(sal>=3000)
         {
                 da=sal*0.3;
                 hra=sal*0.2;
         }
         else
         {
              da=sal*0.2;
              hra=sal*0.1;
         }
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);

     }
}

o/p:
C:\Users\DELL\Desktop>java Test
enter a salary
9000
basic sal=9000.0
da=4500.0
hra=3600.0
total=17100.0

C:\Users\DELL\Desktop>java Test
enter a salary
1000
basic sal=1000.0
da=200.0
hra=100.0
total=1300.0




//wap take two number from keyboad enter your choice 1.add 2.sub 3.mult 
//other number invalid choice  (menu driven program)
import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two number ");
         int no1=sc.nextInt();
         int no2=sc.nextInt();
         System.out.println("enter your choice\n1.add\n2.sub\n3.mult");
         int ch=sc.nextInt();
         if(ch==1)
         {
            System.out.println("sum="+(no1+no2));
         }
         else if(ch==2)
         {
            System.out.println("sub="+(no1-no2));
         }
         else if(ch==3)
         {
            System.out.println("mult="+no1*no2);
         }
         else
         {
            System.out.println("invalid choice ");
         }

     }
}

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
1
sum=50

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
3
mult=600

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
4
invalid choice

import java.util.Scanner;
class Test {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Enter your choice (+, -, *): ");
        char ch = sc.next().charAt(0); // Read single character

        if (ch == '+') {
            System.out.println("Sum = " + (no1 + no2));
        } else if (ch == '-') {
            System.out.println("Sub = " + (no1 - no2));
        } else if (ch == '*') {
            System.out.println("Mult = " + (no1 * no2));
        } else {
            System.out.println("Invalid choice");
        }
    }
}


//wap take a number form keyboad check no is div by 5 and 7  only 5  only 7
//not div by 5 and 7

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number ");
         int no=sc.nextInt();
         if(no%35==0)
         {
            System.out.println("div by 5 and 7");
         }
         else if(no%5==0)
         {
            System.out.println("div by only 5");
         }
         else if(no%7==0)
         {
            System.out.println("div by only 7");
         }
         else
         {
            System.out.println("not div by 5 and 7 ");
         }

     }
}


//wap take a char from keyboard check char is upper lower digit sy




















/*
wap take elect bill from keyboad .monthly minium charge 30.
if use 
1 to 50  per unit  1
51 to 100  per unit 2
101 to 200 per unit 3
above 200  per unit 4
if amount>600 above extra 10%
*/
import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a unit ");
         int u=sc.nextInt();
         double amt;
         if(u==0)
         {
            amt=30;
         }
         else if(u<=50)
         {
            amt=30+u*1;
         }
         else if(u<=100)
         {
            amt=30+50+(u-50)*2;
         }
          else if(u<=200)
         {
            amt=30+50+100+(u-100)*3;
         }
         else
         {
            amt=30+50+100+300+(u-200)*4;
         }

         if(amt>=600)
         {
            amt=amt+amt*0.1;
         }
         System.out.println("total amount="+amt);
    }
}









//wap take two number form keyboad check both nos same 1st>2nd   2nd>1st

//wap find the area of shape 1.square 2.rectangle 3.circle

//wap take char from keyboad check char is uppercase lowercase digit  space sy

//wap take 5 mark from keyboad display  all mark totalmark avgmark 
mimum pass mark  30 
if avgmark>=90   0    if avgmark<90 and avg>=70   A grade   if avgmark<70 and avgmark>=50
B grade if avgmark<50 anfd avg>=30 C grade











else if ladder statement
_______
if(c1)
{
    
}
else if(c2)
    {

    }
else
    {

    }

where the condtion is true other condtion not checking.

class Test
{
    public static void main(String arg[])
    {
        int a=5;
        if(a>4)
        {
            System.out.println("A");
        }
        else if(a!=5)
        {
            System.out.println("B");
        }
        else if(a<7)
        {
           System.out.println("C");
        }
        else 
        {
            System.out.println("D");
        }
        System.out.println("E");
    }
}

o/p:
A
E

class Test
{
    public static void main(String arg[])
    {
        int a=5;
        if(a<4)
        {
            System.out.println("A");
        }
        else if(a!=5)
        {
            System.out.println("B");
        }
        else if(a<7)
        {
           System.out.println("C");
        }
        else 
        {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
o/p:
C
E


class Test
{
    public static void main(String arg[])
    {
        int a=5;
        if(a<4)
        
            System.out.println("A");
        
        else if(a!=5)
        
            System.out.println("B");

        
        else if(a<7)
        
           System.out.println("C");
        
        else 
        
            System.out.println("D");
        
        System.out.println("E");
    }
}
o/p:
C
E


//wap check  no is 0 +ve -ve using  else if ladder
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        if(no==0)
          System.out.println("zero");
        else if(no>0)
             System.out.println("+ve");
        else
            System.out.println("-ve"); 
    }
}
//wap take a number from keyboad check no is sd dd td and od
import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        if(no>0 &&no<10)
        {
          System.out.println("sd");
        }
        else if(no>9 && no<100)
        {
           System.out.println("dd");
        }
        else if(no>99 && no<1000)
        {
           System.out.println("td");
        }
        else
        {
           System.out.println("od ");
        }
    }
}
//another way

import   java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        //convert -ve to +ve
        if(no<0)
        {
          no=-no;
        }
        //check digit else if ladder
        if(no<10)     //if(no/10==0)
          System.out.println("sd");
        else if(no<100)  //else if(no/100==0)
             System.out.println("dd");
        else if(no<1000) //else if(no/1000==0)
            System.out.println("td"); 
        else
            System.out.println("od");
    }
}



/*wap take emp salary from keyboad if sal>=8000 da=50% hra=40%
if sal<8000  and sal>=5000 da=40% hra=30%  if sal<5000 and sal>=3000
da=30% hra=20%  if sal<3000  da=20% hra=10%  then display basic sal ,da ,hra  totalsal*/

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da,hra,total;
         if(sal>=8000)
         {
            da=sal*0.5;
            hra=sal*0.4;
         }
         else if(sal>=5000)
         {
               da=sal*0.4;
               hra=sal*0.3;
         }
         else if(sal>=3000)
         {
                 da=sal*0.3;
                 hra=sal*0.2;
         }
         else
         {
              da=sal*0.2;
              hra=sal*0.1;
         }
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);

     }
}

o/p:
C:\Users\DELL\Desktop>java Test
enter a salary
9000
basic sal=9000.0
da=4500.0
hra=3600.0
total=17100.0

C:\Users\DELL\Desktop>java Test
enter a salary
1000
basic sal=1000.0
da=200.0
hra=100.0
total=1300.0




//wap take two number from keyboad enter your choice 1.add 2.sub 3.mult 
//other number invalid choice  (menu driven program)
import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two number ");
         int no1=sc.nextInt();
         int no2=sc.nextInt();
         System.out.println("enter your choice\n1.add\n2.sub\n3.mult");
         int ch=sc.nextInt();
         if(ch==1)
         {
            System.out.println("sum="+(no1+no2));
         }
         else if(ch==2)
         {
            System.out.println("sub="+(no1-no2));
         }
         else if(ch==3)
         {
            System.out.println("mult="+no1*no2);
         }
         else
         {
            System.out.println("invalid choice ");
         }

     }
}

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
1
sum=50

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
3
mult=600

C:\Users\DELL\Desktop>java Test
enter two number
30
20
enter your choice
1.add
2.sub
3.mult
4
invalid choice

//wap take three no from keyboad display bigest number using else if ladder
import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter three numbers ");
         int no1=sc.nextInt();
         int no2=sc.nextInt();
         int no3=sc.nextInt();
         if(no1>=no2&&no1>=no3)
         {
           System.out.println("1st no="+no1+" is bigger");
         }
         else if(no2>=no3)
         {
         System.out.println("2nd  no="+no2+" is bigger");
         }
         else
         {
          System.out.println("3rd  no="+no3+" is bigger");
         }
}
}








//wap take a number form keyboad check no is div by 5 and 7  only 5  only 7
//not div by 5 and 7

import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number ");
         int no=sc.nextInt();
         if(no%35==0)
         {
            System.out.println("div by 5 and 7");
         }
         else if(no%5==0)
         {
            System.out.println("div by only 5");
         }
         else if(no%7==0)
         {
            System.out.println("div by only 7");
         }
         else
         {
            System.out.println("not div by 5 and 7 ");
         }

     }
}




/*
wap take elect bill from keyboad .monthly minium charge 30.
if use 
1 to 50  per unit  1
51 to 100  per unit 2
101 to 200 per unit 3
above 200  per unit 4
if amount>600 above extra 10%



*/
import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a unit ");
         int u=sc.nextInt();
         double amt;
         if(u==0)
         {
            amt=30;
         }
         else if(u<=50)
         {
            amt=30+u*1;
         }
         else if(u<=100)
         {
            amt=30+50+(u-50)*2;
         }
          else if(u<=200)
         {
            amt=30+50+100+(u-100)*3;
         }
         else
         {
            amt=30+50+100+300+(u-200)*4;
         }

         if(amt>=600)
         {
            amt=amt+amt*0.1;
         }
         System.out.println("total amount="+amt);
    }
}









//wap take two number form keyboad check both nos same 1st>2nd   2nd>1st

//wap find the area of shape 1.square 2.rectangle 3.circle

//wap take char from keyboad check char is uppercase lowercase digit  space sy

import java.util.*;
class Test
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a char ");
      char ch=sc.next().charAt(0);
      if(ch>='A'&&ch<='Z')
      {
      System.out.println("upper case");
      }
      else if(ch>='a'&&ch<='z')
      {
        System.out.println("lower case");
      }
      else if(ch>='0'&&ch<='9')
      {
       System.out.println("digit");
      }
      else
      {
        System.out.println("sy");
      }
    }
}


//wap take 5 mark from keyboad display  all mark totalmark avgmark 
mimum pass mark  30 
if avgmark>=90   0    if avgmark<90 and avg>=70   A grade   if avgmark<70 and avgmark>=50
B grade if avgmark<50 and avg>=30   C grade



switch case
_____


switch(expression)
{
    case label:stmt;break;
    case label:stmt;break;
    case label:stmt;break;
    .
    .
    default :stmt;
}

(1)switch case break default all are keyword.
(2)switch expression (integer,String,char,enum)  allow  both variable and constant
   not allow float double boolean
(3)case lable must be (integer,String,char,enum) constant
    not allow float double boolean  
(4)case label any order.
(5)what are the value generate switch expression match which case label that point to execute.


switch(3.5)  error
switch(true) error
switch(3)  valid


class Test
{
    public static void main(String arg[])
    {
          switch(3)
          {

          }
    }
}

o/p:
no error  no output

inside switch case default break all are optional.

class Test
{
    public static void main(String arg[])
    {
          switch(3)
          {
            case 3:System.out.println("hi");
          }
    }
}

o/p:
hi



class Test
{
    public static void main(String arg[])
    {
          switch(3)
          {
            case 2:System.out.println("A");
            case 3:System.out.println("B");
            case 1:System.out.println("C");
          }
    }
}

o/p:
B
C

break :
it is a keyword.it is used to prevent next case or outside switch block.
class Test
{
    public static void main(String arg[])
    {
          switch(3)
          {
            case 2:System.out.println("A");break;
            case 3:System.out.println("B");break;
            case 1:System.out.println("C");
          }

    }
}

o/p:
B



There is no case match no error no output
class Test
{
    public static void main(String arg[])
    {
          switch(4)
          {
            case 2:System.out.println("A");break;
            case 3:System.out.println("B");break;
            case 1:System.out.println("C");
          }
          
    }
}

o/p:
no output

default : 
if There is no case match default will execute

class Test
{
    public static void main(String arg[])
    {
          switch(4)
          {
            case 2:System.out.println("A");break;
            case 3:System.out.println("B");break;
            case 1:System.out.println("C");break;
            default :System.out.println("no match");
          }
    }
}

o/p:
no match

class Test
{
    public static void main(String arg[])
    {
          switch(4)
          {
             default :System.out.println("no match");
            case 2:System.out.println("A");break;
            case 3:System.out.println("B");break;
            case 1:System.out.println("C");
           
          }
    }
}

o/p:
no match
A


duplicate case not allow
class Test
{
    public static void main(String arg[])
    {
          switch(4)
          {
            
            case 2:System.out.println("A");break;
            
            case 2:System.out.println("C");
           
          }
    }
}

o/p:
error   duplicate case

class Test
{
    public static void main(String arg[])
    {
          switch(65)
          {
            
            case 65:System.out.println("hi");break;
            
            case 'A':System.out.println("bye");
           
          }
    }
}
o/p:
error
duplicate  case

switch 0 must be execute

class Test
{
    public static void main(String arg[])
    {
          switch(0)
          {
            
            case 0:System.out.println("zero");break;
           
          }
    }
}
o/p:
zero


//wap take  a number from keyboad check no is even or odd 
import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a number ");
          int no=sc.nextInt();
          switch(no%2)
          {
          case 0:System.out.println("even no");break;
          default :System.out.println("odd" no");
          }
  
     }
}



//wap take two number from keyboad enter your choice 1.add 2.sub 3.mult other option invalid choice  using switc case


import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter two nos");
          int no1=sc.nextInt();
          int no2=sc.nextInt();
          System.out.println("enter your choice\n1.add\n2.sub\n3.mult");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:System.out.println("sum="+(no1+no2));break;
         
           case 2: System.out.println("sub="+(no1-no2));break;
         
          case 3:  System.out.println("mult="+no1*no2);break;
         
          default:  System.out.println("invalid choice");
          }
          
     }
}






import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
        
          System.out.println("enter your choice\n1.square\n2.rectangle\n3.circle");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:

          System.out.println("enter square  side ");
          int s=sc.nextInt();
          System.out.println("area of square="+s*s);
          break;
         
           case 2: System.out.println("sub="+(no1-no2));break;
         
          case 3:  System.out.println("mult="+no1*no2);break;
         
          default:  System.out.println("invalid choice");
          }
          
     }
}


import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         double a=3.5;
         switch(a)
         {
          
          }
          
     }
}
o/p:
error


class Test
{
     public static void main(String arg[])
     {
         double a=3.5;
         switch((int)a)
         {
          case 3:System.out.println("hi");
          }
          
     }
}
o/p:
hi

all the case value and expression are same not write all case write last case

class Test
{
    public static void main(String arg[])
    {
      switch(2)
      {
        case 1:System.out.println("A");break;
         case 2:System.out.println("A");break;
        case 3:System.out.println("A");break;
        }
    }
}

or

class Test
{
    public static void main(String arg[])
    {
      switch(2)
      {
        case 1:
        case 2: 
        case 3:
        System.out.println("A");break;
       
        }
    }
}

o/p:
A

class Test
{
    public static void main(String arg[])
    {
      switch(2)
      {
        case 1:case 2:case 3: System.out.println("A");break;
       
        }
    }
}

or


class Test
{
    public static void main(String arg[])
    {
     int a=1,b=2,c=3;
      if(a==1||b==2||c==3)
      {
        System.out.println("A");break;
       
        }
    }
}






//wap take emp sal from keyoad if sal>=8000 da=30% hra=20% if sal<8000 and sal>=5000 da=20% hra=10%
if sal<5000 and sal>=3000  da=10% hra=5%  if sal<3000   da=5% hra=7% then display basic sal da hra and total sal


import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a basic sal ");
          double sal=sc.nextDouble();
          double da=0,hra=0,total=0;
         switch((int)sal/1000)
         {
          case 0:case 1:case 2:da=sal*0.05;hra=sal*0.07;break;
         case 3: case 4: da=sal*0.1;hra=sal*0.05;break;
         case 5: case 6:case 7:da=sal*0.2;hra=sal*0.1;break;
         default :
         da=sal*0.3;
         hra=sal*0.2;
          }
          total=sal+da+hra;
          System.out.println("basic sal="+sal);
           System.out.println("da="+da);
            System.out.println("hra="+hra);
             System.out.println("total sal="+total);
          
     }
}

enter a basic sal
10000
basic sal=10000.0
da=3000.0
hra=2000.0
total sal=15000.0

C:\Users\HP\Desktop>java Test
enter a basic sal
500
basic sal=500.0
da=25.0
hra=35.0
total sal=560.0

//wap take char form keyboad check char is alp  or not.
if alp check it is upper or lower
then check vowel or conso

import java.util.*;
class Test
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a char ");
      char ch=sc.next().charAt(0);
      if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
      {
          if(ch>='A'&&ch<='Z')
          {
          System.out.println("upper case");
          }
          else
          {
          System.out.println("lower case");
          }
          switch(ch)
          {
            case 'a':case 'A':case 'e':case 'E':
            case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':
            System.out.println("vowel");break;
            default :System.out.println("co");
          }

      }
      else
      {
       System.out.println("not alp");
      }
    }
}