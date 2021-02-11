public class Linecomparasion {

	public static void main(String[] args) {

       int x1 = 1, x3 = 5;
       int y1 = 2, x4 = 6;
       int x2 = 4, y3 = 7;
       int y2 = 3, y4 = 8;
       int Length_of_line1;
       int Length_of_line2;
       System.out.println("\n Welcom to Line Comparison and Computation \n");
       Length_of_line1 = (int) Math.sqrt( (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) );
       Length_of_line2 = (int) Math.sqrt( (x4-x3) * (x4-x3) + (y4-y3) * (y4-y3) );
       if (Length_of_line1 > Length_of_line2) {
           System.out.println("Length_of_line1 is grether than Length_of_line2 ");
       }
           else
       {
           System.out.println("Length_of_line1 is less than Length_of_line2 are ");
       }
}
}
