public class LineComparasion {
	
       private final double x1;
       private final double y1;
       private final double x2;
       private final double y2;
       public LineComparasion(double x1, double y1, double x2, double y2) {
                  this.x1 = x1;
	          this.y1 = y1;
                  this.x2 = x2;
	          this.y2 = y2;
       }
       public double computelength() {
    	   
                  double Length_of_line = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
	          return Length_of_line;
                  }
	   public static void comparelength(double line1_length, double line2_length) {
		   
                          System.out.println("Length_of_line_1 : " + line1_length + "\tLength_of_line_2 : " + line2_length);
                          if (line1_length == line2_length)
    	                            System.out.println("\nboth lines are equal, length is :" +line1_length);
                          else if (line1_length > line2_length)
                                    System.out.println("\nlength of line_1 is grether than length of line_2  :" + line1_length);
                          else 
                                    System.out.println("\nlength of line_1 is lesser than length of line_2  :" + line2_length);
                          }  
public static void main(String[] args) {
	
        System.out.println("\n----welcome to line comparasion problem----\n");
        LineComparasion line1 = new LineComparasion(1, 2, 3, 4);
        LineComparasion line2 = new LineComparasion(5, 7, 6, 8);
        double line1_length = line1.computelength(); 
	double line2_length = line2.computelength();
        comparelength(line1_length, line2_length);
	}
}

