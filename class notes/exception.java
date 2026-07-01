//Exception Handling
class exception{
	public static void main(String args[]){
	System.out.println("A");
	System.out.println("B");
	try{
	System.out.println(10/0);
	}
	catch(Exception e){
	System.out.println(e);
	//e.printStackTrace();
	System.out.println(e.getMessage());

	}
	System.out.println("Z");

	}
}
//checked:checked by compliler during compile time
//unchecked:Not chexked by compiler
//Exception handling
/*
Advantages
Prevents abnormal program termination.
Makes debugging easier.
Improves code readability and maintainability.
Enables graceful recovery from errors.
*/
