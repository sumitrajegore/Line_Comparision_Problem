public class Linecomparasion {

	public static void main(String[] args) {

       int x1 = 1;
       int y1 = 2;
       int x2 = 4;
       int y2 = 3;
       double Length_of_line;
       System.out.println("Welcom to Line Comparison and Computation");
       Length_of_line = Math.sqrt( (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) );
       System.out.println("Length_of_line =" + "("+x1+","+y1+"), " + "("+x2+","+y2+")"+"     "+Length_of_line);
       }
}
