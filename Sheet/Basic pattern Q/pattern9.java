/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/
class Pattern9 {
    public static void main(String args[]) {

        int i, j;

        // Upper Pyramid
        for (i = 1; i <= 4; i++) {

            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Pyramid
        for (i = 4; i >= 1; i--) {

            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}