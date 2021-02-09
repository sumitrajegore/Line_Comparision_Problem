public class Linecomparasion{

	public static void main(String[] args){

		System.out.println("Welcom to Line Comparison and Computation");

		 int x1=0;
       int y1=0;
       int x2=3;
       int y2=3;
       double dist;
       dist = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
       System.out.println("distancebetween" + "("+x1+","+y1+"), " + "("+x2+","+y2+")"  +  dist);
			// as x1,y1 equals, Output will be zero
			System.out.println(Integer.compare(x1, y1));
			System.out.println(Integer.compare(x2, y2));
        	System.out.println(x1 == y2);
      	System.out.println(x2 == y1);
	}
}

