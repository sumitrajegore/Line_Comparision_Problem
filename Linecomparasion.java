public class Linecomparasion 
{
       private final double x1;
       private final double y1;
       private final double x2;
       private final double y2;
	
       public Linecomparasion(x1, y1, x2, y2) {
              this.x1 = x1;
	      this.y1 = y1;
              this.x2 = x2;
	      this.y2 = y2;
       }
       public double computelength() {
              double Length_of_line = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
	      return Length_of_line;
       }
	public static void comparelength() {
		
                   Length_of_line = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
                   System.out.println("Length_of_line_1 : " + line1_length + "Length_of_line_2 : " + line2_length);
                   if (line1_length == line2_length)
	           System.out.println("both lines are equal, length is :" +line1_length);
	           else if (line1_length > line2_length)
	           System.out.println("length of line_1 is grether than length of line_2  :" + line1_length);
	           else 
		   System.out.println("length of line_1 is lesser than length of line_2  :" + line2_length);
	}
public static void main(String[] args) {
	
        System.out.println("----welcome to line comparasion problem----");
        Linecomparasion line1 = new Linecomparasion(1, 2, 3, 4);
        Linecomparasion line2 = new Linecomparasion(5, 6, 7, 8);
        double line1_length = line1.computelength(); 
	double line2_length = line2.computelength();
	comparelength(line1_length, line1_length);
	}
}

