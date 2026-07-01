/*
*******
 *****
  ***
   *
*/
class pattern8{
	public static void main(String args[]){
		int i,j;
		for(i=4;i>=0;i--){
			for(j=0;j<4-i-1;j++){
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++){
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}