public class Linecomparasion {

	public static void main(String[] args) {

       int x1=0;
       int y1=0;
       int x2=4;
       int y2=3;
       double Length_of_line;
       System.out.println("Welcom to Line Comparison and Computation");
       Length_of_line = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
       System.out.println("distance between two point " + "("+x1+","+y1+"), " + "("+x2+","+y2+")"+"     "+Length_of_line);
       }
}
